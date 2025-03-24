//Leaf class in Composite Pattern
package logic;

public class ParkingSpot implements ParkingComponent {
	private String spotId;
	private boolean occupied;
	private boolean enabled;
	private String location; // New field for location

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

	@Override
	public String toString() {
		return "ParkingSpot [id=" + spotId +
				", location=" + location +
				", enabled=" + enabled +
				", occupied=" + occupied + "]";
	}
}