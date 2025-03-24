package logic;

public class ParkingSpot {
	private String spotId;
	private boolean isOccupied;
	private int sensorId;
	private Sensor sensor;
	
	public ParkingSpot(String spotId, boolean isOccupied) {
		this.spotId = spotId;
		this.isOccupied = isOccupied;
	}

	public ParkingSpot(String spotId, boolean isOccupied, int sensorId) {
		this.spotId = spotId;
		this.isOccupied = isOccupied;
		this.sensorId = sensorId;
		this.sensor = new Sensor(sensorId);
	}

	public String getSpotId() {
		return spotId;
	}

	public void setSpotId(String spotId) {
		this.spotId = spotId;
	}

	public boolean isOccupied() {
		return isOccupied;
	}

	public void setOccupied(boolean isOccupied) {
		this.isOccupied = isOccupied;
	}

	public int getSensorId() {
		return sensorId;
	}

	public void setSensorId(int sensorId) {
		this.sensorId = sensorId;
	}
 
	public Sensor getSensor() {
		return sensor;
	}

	public void setSensor(Sensor sensor) {
		this.sensor = sensor;
	}

	@Override
	public String toString() {
		return "ParkingSpot [spotId=" + spotId + ", isOccupied=" + isOccupied + ", sensorId=" + sensorId + "]";
	}
	
	
}
