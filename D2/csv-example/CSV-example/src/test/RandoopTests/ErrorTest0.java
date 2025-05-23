package test.RandoopTests;

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
        main.logic.SuperManager superManager0 = main.logic.SuperManager.getInstance();
        boolean boolean2 = superManager0.authenticate((int) (byte) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double4 = superManager0.calculateParkingPrice((int) (byte) 10);
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        main.logic.User user4 = new main.logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str5 = user4.password;
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double7 = user4.calculateParkingPrice((int) (byte) 100);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        main.logic.User user4 = new main.logic.User("Valid", (int) (byte) 1, "", "ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]");
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double6 = user4.calculateParkingPrice((int) (short) -1);
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        main.logic.FacultyMember facultyMember4 = new main.logic.FacultyMember("ParkingSpot [id=, location=, enabled=true, occupied=false]", (int) (byte) 1, "hi!", "");
        main.logic.ParkingSpot parkingSpot9 = new main.logic.ParkingSpot("", false, true, "");
        main.logic.Booking booking11 = facultyMember4.bookParkingLot(parkingSpot9, (int) (byte) 1);
        boolean boolean12 = facultyMember4.validateRegistration();
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        double double14 = facultyMember4.calculateParkingPrice(100);
    }
}

