package challenge_2;

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("State #1");
        originator.setState("State #2");
        caretaker.save(originator.saveStateToMemento());

        originator.setState("State #3");
        caretaker.save(originator.saveStateToMemento());

        // not saved
        originator.setState("State #4");
        System.out.println("Current state: " + originator.getState());

        // restoring based on saved index
        originator.restoreStateFromMemento(caretaker.restore(0));
        System.out.println("\nFirst saved state: " + originator.getState());

        originator.restoreStateFromMemento(caretaker.restore(1));
        System.out.println("Second saved state: " + originator.getState());
    }
}
