package pk.erbynn.usingStateDesignPattern_2;

public class TV {
    // composite reference to the state
    private IRemoteControl remoteControlState;

    public TV(IRemoteControl remoteControlState) {  // ctor takes the init state
        this.remoteControlState = remoteControlState;
    }

    public void setState(IRemoteControl remoteControlState) {  // set the subsequent state
        this.remoteControlState = remoteControlState;
    }

    public IRemoteControl getRemoteControlState() {
        return remoteControlState;
    }

    // when tv is created and state is set, it is passed down to the remote control
    public void pressButton(){
        remoteControlState.pressSwitch(this);
    }
}
