package logic;

import DesignPatternClasses.Command;

public class EnableSensorCommand implements Command {
    private Sensor sensor;

    public EnableSensorCommand(Sensor sensor) {
        this.sensor = sensor;
    }

    @Override
    public void execute() {
        sensor.setSensorOn(true); // Enable the sensor
    }

    @Override
    public void undo() {
        sensor.setSensorOn(false); // Disable the sensor
    }
}
