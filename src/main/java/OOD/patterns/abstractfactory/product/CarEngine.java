package OOD.patterns.abstractfactory.product;

public class CarEngine implements Engine {
    @Override
    public void displayName() {
        System.out.println("Assembled " + getClass().getName());
    }
}
