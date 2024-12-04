package OOD.patterns.abstractfactory.product;

public class TruckTire implements Tire {
    @Override
    public void displayName() {
        System.out.println("Assembled " + getClass().getName());
    }
}
