package OOD;

import OOD.practice.parkinglot.ParkingLot;
import OOD.practice.parkinglot.parkinglot.ParkingFloor;
import OOD.practice.parkinglot.vehicle.Car;

public class Client {
    public static void main(String[] args) {
        ParkingFloor parkingFloor = ParkingLot.addFlor();
        ParkingLot.addEntrance(parkingFloor);
        ParkingLot.addExit(parkingFloor);
        ParkingLot.getAvailableSlot(new Car("AAAAAA"));

    }
}
