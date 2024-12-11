package OOD.practice.parkinglot.exception;

public class AvailableSpotNotFoundException extends RuntimeException {
    public AvailableSpotNotFoundException(String message) {
        super(message);
    }
}
