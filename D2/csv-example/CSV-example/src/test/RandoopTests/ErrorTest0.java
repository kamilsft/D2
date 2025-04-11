import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test1() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test1");
        logic.SuperManager superManager0 = logic.SuperManager.getInstance();
        boolean boolean2 = superManager0.authenticate((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double4 = superManager0.calculateParkingPrice((int) (byte) 10);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        logic.User user4 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str5 = user4.password;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double7 = user4.calculateParkingPrice((int) (byte) 100);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        logic.User user4 = new logic.User("Valid", (int) (byte) 1, "", "ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double6 = user4.calculateParkingPrice((int) (short) -1);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        logic.FacultyMember facultyMember4 = new logic.FacultyMember("ParkingSpot [id=, location=, enabled=true, occupied=false]", (int) (byte) 1, "hi!", "");
        logic.ParkingSpot parkingSpot9 = new logic.ParkingSpot("", false, true, "");
        logic.Booking booking11 = facultyMember4.bookParkingLot(parkingSpot9, (int) (byte) 1);
        boolean boolean12 = facultyMember4.validateRegistration();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double14 = facultyMember4.calculateParkingPrice(100);
    }
}

