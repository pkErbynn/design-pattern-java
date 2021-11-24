package pk.erbynn.basic_1;

// usually, one will implement a state pattern like this

public class TVRemoteCommonStatePattern {
    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public void doSomething(){
        if (this.state.equalsIgnoreCase("ON")) {
            System.out.println("TV is turned ON");
        } else if (this.state.equalsIgnoreCase("OFF")) {
            System.out.println("TV is turned OFF");
        }
    }

    public static void main(String[] args) {
        TVRemoteCommonStatePattern remote = new TVRemoteCommonStatePattern();

        remote.setState("ON");
        remote.doSomething();

        remote.setState("OFF");
        remote.doSomething();
    }
}
