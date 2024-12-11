package OOD.practice.parkinglot;

import OOD.practice.parkinglot.parkinglot.ParkingFloor;
import OOD.practice.parkinglot.parkinglot.panel.EntrancePanel;
import OOD.practice.parkinglot.parkinglot.panel.ExitPanel;

import java.util.LinkedList;
import java.util.List;

final class ParkingLot {
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

    public static void addFlor() {
        parkingFloors.add(new ParkingFloor());
    }

    public static void addEntrance(ParkingFloor parkingFloor) {
        entrancePanels.add(new EntrancePanel(parkingFloor));
    }

    public static void addExit(ParkingFloor parkingFloor) {
        exitPanels.add(new ExitPanel());
    }
}
