package OOD.patterns.strategy;

public class CreditCardPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Payed by credit card" + amount);
    }
}
