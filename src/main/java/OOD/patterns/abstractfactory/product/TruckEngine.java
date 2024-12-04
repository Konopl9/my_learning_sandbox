package OOD.patterns.abstractfactory.product;

public class TruckEngine implements Engine{
    @Override
    public void displayName() {
        System.out.println("Assembled " + getClass().getName());
    }
}
