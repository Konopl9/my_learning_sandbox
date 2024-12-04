package OOD.patterns.decorator;

public class Sugar extends AddonsDecorator {
    Beverage beverage;

    public Sugar(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    int getCost() {
        return beverage.getCost() + 2;
    }
}
