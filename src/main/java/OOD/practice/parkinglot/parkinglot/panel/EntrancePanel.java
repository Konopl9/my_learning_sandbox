package OOD.practice.parkinglot.parkinglot.panel;

import OOD.practice.parkinglot.exception.AvailableSpotNotFoundException;
import OOD.practice.parkinglot.parkinglot.ParkingFloor;
import OOD.practice.parkinglot.parkinglot.parkingspot.ParkingSpot;
import OOD.practice.parkinglot.vehicle.Vehicle;

import java.time.LocalDateTime;
import java.util.Optional;

public class EntrancePanel {
    private final int panelId;
    private final ParkingFloor parkingFloor;

    public EntrancePanel(int panelId, ParkingFloor parkingFloor) {
        this.panelId = panelId;
        this.parkingFloor = parkingFloor;
    }

    public Optional<Ticket> issueTicket(Vehicle vehicle) {
        ParkingSpot freeSpot;
        try {
            freeSpot = parkingFloor.allocateSpot(vehicle);
        } catch (AvailableSpotNotFoundException exception) {
            return Optional.empty();
        }
        return Optional.of(Ticket.getTicket(LocalDateTime.now(), freeSpot, vehicle));
    }

    public int getPanelId() {
        return panelId;
    }
}
