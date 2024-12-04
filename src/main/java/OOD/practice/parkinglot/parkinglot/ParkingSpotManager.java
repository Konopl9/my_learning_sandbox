package OOD.practice.parkinglot.parkinglot;

import OOD.practice.parkinglot.exception.UnknownVehicleType;
import OOD.practice.parkinglot.parkinglot.parkingspot.ParkingSpot;
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

    public boolean canPark(Vehicle vehicle, ParkingSpot parkingSpot) {
        if(vehicle == null || parkingSpot == null) {
            throw new IllegalArgumentException("Parking spot / Vehicle can't be null");
        }
        if (!vehicleToParkingSpot.containsKey(vehicle.getVehicleType())) {
            throw new UnknownVehicleType("Unknown vehicle type");
        }
        Set<ParkingSpotType> spotTypes = vehicleToParkingSpot.get(vehicle.getVehicleType());
        return spotTypes.contains(parkingSpot.getParkingSpotType());
    }

    private void initializeMapping() {
        vehicleToParkingSpot.put(VehicleType.MOTORBIKE, Set.of(ParkingSpotType.MOTORBIKE, ParkingSpotType.CAR, ParkingSpotType.LARGE));
        vehicleToParkingSpot.put(VehicleType.CAR, Set.of(ParkingSpotType.CAR, ParkingSpotType.LARGE));
        vehicleToParkingSpot.put(VehicleType.LARGE, Set.of(ParkingSpotType.LARGE));
        vehicleToParkingSpot.put(VehicleType.HANDICAPPED, Set.of(ParkingSpotType.HANDICAPPED));
    }
}
