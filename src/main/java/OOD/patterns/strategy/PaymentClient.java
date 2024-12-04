package OOD.patterns.strategy;

public class PaymentClient {
    private final PaymentStrategy paymentStrategy;

    public PaymentClient(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void executePayment(double amount) {
        paymentStrategy.pay(amount);
    }

    public static void main(String[] args) {
        PaymentClient paymentClient = new PaymentClient(new BitcoinPayment());
        paymentClient.executePayment(250 );
    }
}
