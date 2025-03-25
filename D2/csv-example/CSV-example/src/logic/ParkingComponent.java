package logic;

// Interface for Composite Pattern
public interface ParkingComponent {
    void showDetails();
    String getId();
    boolean isEnabled();
    boolean isOccupied();
}