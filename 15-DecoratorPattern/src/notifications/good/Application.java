package notifications.good;

// Req 3: Combination to multiple notications, aside email, add other notications

public interface INotifier {
    void send(String message);
}

public abstract class BaseNotifierDecorator implements INotifier {
    protected final INotifier wrappee;

    protected BaseNotifierDecorator(INotifier wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void send(String message) {
        wrappee.send(message); // delegate to wrapped component
    }
}

public class SMSNotifier extends BaseNotifierDecorator {
    public SMSNotifier(INotifier wrappee) {
        super(wrappee);
    }

    @Override
    public void send(String message) {
        super.send(message); // keep previous behavior
        System.out.println("SMS notification: " + message);
    }
}

public class SlackNotifier extends BaseNotifierDecorator {
    public SlackNotifier(INotifier wrappee) {
        super(wrappee);
    }

    @Override
    public void send(String message) {
        super.send(message);
        System.out.println("SLACK notification: " + message);
    }
}

public class EmailNotifier implements INotifier {    // email is the base and doesn't have 
    @Override
    public void send(String message) {
        System.out.println("EMAIL notification: " + message);
    }
}


public class Application {
    private INotifier notifier;

    void doSomething() {
        // Compose: Email -> SMS -> Slack (order matters)
        notifier = new SlackNotifier(
                      new SMSNotifier(
                          new EmailNotifier()));    // just like the Russion doll img

        notifier.send("some message");
    }

    public static void main(String[] args) {
        new Application().doSomething();
    }
}
