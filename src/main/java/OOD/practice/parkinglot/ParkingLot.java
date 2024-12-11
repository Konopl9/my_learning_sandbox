package OOD.practice.parkinglot;

import OOD.practice.parkinglot.parkinglot.ParkingFloor;
import OOD.practice.parkinglot.parkinglot.panel.EntrancePanel;
import OOD.practice.parkinglot.parkinglot.panel.ExitPanel;
import OOD.practice.parkinglot.parkinglot.panel.Ticket;
import OOD.practice.parkinglot.vehicle.Vehicle;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

public final class ParkingLot {
    static List<ParkingFloor> parkingFloors = new LinkedList<>();
    static List<EntrancePanel> entrancePanels = new LinkedList<>();
    static List<ExitPanel> exitPanels = new LinkedList<>();
    private static volatile ParkingLot singleton;

    private ParkingLot() {
    }

    public static ParkingLot getInstance() {
        if (singleton == null) {
            synchronized (ParkingLot.class) {
                if (singleton == null) {
                    singleton = new ParkingLot();
                }
            }
        }
        return singleton;
    }

    public static ParkingFloor addFlor() {
        ParkingFloor parkingFloor = new ParkingFloor();
        parkingFloors.add(parkingFloor);
        return parkingFloor;
    }

    public static void addEntrance(ParkingFloor parkingFloor) {
        entrancePanels.add(new EntrancePanel(parkingFloor));
    }

    public static void addExit(ParkingFloor parkingFloor) {
        exitPanels.add(new ExitPanel());
    }

    public static void getAvailableSlot(Vehicle vehicle) {
        Optional<Ticket> ticket = Optional.empty();
        for (EntrancePanel entrancePanel : entrancePanels) {
            ticket = entrancePanel.issueTicket(vehicle);
        }

        if (ticket.isEmpty()) {
            System.out.println("No available spots");
            return;
        }

        System.out.println("Please enter the parking your ticket is => " + ticket.get());
    }
}
