package challenge_2;

public class Memento {  // not private, unlike the other example
    private String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
