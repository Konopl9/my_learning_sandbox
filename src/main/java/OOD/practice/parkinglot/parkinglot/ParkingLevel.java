package OOD.practice.parkinglot.parkinglot;

import OOD.practice.parkinglot.parkinglot.parkingspot.ParkingSpot;
import OOD.practice.parkinglot.vehicle.Vehicle;
import OOD.practice.parkinglot.vehicle.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class ParkingLevel {
    int level;
    List<ParkingSpot> parkingSpots;

    public ParkingLevel(int level) {
        this.level = level;
        parkingSpots = new ArrayList<>();
        // let's say we have 2 for bus, 6 for cars and 2 for bike per level
        // Add 2 large spots for buses
        for (int i = 0; i < 2; i++) {
            parkingSpots.add(new ParkingSpot(level, i, VehicleType.SMALL));
        }

        // Add 6 medium spots for cars
        for (int i = 2; i < 8; i++) {
            parkingSpots.add(new ParkingSpot(level, i, VehicleType.MEDIUM));
        }

        // Add 2 small spots for bikes
        for (int i = 8; i < 10; i++) {
            parkingSpots.add(new ParkingSpot(level, i, VehicleType.LARGE));
        }
    }

    public ParkingSpot findAvailableSpot(Vehicle vehicle) {
        for(ParkingSpot spot : parkingSpots) {
            if(spot.canFitVehicle(vehicle)) {
                return spot;
            }
        }
        return null;
    }
}
