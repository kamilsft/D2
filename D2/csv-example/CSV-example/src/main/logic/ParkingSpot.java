//Leaf class in Composite Pattern
package main.logic;

public class ParkingSpot implements ParkingComponent {
	private String spotId;
	private int sensorId;
	private Sensor sensor;
	private boolean occupied;
	private boolean enabled;
	private String location; // New field for location
	private String lotId;

	public ParkingSpot(String spotId, boolean occupied, boolean enabled) {
		this.spotId = spotId;
		this.occupied = occupied;
		this.enabled = enabled;

		// Determine location based on ID prefix
		char section = spotId.charAt(0);
		switch(section) {
			case 'A':
				this.location = "North Lot";
				break;
			case 'B':
				this.location = "Central Lot";
				break;
			case 'C':
				this.location = "South Lot";
				break;
			default:
				this.location = "General Lot";
		}
	}

	// Constructor with location parameter
	public ParkingSpot(String spotId, boolean occupied, boolean enabled, String location) {
		this.spotId = spotId;
		this.occupied = occupied;
		this.enabled = enabled;
		this.location = location;
	}

	// Constructor with location parameter
	public ParkingSpot(String spotId, boolean occupied, boolean enabled, String location, int sensorId) {
		this.spotId = spotId;
		this.occupied = occupied;
		this.enabled = enabled;
		this.location = location;
		this.sensor = new Sensor(sensorId);
	}

	// Constructor without location parameter
	public ParkingSpot(String spotId, String lotId, boolean occupied, boolean enabled, int sensorId) {
		this.spotId = spotId;
		this.occupied = occupied;
		this.enabled = enabled;
		this.sensorId = sensorId;
		this.sensor = new Sensor(sensorId);
		this.lotId = lotId;
	}

	public String getSpotId() {
		return spotId;
	}

	public boolean isOccupied() {
		return occupied;
	}

	public void setOccupied(boolean occupied) {
		this.occupied = occupied;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	// Method to get the lot ID associated with the parking spot
	public String getLotId() {
		return lotId;
	}

	// Method to set the spot ID for the parking spot
	public void setSpotId(String spotId) {
		this.spotId = spotId;
	}

	@Override
	public void showDetails() {
		System.out.println("Parking Spot ID: " + spotId +
				", Location: " + location +
				", Status: " + (enabled ? "Enabled" : "Disabled") +
				", Occupied: " + (occupied ? "Yes" : "No"));
	}
   
	@Override
	public String getId() {
		return spotId;
	}
 
	public Sensor getSensor() {
		return sensor;
	}

	public int getSensorId() {
		return sensor.getSensorId();
	}

	public void setSensor(Sensor sensor) {
		this.sensor = sensor;
	}

	@Override
	public String toString() {
		return "ParkingSpot [id=" + spotId +
				", location=" + location +
				", enabled=" + enabled +
				", occupied=" + occupied + "]";
	}

	
}