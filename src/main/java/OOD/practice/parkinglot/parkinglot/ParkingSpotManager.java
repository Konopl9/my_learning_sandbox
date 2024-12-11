package OOD.practice.parkinglot.parkinglot;

import OOD.practice.parkinglot.exception.UnknownVehicleType;
import OOD.practice.parkinglot.parkinglot.parkingspot.ParkingSpotType;
import OOD.practice.parkinglot.vehicle.Vehicle;
import OOD.practice.parkinglot.vehicle.VehicleType;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ParkingSpotManager {
    private final Map<VehicleType, Set<ParkingSpotType>> vehicleToParkingSpot = new HashMap<>();

    public ParkingSpotManager() {
        initializeMapping();
    }

    public Set<ParkingSpotType> canParkOnSpots(Vehicle vehicle) {
        if (vehicle == null) {
            throw new IllegalArgumentException("Parking spot / Vehicle can't be null");
        }
        if (!vehicleToParkingSpot.containsKey(vehicle.getVehicleType())) {
            throw new UnknownVehicleType("Unknown vehicle type");
        }
        return vehicleToParkingSpot.get(vehicle.getVehicleType());
    }

    private void initializeMapping() {
        vehicleToParkingSpot.put(VehicleType.MOTORBIKE, Set.of(ParkingSpotType.MOTORBIKE, ParkingSpotType.CAR, ParkingSpotType.LARGE));
        vehicleToParkingSpot.put(VehicleType.CAR, Set.of(ParkingSpotType.CAR, ParkingSpotType.LARGE));
        vehicleToParkingSpot.put(VehicleType.LARGE, Set.of(ParkingSpotType.LARGE));
        vehicleToParkingSpot.put(VehicleType.HANDICAPPED, Set.of(ParkingSpotType.HANDICAPPED));
    }
}
