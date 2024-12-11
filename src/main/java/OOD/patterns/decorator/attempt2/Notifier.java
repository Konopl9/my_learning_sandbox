package OOD.patterns.decorator.attempt2;

class Client {
    public static void main(String[] args) {
        Notifier notifier = new Telegram(new WhatsApp(new BaseNotifier()));
        notifier.exec();
    }
}

interface Notifier {
    void exec();
}

class BaseNotifier implements Notifier {
    @Override
    public void exec() {
        System.out.println("All good!");
    }
}

class WhatsApp implements Notifier {
    Notifier notifier;

    public WhatsApp(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void exec() {
        notifier.exec();
        System.out.println("Sending Whats App message");
    }
}

class Telegram implements Notifier {
    Notifier notifier;

    public Telegram(Notifier notifier) {
        this.notifier = notifier;
    }

    @Override
    public void exec() {
        notifier.exec();
        System.out.println("Sending Telegram message");
    }
}
