package pk.erbynn.challenge_3;

public class MobileContext {
    private IMobileAlertState mobileState;  // ref to state

    // default state
    public MobileContext() {
    this.mobileState = new Vibration();
    }

    // alert default state setting
//    public Mobile(IMobileAlertState mobileState) {
//        this.mobileState = mobileState;
//    }

    public void setMobileState(IMobileAlertState mobileState) {
        this.mobileState = mobileState;
    }

    public IMobileAlertState getMobileState() {
        return mobileState;
    }

    // the gist: perform diff actions at runtime based on the state, through polymorphism
    // used by client
    public void alert(){
        mobileState.alert();
//        mobileState.alert(this);
    }
}
