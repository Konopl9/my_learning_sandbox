package OOD.practice.parkinglot.parkinglot.panel;

import OOD.practice.parkinglot.parkinglot.parkingspot.ParkingSpot;
import OOD.practice.parkinglot.parkinglot.parkingspot.ParkingSpotType;
import OOD.practice.parkinglot.vehicle.Vehicle;

import java.time.LocalDateTime;

public class Ticket {
    private static int TICKETS_COUNT = 1;
    private final int ticketId;
    private final LocalDateTime entranceTime;
    private final ParkingSpot parkingSpot;
    private final Vehicle vehicle;

    private Ticket(int ticketId, LocalDateTime entranceTime, ParkingSpot parkingSpot, Vehicle vehicle) {
        this.ticketId = ticketId;
        this.entranceTime = entranceTime;
        this.parkingSpot = parkingSpot;
        this.vehicle = vehicle;
    }

    public static Ticket getTicket(LocalDateTime entranceTime, ParkingSpot parkingSpot, Vehicle vehicle) {
        Ticket newTicket = new Ticket(TICKETS_COUNT, entranceTime, parkingSpot, vehicle);
        TICKETS_COUNT++;
        return newTicket;
    }

    public int getTicketId() {
        return ticketId;
    }

    public LocalDateTime getEntranceTime() {
        return entranceTime;
    }

    public ParkingSpotType getParkingSpotType() {
        return this.parkingSpot.getParkingSpotType();
    }
}
