package OOD.practice.parkinglot.parkinglot.panel;

public class ExitPanel {
    private final int panelId;
    private Payment payment;

    public ExitPanel(int panelId) {
        this.panelId = panelId;
    }

    public void processPayment(Ticket ticket) {
        payment.calculateCharges(ticket);
    }

    public int getPanelId() {
        return panelId;
    }
}
