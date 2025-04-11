package main.logic;

import main.DesignPatternClasses.Command;

public class DisableParkingSpotCommand implements Command {
    private ParkingManager manager;
    private String spotId;

    public DisableParkingSpotCommand(ParkingManager manager, String spotId) {
        this.manager = manager;
        this.spotId = spotId;
    }

    @Override
    public void execute() {
        manager.disableSpot(spotId);
    }

    @Override
    public void undo() {
        manager.enableSpot(spotId);
    }
}
 
 