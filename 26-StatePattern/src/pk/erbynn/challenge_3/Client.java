package pk.erbynn.challenge_3;

// domain: using state design pattern that simulate vibration and silence in mobile phone

public class Client {
    public static void main(String[] args) {

        // phone's state
        IMobileAlertState silence = new Silence();
        IMobileAlertState vibration = new Vibration();

        // initial state
        MobileContext mobile = new MobileContext();

        mobile.alert();
        mobile.alert();
        mobile.alert();

        // change state
        mobile.setMobileState(silence);

        mobile.alert();
        mobile.alert();

        // change state again
        mobile.setMobileState(vibration);

        mobile.alert();
    }
}
