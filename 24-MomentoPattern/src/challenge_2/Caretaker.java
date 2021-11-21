package challenge_2;

import java.util.ArrayList;
import java.util.List;

// responsible for saving the versions of original objects
public class Caretaker {
    private List<Memento> mementos = new ArrayList<>();

    public void save(Memento memento) {
        mementos.add(memento);
    }

    public Memento restore(int i) {
        return mementos.get(i);
    }
}
