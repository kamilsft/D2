// Composite class in Composite Pattern
package logic;

import java.util.ArrayList;
import java.util.List;
 
public class CompositeParkingLot implements ParkingComponent {
    private String id;
    private List<ParkingComponent> components = new ArrayList<>();

    public CompositeParkingLot(String id) {
        this.id = id;
    }

    public void add(ParkingComponent component) {
        components.add(component);
    }

    public void remove(ParkingComponent component) {
        components.remove(component);
    }

    public List<ParkingComponent> getComponents() {
        return components;
    }

    @Override
    public void showDetails() {
        System.out.println("Parking Lot: " + id);
        for (ParkingComponent component : components) {
            component.showDetails();
        }
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public boolean isEnabled() {
        // A lot is considered enabled if at least one of its spots is enabled
        for (ParkingComponent component : components) {
            if (component.isEnabled()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean isOccupied() {
        // A lot is considered fully occupied if all of its spots are occupied
        if (components.isEmpty()) {
            return false;
        }

        for (ParkingComponent component : components) {
            if (!component.isOccupied()) {
                return false;
            }
        }
        return true;
    }
}
