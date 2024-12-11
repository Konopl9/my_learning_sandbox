package OOD.practice.parkinglot.parkinglot;

import OOD.practice.parkinglot.exception.AvailableSpotNotFoundException;
import OOD.practice.parkinglot.parkinglot.parkingspot.*;
import OOD.practice.parkinglot.vehicle.Vehicle;

import java.util.*;

public class ParkingFloor {
    private final int floorNumber;
    private final Map<ParkingSpotType, Deque<ParkingSpot>> parkingSpots;
    private final ParkingSpotManager parkingSpotManager;

    public ParkingFloor(int floorNumber) {
        this.floorNumber = floorNumber;
        this.parkingSpots = new HashMap<>();
        this.parkingSpotManager = new ParkingSpotManager();
        initializeBaseSpots();
    }

    private void initializeBaseSpots() {
        // at the begining each flor has 1 spot of each type
        Deque<ParkingSpot> carParkingSpots = new ArrayDeque<>();
        carParkingSpots.add(new CarParkingSpot(1));
        parkingSpots.put(ParkingSpotType.CAR, carParkingSpots);

        Deque<ParkingSpot> handicappedParkingSpots = new ArrayDeque<>();
        handicappedParkingSpots.add(new HandicappedParkingSpot(2));
        parkingSpots.put(ParkingSpotType.HANDICAPPED, handicappedParkingSpots);

        Deque<ParkingSpot> motorbikeParkingSpots = new ArrayDeque<>();
        motorbikeParkingSpots.add(new MotorbikeParkingSpot(3));
        parkingSpots.put(ParkingSpotType.MOTORBIKE, motorbikeParkingSpots);

        Deque<ParkingSpot> largeVehicleParkingSpots = new ArrayDeque<>();
        largeVehicleParkingSpots.add(new LargeVehicleParkingSpot(4));
        parkingSpots.put(ParkingSpotType.LARGE, largeVehicleParkingSpots);
    }

    public ParkingSpot allocateSpot(Vehicle vehicle) {
        Set<ParkingSpotType> spotsTypeForVehicle = parkingSpotManager.canParkOnSpots(vehicle);

        ParkingSpot parkingSpot = null;
        for (ParkingSpotType parkingSpotType : spotsTypeForVehicle) {
            Queue<ParkingSpot> spotQueue = parkingSpots.get(parkingSpotType);
            if (!spotQueue.isEmpty()) {
                parkingSpot = spotQueue.poll();
                break;
            }
        }

        if (parkingSpot == null) {
            throw new AvailableSpotNotFoundException("We currently don't have a spot for " + vehicle.getVehicleType());
        }

        return parkingSpot;
    }

    public void deAllocateSpot(Vehicle vehicle) {
        ParkingSpot parkingSpot = vehicle.getParkingSpot();
        parkingSpot.unParkVehicle();
        parkingSpots.get(parkingSpot.getParkingSpotType()).add(vehicle.getParkingSpot());
    }
}
