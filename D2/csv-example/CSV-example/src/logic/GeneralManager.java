package logic;

public class GeneralManager extends Manager {
	public GeneralManager(String name, int id, String email, String password) {
		super(name, id, email, password);
	}

	@Override
	public void enableManager(User user) {
		System.out.println("Enabling manager: " + user.getName());
	}

	@Override
	public void disableManager(User user) {
		System.out.println("Disabling manager: " + user.getName());
	}

	@Override
	public void enableParkingSpot(ParkingSpot spot) {
		// TODO Auto-generated method stub

	}
 
	@Override
	public void disableParkingSpot(ParkingSpot spot) {
		// TODO Auto-generated method stub

	}

	@Override
	public void enableParkingLot(ParkingLot lot) {
		// TODO Auto-generated method stub

	}

	@Override
	public void disableParkingLot(ParkingLot lot) {
		// TODO Auto-generated method stub

	}

	@Override
	public void monitorParking() {
		// TODO Auto-generated method stub

	}

	@Override
	public void addParkingLot() {
		// TODO Auto-generated method stub

	}
}