package OOD.patterns.factory;

import OOD.patterns.factory.creator.PizzaRestaurant;
import OOD.patterns.factory.creator.Restaurant;
import OOD.patterns.factory.creator.SushiRestaurant;
import OOD.patterns.factory.product.Food;

public class Main {
    public static void main(String[] args) {
        Restaurant pizzaRest = new PizzaRestaurant();
        Restaurant sushiRestaurant = new SushiRestaurant();
        Food pizza = pizzaRest.cookFood();
        Food sushi = sushiRestaurant.cookFood();
        pizza.cook();
        sushi.cook();
    }
}
