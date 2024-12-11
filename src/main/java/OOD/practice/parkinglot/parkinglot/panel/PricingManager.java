package OOD.practice.parkinglot.parkinglot.panel;

import OOD.practice.parkinglot.parkinglot.parkingspot.ParkingSpotType;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

public class PricingManager {
    private final Map<ParkingSpotType, Double> spotTypePrices;

    public PricingManager() {
        spotTypePrices = new HashMap<>();
        initializePrices();
    }

    private void initializePrices() {
        spotTypePrices.put(ParkingSpotType.CAR, 10.0);
        spotTypePrices.put(ParkingSpotType.HANDICAPPED, 8.0);
        spotTypePrices.put(ParkingSpotType.MOTORBIKE, 5.0);
        spotTypePrices.put(ParkingSpotType.LARGE, 15.0);
    }

    public double calculatePrice(ParkingSpotType parkingSpotType, LocalDateTime entranceTime) {
        Duration duration = Duration.between(entranceTime, LocalDateTime.now());
        long inHours = duration.toHours();
        double perHourPrice = getPrice(parkingSpotType);
        return inHours * perHourPrice;
    }

    private double getPrice(ParkingSpotType spotType) {
        return spotTypePrices.getOrDefault(spotType, 0.0);
    }
}
