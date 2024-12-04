package OOD.patterns.factory.product;

public class Pizza extends Food {
    @Override
    public void cook() {
        System.out.println("Cooking Pizza");
    }
}
