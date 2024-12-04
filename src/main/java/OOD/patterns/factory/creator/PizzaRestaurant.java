package OOD.patterns.factory.creator;

import OOD.patterns.factory.product.Pizza;
import OOD.patterns.factory.product.Food;

public class PizzaRestaurant extends Restaurant {
    @Override
    public Food cookFood() {
        return new Pizza();
    }
}
