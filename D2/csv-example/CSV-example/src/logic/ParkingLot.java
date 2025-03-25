package logic;

import java.util.HashMap;
import java.util.Map;

public class ParkingLot {
	private String id;
	private Map<String, ParkingSpot> spots;

	public ParkingLot(String id) {
		this.id = id;
		this.spots = new HashMap<>();

		// Initialize with A1 to A9 and B1 to B9 (enabled by default)
		if (id.equals("Lot1")) {
			for (char letter = 'A'; letter <= 'B'; letter++) {
				for (int i = 1; i <= 9; i++) {
					String spotId = letter + String.valueOf(i);
					spots.put(spotId, new ParkingSpot(spotId, false, true));  // Enabled by default
				}
			}
		}
	}

	public String getId() {
		return id;
	}
  
	public void setId(String id) {
		this.id = id;
	}

	public Map<String, ParkingSpot> getSpots() {
		return spots;
	}

	public void enableSpot(String spotId) {
		ParkingSpot spot = spots.get(spotId);
		if (spot != null) {
			spot.setEnabled(true);
		}
	}

	public void disableSpot(String spotId) {
		ParkingSpot spot = spots.get(spotId);
		if (spot != null) {
			spot.setEnabled(false);
		}
	}

	@Override
	public String toString() {
		return "ParkingLot [id=" + id + ", spots=" + spots + "]";
	}
}
