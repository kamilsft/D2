package main.logic;

import main.DesignPatternClasses.Command;

public class DisableSensorCommand implements Command {
    private Sensor sensor;

    public DisableSensorCommand(Sensor sensor) {
        this.sensor = sensor;
    }

    @Override
    public void execute() {
        sensor.setSensorOn(false); // Disable the sensor
    }

    @Override
    public void undo() {
        sensor.setSensorOn(true); // Enable the sensor
    }
    
}
