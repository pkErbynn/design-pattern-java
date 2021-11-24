package pk.erbynn.challenge_3;

interface IMobileAlertState {
    public void alert();
    // public void alert(MobileContext mobile); // when state need to be changed to another state, after completion of every diff alert action
}

// perform diff alert actions based on the state

class Vibration implements IMobileAlertState {
    @Override
    public void alert() {
        System.out.println("Vibration mode: doing something...");
    }

    // changing state after completion
//    public void alert(MobileContext mobile) {
//        System.out.println("Vibration mode: doing something...");
//        mobile.setMobileState(new Vibration());
//    }
}

class Silence implements IMobileAlertState {
    @Override
    public void alert() {
        System.out.println("Silence mode: doing something...");
    }

//    public void alert(MobileContext mobile) {
//        System.out.println("Silence mode: doing something...");
//        mobile.setMobileState(new Silence());
//    }
}