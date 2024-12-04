package OOD.patterns.factory.creator;

import OOD.patterns.factory.product.Sushi;
import OOD.patterns.factory.product.Food;

public class SushiRestaurant extends Restaurant {
    @Override
    public Food cookFood() {
        return new Sushi();
    }
}
