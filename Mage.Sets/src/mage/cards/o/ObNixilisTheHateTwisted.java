package mage.cards.o;

import mage.abilities.Ability;
import mage.abilities.LoyaltyAbility;
import mage.abilities.common.DrawCardOpponentTriggeredAbility;
import mage.abilities.effects.common.DamageTargetEffect;
import mage.abilities.effects.common.DestroyTargetEffect;
import mage.abilities.effects.common.DrawCardTargetControllerEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.constants.SuperType;
import mage.target.common.TargetCreaturePermanent;

import java.util.UUID;

/**
 * @author TheElk801
 */
public final class ObNixilisTheHateTwisted extends CardImpl {

    public ObNixilisTheHateTwisted(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.PLANESWALKER}, "{3}{B}{B}");

        this.supertype.add(SuperType.LEGENDARY);
        this.subtype.add(SubType.NIXILIS);
        this.setStartingLoyalty(5);

        // Whenever an opponent draws a card, Ob Nixilis, the Hate-Twisted deals 1 damage to that player.
        this.addAbility(new DrawCardOpponentTriggeredAbility(new DamageTargetEffect(
                1, true, "that player"
        ), false, true));

        // -2: Destroy target creature. Its controller draws two cards.
        Ability ability = new LoyaltyAbility(new DestroyTargetEffect(), -2);
        ability.addTarget(new TargetCreaturePermanent());
        ability.addEffect(new DrawCardTargetControllerEffect(2));
        this.addAbility(ability);
    }

    private ObNixilisTheHateTwisted(final ObNixilisTheHateTwisted card) {
        super(card);
    }

    @Override
    public ObNixilisTheHateTwisted copy() {
        return new ObNixilisTheHateTwisted(this);
    }
}
