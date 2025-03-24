package logic;

public abstract class Manager extends User{


	public Manager(String name, int id, String email, String password){
		super(name, id, email, password);
	}

	public abstract void enableManager(User user);
	public abstract void disableManager(User user);
	public abstract void enableParkingSpot(ParkingSpot spot);
	public abstract void disableParkingSpot(ParkingSpot spot);
	public abstract void enableParkingLot(ParkingLot lot);
	public abstract void disableParkingLot(ParkingLot lot);
	public abstract void monitorParking();
	public abstract void addParkingLot();
}