package OOD.patterns.decorator;

public class Milk extends AddonsDecorator {
    Beverage beverage;

    public Milk(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    int getCost() {
        return beverage.getCost() + 5;
    }
}
