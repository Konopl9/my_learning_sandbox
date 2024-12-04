package OOD.patterns.abstractfactory.product;

public class CarTire implements Tire {
    @Override
    public void displayName() {
        System.out.println("Assembled " + getClass().getName());
    }
}
