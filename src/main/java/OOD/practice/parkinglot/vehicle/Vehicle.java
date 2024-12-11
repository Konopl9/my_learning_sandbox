package OOD.practice.parkinglot.vehicle;

import OOD.practice.parkinglot.parkinglot.parkingspot.ParkingSpot;

public abstract class Vehicle {
    private final String licensePlate;
    private final VehicleType vehicleType;
    private ParkingSpot parkingSpot;

    public Vehicle(String licensePlate, VehicleType vehicleType) {
        this.licensePlate = licensePlate;
        this.vehicleType = vehicleType;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }
}
