package org.mage.test.player;

import mage.constants.Outcome;
import mage.constants.RangeOfInfluence;
import mage.game.Game;
import mage.player.ai.ComputerPlayer7;
import mage.target.Target;

import java.util.UUID;

/**
 * Copy paste methods from TestComputerPlayer, see docs in there
 *
 * @author JayDi85
 */

public class TestComputerPlayer7 extends ComputerPlayer7 {

    private TestPlayer testPlayerLink;

    public TestComputerPlayer7(String name, RangeOfInfluence range, int skill) {
        super(name, range, skill);
    }

    public void setTestPlayerLink(TestPlayer testPlayerLink) {
        this.testPlayerLink = testPlayerLink;
    }

    @Override
    public boolean choose(Outcome outcome, Target target, UUID sourceId, Game game) {
        return testPlayerLink.choose(outcome, target, sourceId, game);
    }

    @Override
    public boolean flipCoinResult(Game game) {
        return testPlayerLink.flipCoinResult(game);
    }
}
