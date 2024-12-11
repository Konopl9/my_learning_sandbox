package OOD.practice.parkinglot.parkinglot.panel;

public class ExitPanel {
    private static int EXIT_PANEL_COUNT = 1;
    private final int panelId;
    private Payment payment;

    public ExitPanel() {
        this.panelId = EXIT_PANEL_COUNT;
        EXIT_PANEL_COUNT++;
    }

    public void processPayment(Ticket ticket) {
        payment.calculateCharges(ticket);
    }

    public int getPanelId() {
        return panelId;
    }
}
