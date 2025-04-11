package logic;

import DesignPatternClasses.Command;

public class EnableParkingSpotCommand implements Command {
    private ParkingManager manager;
    private String spotId;

    public EnableParkingSpotCommand(ParkingManager manager, String spotId) {
        this.manager = manager;
        this.spotId = spotId;
    }

    @Override
    public void execute() {
        manager.enableSpot(spotId);
    }

    @Override
    public void undo() {
        manager.disableSpot(spotId);
    }
}

  