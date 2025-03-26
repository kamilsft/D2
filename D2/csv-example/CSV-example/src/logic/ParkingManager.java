package logic;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
import DesignPatternClasses.Invoker;

public class ParkingManager {
    private Map<String, ParkingSpot> spots;
    private List<CompositeParkingLot> parkingLots;

    public ParkingManager() {
        this.spots = new HashMap<>();
        this.parkingLots = new ArrayList<>();

        // Create composite parking lots
        CompositeParkingLot northLot = new CompositeParkingLot("North Lot");
        CompositeParkingLot centralLot = new CompositeParkingLot("Central Lot");
        CompositeParkingLot southLot = new CompositeParkingLot("South Lot");

        parkingLots.add(northLot);
        parkingLots.add(centralLot);
        parkingLots.add(southLot);

        // Initialize with default spots A1-A9, B1-B9, C1-C9
        for (char section = 'A'; section <= 'C'; section++) {
            for (int number = 1; number <= 9; number++) {
                String spotId = "" + section + number;
                String location;

                switch(section) {
                    case 'A':
                        location = "North Lot";
                        break;
                    case 'B':
                        location = "Central Lot";
                        break;
                    case 'C':
                        location = "South Lot";
                        break;
                    default:
                        location = "General Lot";
                }

                ParkingSpot spot = new ParkingSpot(spotId, false, true, location);
                spots.put(spotId, spot);

                // Add to appropriate composite lot
                switch(section) {
                    case 'A':
                        northLot.add(spot);
                        break;
                    case 'B':
                        centralLot.add(spot);
                        break;
                    case 'C':
                        southLot.add(spot);
                        break;
                }
            }
        }
    }

    public Map<String, ParkingSpot> getSpots() {
        return spots;
    }

    public List<CompositeParkingLot> getParkingLots() {
        return parkingLots;
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
            String location;
            char section = spotId.charAt(0);

            switch(section) {
                case 'A':
                    location = "North Lot";
                    break;
                case 'B':
                    location = "Central Lot";
                    break;
                case 'C':
                    location = "South Lot";
                    break;
                default:
                    location = "General Lot";
            }

            ParkingSpot spot = new ParkingSpot(spotId, false, true, location);
            spots.put(spotId, spot);

            // Add to appropriate composite lot
            for (CompositeParkingLot lot : parkingLots) {
                if (lot.getId().equals(location)) {
                    lot.add(spot);
                    break;
                }
            }

            // If no matching lot found, add to a new general lot
            if (section > 'C') {
                boolean lotFound = false;
                for (CompositeParkingLot lot : parkingLots) {
                    if (lot.getId().equals("General Lot")) {
                        lot.add(spot);
                        lotFound = true;
                        break;
                    }
                }

                if (!lotFound) {
                    CompositeParkingLot generalLot = new CompositeParkingLot("General Lot");
                    generalLot.add(spot);
                    parkingLots.add(generalLot);
                }
            }

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