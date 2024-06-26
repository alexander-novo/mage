package mage.cards.t;

import mage.abilities.common.AttacksAloneControlledTriggeredAbility;
import mage.abilities.effects.common.ExileTopXMayPlayUntilEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.Duration;

import java.util.UUID;

/**
 * @author TheElk801
 */
public final class TemperedInSolitude extends CardImpl {

    public TemperedInSolitude(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.ENCHANTMENT}, "{1}{R}");

        // Whenever a creature you control attacks alone, exile the top card of your library. You may play that card this turn.
        this.addAbility(new AttacksAloneControlledTriggeredAbility(new ExileTopXMayPlayUntilEffect(1, Duration.EndOfTurn)));
    }

    private TemperedInSolitude(final TemperedInSolitude card) {
        super(card);
    }

    @Override
    public TemperedInSolitude copy() {
        return new TemperedInSolitude(this);
    }
}
