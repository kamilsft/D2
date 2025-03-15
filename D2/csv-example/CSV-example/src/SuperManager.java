
public class SuperManager {
	private static volatile SuperManager instance;
	private int superMgrID;
	private String name;
	private String email;
	
	// private constructor
	private SuperManager(String name, String email, int superMgrID) {
		this.superMgrID = superMgrID;
		this.name = name;
		this.email = email;
	}
	
	public static SuperManager getInstance(int superMgrID, String name, String email) {
		if(instance == null) {
			synchronized(SuperManager.class) {
				if(instance == null) {
					instance = new SuperManager(email, name, superMgrID);
				}
			}
		}
		return instance;
	}
	
	public void enableParkingSpot(ParkingSpot spot) {}
	public void disableParkingSpot(ParkingSpot spot) {}
	public void enableParkingLot(ParkingLot lot) {}
	public void disableParkingLot(ParkingLot lot) {}
	public void monitorParking() {}
	public void addParkingLot() {}
	public void requestAccountGeneration() {}
	public boolean authenticate(int superMgrID) {
		return this.superMgrID == superMgrID;
	}

	public int getSuperMgrID() {
		return superMgrID;
	}

	public void setSuperMgrID(int superMgrID) {
		this.superMgrID = superMgrID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "SuperManager [superMgrID=" + superMgrID + ", name=" + name + ", email=" + email + "]";
	}
	
	
	
}
