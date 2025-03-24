package logic;

public class ParkingSpot {
	private String spotId;
	private boolean isOccupied;
	private boolean isEnabled;   // New attribute to control bookability
	private int sensorId;

	public ParkingSpot(String spotId, boolean isOccupied, boolean isEnabled) {
		this.spotId = spotId;
		this.isOccupied = isOccupied;
		this.isEnabled = isEnabled;
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

	public boolean isEnabled() {    // New getter
		return isEnabled;
	}

	public void setEnabled(boolean isEnabled) {   // New setter
		this.isEnabled = isEnabled;
	}

	public int getSensorId() {
		return sensorId;
	}

	public void setSensorId(int sensorId) {
		this.sensorId = sensorId;
	}

	@Override
	public String toString() {
		return "ParkingSpot [spotId=" + spotId + ", isOccupied=" + isOccupied + ", isEnabled=" + isEnabled + "]";
	}
}
