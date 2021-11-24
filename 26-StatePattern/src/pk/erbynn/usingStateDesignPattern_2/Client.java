package pk.erbynn.usingStateDesignPattern_2;

// Domain: Remote being used to change state(ON/OFF) of TV

public class Client {
    public static void main(String[] args) {
        System.out.println("*** State Pattern Demo ***");

        // initially tv is off
        Off initialState = new Off();

        TV tv = new TV(initialState);

        // first time press
        tv.pressButton();
        // second time press
        tv.pressButton();
    }
}
