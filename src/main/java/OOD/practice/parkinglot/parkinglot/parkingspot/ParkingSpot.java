package OOD.practice.parkinglot.parkinglot.parkingspot;

import OOD.practice.parkinglot.vehicle.Vehicle;

public abstract class ParkingSpot {
    private final int spotNumber;
    private final ParkingSpotType parkingSpotType;
    private Vehicle vehicle;
    private boolean isOccupied;

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

    public boolean isAvailable() {
        return !isOccupied;
    }

    public ParkingSpotType getParkingSpotType() {
        return parkingSpotType;
    }

    @Override
    public String toString() {
        return "ParkingSpot{" +
                "spotNumber=" + spotNumber +
                ", parkingSpotType=" + parkingSpotType +
                ", vehicle=" + vehicle +
                '}';
    }
}
