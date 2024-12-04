package OOD.patterns.strategy;

public class BitcoinPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Payed with BTC" + amount);
    }
}
