package OOD.patterns.abstractfactory;

import OOD.patterns.abstractfactory.factory.CarFactory;
import OOD.patterns.abstractfactory.factory.VehicleFactory;
import OOD.patterns.abstractfactory.product.Tire;

public class Main {
    public static void main(String[] args) {
        VehicleFactory carF = new CarFactory();
        Tire tire = carF.createTire();

    }
}
