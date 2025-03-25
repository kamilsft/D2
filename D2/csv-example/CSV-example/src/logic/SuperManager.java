
package logic;

public class SuperManager extends Manager {
	private static volatile SuperManager instance;
	private int superMgrID;
//	private String name;
//	private String email;

	// private constructor
	private SuperManager() {
		// calling user constructor
		super("Admin", 1, "yorkuAdmin@gmail.com", "adminpass");
		this.superMgrID = 1;
	}
 
	public static SuperManager getInstance() {
		if(instance == null) {
			synchronized(SuperManager.class) {
				if(instance == null) {
					instance = new SuperManager();
				}
			}
		}
		return instance;
	}

	@Override
	public void enableParkingSpot(ParkingSpot spot) {
		System.out.println("Parking spot " + spot.getSpotId() + " enabled.");
	}
	@Override
	public void disableParkingSpot(ParkingSpot spot) {
		System.out.println("Parking spot " + spot.getSpotId() + " disabled.");
	}
	@Override
	public void enableParkingLot(ParkingLot lot) {
		System.out.println("Parking lot " + lot.getId() + " enabled.");
	}
	@Override
	public void disableParkingLot(ParkingLot lot) {
		System.out.println("Parking lot " + lot.getId() + " disabled.");
	}
	@Override
	public void monitorParking() {
		System.out.println("Monitoring parking lots...");
	}
	@Override
	public void addParkingLot() {
		System.out.println("New parking lot added.");
	}
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

	@Override
	public void enableManager(User user) {
		System.out.println("Manager " + user.getName() + " enabled by Super Manager");
	}

	@Override
	public void disableManager(User user) {
		System.out.println("Manager " + user.getName() + " disabled by Super Manager");
	}



}
