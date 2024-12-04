package OOD.patterns.abstractfactory.factory;

import OOD.patterns.abstractfactory.product.Engine;
import OOD.patterns.abstractfactory.product.Tire;

public interface VehicleFactory {
    Engine createEngine();
    Tire createTire();
}
