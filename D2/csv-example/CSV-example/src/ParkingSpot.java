
public class ParkingSpot {
	private int spotId;
	private boolean isOccupied;
	private int sensorId;
	
	public ParkingSpot(int spotId, boolean isOccupied) {
		this.spotId = spotId;
		this.isOccupied = isOccupied;
	}

	public int getSpotId() {
		return spotId;
	}

	public void setSpotId(int spotId) {
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
