package OOD.patterns.decorator;

public class Main {
    public static void main(String[] args) {
        Beverage beverage = new Milk(new Sugar(new Coffee()));
        System.out.println(beverage.getCost());
    }
}
