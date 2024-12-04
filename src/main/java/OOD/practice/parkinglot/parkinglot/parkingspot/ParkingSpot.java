package OOD.practice.parkinglot.parkinglot.parkingspot;

import OOD.practice.parkinglot.vehicle.Vehicle;

public abstract class ParkingSpot {
    final int spotNumber;
    final ParkingSpotType parkingSpotType;
    Vehicle vehicle;
    boolean isOccupied;

    public ParkingSpot(int spotNumber, ParkingSpotType parkingSpotType) {
        this.spotNumber = spotNumber;
        this.parkingSpotType = parkingSpotType;
        this.vehicle = null;
        this.isOccupied = false;
    }

    public void parkVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        this.isOccupied = true;
    }

    public void unParkVehicle() {
        this.vehicle = null;
        this.isOccupied = false;
    }

    public ParkingSpotType getParkingSpotType() {
        return parkingSpotType;
    }
}
