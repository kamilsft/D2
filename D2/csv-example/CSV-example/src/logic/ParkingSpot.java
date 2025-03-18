package logic;

public class ParkingSpot {
	private String spotId;
	private boolean isOccupied;
	private int sensorId;
	
	public ParkingSpot(String spotId, boolean isOccupied) {
		this.spotId = spotId;
		this.isOccupied = isOccupied;
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

	@Override
	public String toString() {
		return "ParkingSpot [spotId=" + spotId + ", isOccupied=" + isOccupied + ", sensorId=" + sensorId + "]";
	}
	
	
}
