package challenge_2;

// the original object that needs to be saved and undo-ed
public class Originator {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }

    // save copy of this object's state
    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    public void restoreStateFromMemento (Memento memento) {
        // set data saved in memento store back to original state
        this.state = memento.getState();
    }

}

