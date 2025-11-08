package notifications.bad;

// Req 2: Specific Notification

class Notifier {
    public void send(String message) {
        System.out.println("EMAIL notification: " + message);
    }
}

public class Application {
    private Notifier notifier;

    public void setNotifier(Notifier notifier) {
        this.notifier = notifier;
    }

    public void doSomething() {
        notifier.send("some message");
    }

    public static void main(String[] args) {
        Application app = new Application();
        app.setNotifier(new Notifier()); // or new SMSNotifier(), etc. for Req 2
        app.doSomething();
    }
}

// Req 2: Adopting to multiple notications

class SMSNotifier extends Notifier {
    @Override
    public void send(String message) {
        System.out.println("SMS notification: " + message);
    }
}

class FacebookNotifier extends Notifier {
    @Override
    public void send(String message) {
        System.out.println("Facebook notification: " + message);
    }
}

class SlackNotifier extends Notifier {
    @Override
    public void send(String message) {
        System.out.println("Slack notification: " + message);
    }
}
