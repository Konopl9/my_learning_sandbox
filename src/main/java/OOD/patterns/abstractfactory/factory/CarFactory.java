package OOD.patterns.abstractfactory.factory;

import OOD.patterns.abstractfactory.product.CarEngine;
import OOD.patterns.abstractfactory.product.CarTire;
import OOD.patterns.abstractfactory.product.Engine;
import OOD.patterns.abstractfactory.product.Tire;

public class CarFactory implements VehicleFactory {
    @Override
    public Engine createEngine() {
        return new CarEngine();
    }

    @Override
    public Tire createTire() {
        return new CarTire();
    }
}
