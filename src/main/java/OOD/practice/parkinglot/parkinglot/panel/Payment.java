package OOD.practice.parkinglot.parkinglot.panel;

public class Payment {
    private static int PAYMENT_COUNT = 1;
    private final int panelId;
    private final PricingManager pricingManager;

    public Payment(PricingManager pricingManager) {
        this.panelId = PAYMENT_COUNT;
        PAYMENT_COUNT++;
        this.pricingManager = pricingManager;
    }

    public void calculateCharges(Ticket ticket) {
        double toPay = pricingManager.calculatePrice(ticket.getParkingSpot().getParkingSpotType(), ticket.getEntranceTime());
        System.out.println("You need to pay " + toPay + "$");
    }

    public int getPanelId() {
        return panelId;
    }
}
