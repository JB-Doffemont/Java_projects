package strgame.memento;

// Classe Memento pour enregistrer l'état d'un personnage
public class CharacterMemento {
    private int healthPoints;

    public CharacterMemento(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getState() {
        return healthPoints;
    }
}