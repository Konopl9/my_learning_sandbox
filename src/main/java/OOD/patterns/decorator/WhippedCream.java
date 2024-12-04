package OOD.patterns.decorator;

public class WhippedCream extends AddonsDecorator {
    Beverage beverage;

    public WhippedCream(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    int getCost() {
        return beverage.getCost() + 10;
    }
}
