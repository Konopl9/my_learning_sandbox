package OOD.practice.parkinglot.parkinglot;

import OOD.practice.parkinglot.parkinglot.parkingspot.ParkingSpot;
import OOD.practice.parkinglot.vehicle.LargeVehicle;
import OOD.practice.parkinglot.vehicle.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private final List<ParkingLevel> levels;

    public ParkingLot() {
        this.levels = new ArrayList<>();
        ParkingLevel firstLevel = new ParkingLevel(1);
        ParkingLevel secondLevel = new ParkingLevel(2);
        ParkingLevel thirdLevel = new ParkingLevel(3);

        levels.add(firstLevel);
        levels.add(secondLevel);
        levels.add(thirdLevel);
    }

    public String parkVehicle(Vehicle vehicle) {
        for (ParkingLevel level : levels) {
            if(level.findAvailableSpot(vehicle) != null) {
                ParkingSpot availableSpot = level.findAvailableSpot(vehicle);
                availableSpot.parkVehicle(vehicle);
                return "Parked!";
            }
        }
        return "No available spots!";
    }

    public void unParkVehicle(Vehicle vehicle) {
        vehicle.getParkingSpot().unParkVehicle();
    }

    public static void main(String[] args) {
        ParkingLot parkingLot = new ParkingLot();

        for(int i = 0; i < 100; i++) {
            if(i % 10 == 0) {
                parkingLot.levels.get(0).parkingSpots.get(0).unParkVehicle();

            }
            Vehicle bus = new LargeVehicle("AAA" + i);
            System.out.println(parkingLot.parkVehicle(bus));
        }
    }
}
