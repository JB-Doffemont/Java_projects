package strgame.state;

import strgame.STRCharacter;
import strgame.strategy.AggressiveBehavior;
import strgame.strategy.FleeBehavior;

// Classe concrète pour un état spécifique
public class NormalState implements State {
    public void doAction(STRCharacter context) {
        System.out.println("Personnage en état normal");
        context.setState(this);

        context.setCombatBehavior(new AggressiveBehavior());
        context.performCombat();
    }
}