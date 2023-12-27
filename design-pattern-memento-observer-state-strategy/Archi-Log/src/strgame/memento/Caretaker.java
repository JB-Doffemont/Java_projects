package strgame.memento;

import java.util.ArrayList;
import java.util.List;
// Classe Caretaker pour gérer les mementos
public class Caretaker {
    private List<CharacterMemento> mementoList = new ArrayList<>();

    public void addMemento(CharacterMemento m) {
        mementoList.add(m);
    }

    public CharacterMemento getMemento(int index) {
        return mementoList.get(index);
    }

}