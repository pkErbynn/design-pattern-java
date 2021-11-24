package pk.erbynn.usingStateDesignPattern_2;

public interface IRemoteControl {
    public void pressSwitch(TV tv);
}

// the states are now classes
class On implements IRemoteControl {
    @Override
    public void pressSwitch(TV tv) {
        System.out.println("I am already on. Going to be OFF now.");
        tv.setState(new Off()); // when off, then set object state as param
    }
}

class Off implements IRemoteControl {
    @Override
    public void pressSwitch(TV tv) {
        System.out.println("I am already off. Going to be ON now.");
        tv.setState(new On());
    }
}
