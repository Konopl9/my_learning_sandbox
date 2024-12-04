package OOD.patterns.strategy;

public class PaypalPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Payed by paypal" + amount);
    }
}
