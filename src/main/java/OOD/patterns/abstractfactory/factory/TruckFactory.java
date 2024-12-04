package OOD.patterns.abstractfactory.factory;

import OOD.patterns.abstractfactory.product.Engine;
import OOD.patterns.abstractfactory.product.Tire;
import OOD.patterns.abstractfactory.product.TruckEngine;
import OOD.patterns.abstractfactory.product.TruckTire;

public class TruckFactory implements VehicleFactory {
    @Override
    public Engine createEngine() {
        return new TruckEngine();
    }

    @Override
    public Tire createTire() {
        return new TruckTire();
    }
}
