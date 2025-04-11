package logic;

import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.List;
import DesignPatternClasses.Subject;
import DesignPatternClasses.Observer; 

public class Sensor extends Subject{
    private int sensorId;
    private boolean sensorOn = false;
    private ZonedDateTime sensorActivationTime;
    private ZonedDateTime sensorDeactivationTime;
    private String currentCarPlate = "";
    private String currentCarBrand = "";
    private String currentCarModel = "";
    private String currentCarColor = "";
    private boolean carArrived = false;
    private List<Observer> observers = new ArrayList<>();
      
    // Constructor
    public Sensor(int sensorId) {
        this.sensorId = sensorId;
    }

    // Getter and Setter for sensorId
    public int getSensorId() {
        return sensorId;
    }

    public void setSensorId(int sensorId) {
        this.sensorId = sensorId;
    }

    // Getter and Setter for sensorOn
    public boolean isSensorOn() {
        return sensorOn;
    }

    public void setSensorOn(boolean sensorOn) {
        this.sensorOn = sensorOn;
    }

    // Activate the sensor
    public void activateSensor(ZonedDateTime time) {
        this.sensorOn = true;
        this.sensorActivationTime = time;
    }

    // Deactivate the sensor
    public void deactivateSensor(ZonedDateTime time) {
        this.sensorOn = false;
        this.sensorDeactivationTime = time;
    }

    // Getter for sensorActivationTime
    public ZonedDateTime getSensorActivationTime() {
        return sensorActivationTime;
    }

    // Getter for sensorDeactivationTime
    public ZonedDateTime getSensorDeactivationTime() {
        return sensorDeactivationTime;
    }

    // Getter and Setter for currentCarPlate
    public String getCurrentCarPlate() {
        return currentCarPlate;
    }

    public void setCurrentCarPlate(String plate) {
        this.currentCarPlate = plate;
    }

    // Getter and Setter for currentCarBrand
    public String getCurrentCarBrand() {
        return currentCarBrand;
    }

    public void setCurrentCarBrand(String brand) {
        this.currentCarBrand = brand;
    }

    // Getter and Setter for currentCarModel
    public String getCurrentCarModel() {
        return currentCarModel;
    }

    public void setCurrentCarModel(String model) {
        this.currentCarModel = model;
    }

    // Getter and Setter for currentCarColor
    public String getCurrentCarColor() {
        return currentCarColor;
    }

    public void setCurrentCarColor(String color) {
        this.currentCarColor = color;
    }

    // Clear all current car information
    public void clearCurrentCarInfo() {
        this.currentCarPlate = "";
        this.currentCarBrand = "";
        this.currentCarModel = "";
        this.currentCarColor = "";
    }

    // Getter and Setter for carArrived
    public boolean isCarArrived() {
        return carArrived;
    }

    public void setCarArrived(boolean carArrived) {
        this.carArrived = carArrived;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    @Override
    public List<Observer> getObservers() {
        return observers;
    }
}
