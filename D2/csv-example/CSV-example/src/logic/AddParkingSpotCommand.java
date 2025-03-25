package logic;

public class AddParkingSpotCommand implements Command {
    private ParkingManager manager;
    private String spotId;

    public AddParkingSpotCommand(ParkingManager manager, String spotId) {
        this.manager = manager;
        this.spotId = spotId;
    }

    @Override
    public void execute() {
        manager.addSpot(spotId);
    }
    @Override
    public void undo() {
        System.out.println("Undo not supported for add.");
    }
 
}
 