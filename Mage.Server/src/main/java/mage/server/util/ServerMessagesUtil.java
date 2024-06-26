package mage.server.util;

import mage.utils.StreamUtils;
import org.apache.log4j.Logger;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Handles server messages (Messages of the Day). Reloads messages every 5
 * minutes.
 *
 * @author nantuko
 */
public enum ServerMessagesUtil {
    instance;

    private static final Logger LOGGER = Logger.getLogger(ServerMessagesUtil.class);
    private static final String SERVER_MSG_TXT_FILE = "server.msg.txt";
    private static final int SERVER_MSG_REFRESH_RATE_SECS = 60;

    private final List<String> messages = new ArrayList<>();
    private final ReadWriteLock lock = new ReentrantReadWriteLock();
    private static boolean ignore = false;

    private static long startDate;
    private static final AtomicInteger gamesStarted = new AtomicInteger(0);
    private static final AtomicInteger gamesEnded = new AtomicInteger(0);
    private static final AtomicInteger tournamentsStarted = new AtomicInteger(0);
    private static final AtomicInteger tournamentsEnded = new AtomicInteger(0);
    private static final AtomicInteger lostConnection = new AtomicInteger(0); // bad connections only
    private static final AtomicInteger reconnects = new AtomicInteger(0);

    ServerMessagesUtil() {
        ScheduledExecutorService updateExecutor = Executors.newSingleThreadScheduledExecutor();
        updateExecutor.scheduleAtFixedRate(this::reloadMessages, 5, SERVER_MSG_REFRESH_RATE_SECS, TimeUnit.SECONDS);
    }

    public List<String> getMessages() {
        lock.readLock().lock();
        try {
            return messages;
        } finally {
            lock.readLock().unlock();
        }
    }

    private void reloadMessages() {
        LOGGER.debug("Reading server messages...");
        List<String> motdMessages = readFromFile();
        List<String> newMessages = new ArrayList<>(motdMessages);
        newMessages.add(getServerStatistics());

        lock.writeLock().lock();
        try {
            messages.clear();
            messages.addAll(newMessages);
        } finally {
            lock.writeLock().unlock();
        }
    }

    private List<String> readFromFile() {
        if (ignore) {
            return Collections.emptyList();
        }

        InputStream is = null;
        File file = new File(SERVER_MSG_TXT_FILE);
        if (!file.exists() || !file.canRead()) {
            // warn user about miss messages file, except dev environment
            if (!file.getAbsolutePath().contains("Mage.Server")) {
                LOGGER.warn("Couldn't find server messages file using path: " + file.getAbsolutePath());
            }
        } else {
            try {
                is = new FileInputStream(file);
                ignore = false;
            } catch (Exception f) {
                LOGGER.error(f, f);
                ignore = true;
            }
        }

        if (is == null) {
            return Collections.emptyList();
        }

        List<String> newMessages = new ArrayList<>();
        try (Scanner scanner = new Scanner(is)) {
            while (scanner.hasNextLine()) {
                String message = scanner.nextLine().trim();
                if (message.startsWith("//") || message.isEmpty()) {
                    continue;
                }
                newMessages.add(message.trim());
            }
        } catch (Exception e) {
            LOGGER.error(e.getMessage(), e);
        } finally {
            StreamUtils.closeQuietly(is);
        }
        return newMessages;
    }

    private String getServerStatistics() {
        long current = System.currentTimeMillis();
        long hours = ((current - startDate) / (1000 * 60 * 60));
        String updated = new Date().toInstant().atOffset(ZoneOffset.UTC).toLocalDateTime().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        return String.format("Server uptime: %d hours; active games: %d of %d, tourneys: %d of %d; stats from %s",
                hours,
                gamesStarted.get() - gamesEnded.get(),
                gamesStarted.get(),
                tournamentsStarted.get() - tournamentsEnded.get(),
                tournamentsStarted.get(),
                updated
        );
    }

    public void setStartDate(long milliseconds) {
        startDate = milliseconds;
    }

    public void incGamesStarted() {
        int value;
        do {
            value = gamesStarted.get();
        } while (!gamesStarted.compareAndSet(value, value + 1));
    }

    public void incGamesEnded() {
        int value;
        do {
            value = gamesEnded.get();
        } while (!gamesEnded.compareAndSet(value, value + 1));
    }

    public void incTournamentsStarted() {
        int value;
        do {
            value = tournamentsStarted.get();
        } while (!tournamentsStarted.compareAndSet(value, value + 1));
    }

    public void incTournamentsEnded() {
        int value;
        do {
            value = tournamentsEnded.get();
        } while (!tournamentsEnded.compareAndSet(value, value + 1));
    }

    public void incReconnects() {
        int value;
        do {
            value = reconnects.get();
        } while (!reconnects.compareAndSet(value, value + 1));
    }

    public void incLostConnection() {
        int value;
        do {
            value = lostConnection.get();
        } while (!lostConnection.compareAndSet(value, value + 1));
    }

}
