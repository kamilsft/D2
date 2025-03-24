package logic;

import java.util.HashMap;
import java.util.Map;

public class ParkingManager {
    private Map<String, ParkingSpot> spots;

    public ParkingManager() {
        this.spots = new HashMap<>();
        // Initialize with default spots A1-A9, B1-B9, C1-C9
        for (char section = 'A'; section <= 'C'; section++) {
            for (int number = 1; number <= 9; number++) {
                String spotId = "" + section + number;
                ParkingSpot spot = new ParkingSpot(spotId, false,true);
                spots.put(spotId, spot);
            }
        }
    }

    public Map<String, ParkingSpot> getSpots() {
        return spots;
    }

    public boolean spotExists(String spotId) {
        return spots.containsKey(spotId);
    }

    public boolean addSpot(String spotId) {
        // Check if we've already reached the maximum of 100 spots
        if (spots.size() >= 100) {
            return false;
        }

        if (!spotExists(spotId)) {
            ParkingSpot spot = new ParkingSpot(spotId,false, true);
            spots.put(spotId, spot);
            return true;
        }
        return false;
    }

    public boolean enableSpot(String spotId) {
        if (spotExists(spotId)) {
            ParkingSpot spot = spots.get(spotId);
            spot.setEnabled(true);
            return true;
        }
        return false;
    }

    public boolean disableSpot(String spotId) {
        if (spotExists(spotId)) {
            ParkingSpot spot = spots.get(spotId);
            spot.setEnabled(false);
            return true;
        }
        return false;
    }

    // New method to get the total number of spots
    public int getSpotsCount() {
        return spots.size();
    }
}