package logic;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

	public String id;
	private ArrayList<ParkingSpot> spots;
	
	public ParkingLot(String id) {
		this.id = id;
		this.spots = new ArrayList<ParkingSpot>(100);
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	
	// Getter for spots
    public List<ParkingSpot> getSpots() {
        return spots;
    }

    // Setter for spots
    public void setSpots(ArrayList<ParkingSpot> spots) {
        this.spots = spots;
    }

	// Method to add a ParkingSpot to the list with a maximum limit of 100
	public void addParkingSpot(ParkingSpot spot) throws IllegalStateException {	
		if (this.spots == null) {
			this.spots = new ArrayList<>();
		}
		if (this.spots.size() < 100) {
			this.spots.add(spot);
		} else {
			throw new IllegalStateException("Cannot add more than 100 parking spots.");
		}
	}

}
