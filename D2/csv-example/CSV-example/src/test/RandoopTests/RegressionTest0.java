import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        java.time.LocalDateTime localDateTime0 = null;
        // The following exception was thrown during execution in test generation
        try {
            logic.ExtendedState extendedState2 = new logic.ExtendedState(localDateTime0, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.plusMinutes(long)\" because \"originalExpirationTime\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.time.ZonedDateTime zonedDateTime0 = null;
        java.time.ZonedDateTime zonedDateTime1 = null;
        logic.ParkingSpot parkingSpot4 = null;
        logic.User user5 = null;
        // The following exception was thrown during execution in test generation
        try {
            logic.Booking booking6 = new logic.Booking(zonedDateTime0, zonedDateTime1, "hi!", true, parkingSpot4, user5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"logic.User.getEmail()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        logic.User user5 = logic.UserFactory.createUser("", "", (int) '4', "hi!", "");
        org.junit.Assert.assertNull(user5);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        logic.Sensor sensor0 = null;
        logic.DisableSensorCommand disableSensorCommand1 = new logic.DisableSensorCommand(sensor0);
        // The following exception was thrown during execution in test generation
        try {
            disableSensorCommand1.undo();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"logic.Sensor.setSensorOn(boolean)\" because \"this.sensor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        logic.Sensor sensor0 = null;
        logic.DisableSensorCommand disableSensorCommand1 = new logic.DisableSensorCommand(sensor0);
        java.lang.Class<?> wildcardClass2 = disableSensorCommand1.getClass();
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        logic.User user5 = logic.UserFactory.createUser("hi!", "hi!", (int) '4', "", "ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]");
        org.junit.Assert.assertNull(user5);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        logic.User user4 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str5 = user4.password;
        double double6 = user4.getBalance();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double6 + "' != '" + 15.0d + "'", double6 == 15.0d);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        logic.ParkingSpot parkingSpot3 = new logic.ParkingSpot("hi!", false, false);
        java.lang.String str4 = parkingSpot3.toString();
        java.lang.Class<?> wildcardClass5 = parkingSpot3.getClass();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]" + "'", str4, "ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.time.LocalDateTime localDateTime0 = null;
        // The following exception was thrown during execution in test generation
        try {
            logic.ExtendedState extendedState1 = new logic.ExtendedState(localDateTime0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.plusMinutes(long)\" because \"originalExpirationTime\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        logic.BookingSystem bookingSystem0 = null;
        logic.User user5 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str6 = user5.password;
        logic.ParkingSpot parkingSpot10 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean11 = parkingSpot10.isOccupied();
        boolean boolean12 = parkingSpot10.isEnabled();
        logic.Sensor sensor13 = parkingSpot10.getSensor();
        logic.BookingCommand bookingCommand14 = new logic.BookingCommand(bookingSystem0, user5, parkingSpot10);
        logic.Sensor sensor16 = new logic.Sensor((int) ' ');
        parkingSpot10.setSensor(sensor16);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(sensor13);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        Connections.DatabaseConnection databaseConnection0 = new Connections.DatabaseConnection();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        logic.ParkingManager parkingManager0 = new logic.ParkingManager();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean2 = parkingManager0.addSpot("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException; message: Index 0 out of bounds for length 0");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        logic.BookingSystem bookingSystem0 = null;
        logic.User user5 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str6 = user5.password;
        logic.ParkingSpot parkingSpot10 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean11 = parkingSpot10.isOccupied();
        boolean boolean12 = parkingSpot10.isEnabled();
        logic.Sensor sensor13 = parkingSpot10.getSensor();
        logic.BookingCommand bookingCommand14 = new logic.BookingCommand(bookingSystem0, user5, parkingSpot10);
        // The following exception was thrown during execution in test generation
        try {
            bookingCommand14.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"logic.BookingSystem.book(logic.User, logic.ParkingSpot)\" because \"this.bookingSystem\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(sensor13);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        logic.ValidState validState1 = new logic.ValidState((int) ' ');
        java.lang.String str2 = validState1.getStateName();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Valid" + "'", str2, "Valid");
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        logic.Sensor sensor1 = new logic.Sensor((int) ' ');
        sensor1.setCarArrived(true);
        sensor1.setCurrentCarPlate("hi!");
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        logic.User user4 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str5 = user4.password;
        logic.PricingStrategy pricingStrategy6 = null;
        user4.setPricingStrategy(pricingStrategy6);
        java.lang.String str8 = user4.password;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        logic.BookingSystem bookingSystem0 = null;
        logic.User user5 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str6 = user5.password;
        logic.ParkingSpot parkingSpot10 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean11 = parkingSpot10.isOccupied();
        boolean boolean12 = parkingSpot10.isEnabled();
        logic.Sensor sensor13 = parkingSpot10.getSensor();
        logic.BookingCommand bookingCommand14 = new logic.BookingCommand(bookingSystem0, user5, parkingSpot10);
        bookingCommand14.undo();
        // The following exception was thrown during execution in test generation
        try {
            bookingCommand14.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"logic.BookingSystem.book(logic.User, logic.ParkingSpot)\" because \"this.bookingSystem\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(sensor13);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        logic.Sensor sensor1 = new logic.Sensor((int) ' ');
        sensor1.setCurrentCarPlate("hi!");
        java.lang.String str4 = sensor1.getCurrentCarModel();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        logic.BookingSystem bookingSystem0 = null;
        logic.User user5 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str6 = user5.password;
        logic.ParkingSpot parkingSpot10 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean11 = parkingSpot10.isOccupied();
        boolean boolean12 = parkingSpot10.isEnabled();
        logic.Sensor sensor13 = parkingSpot10.getSensor();
        logic.BookingCommand bookingCommand14 = new logic.BookingCommand(bookingSystem0, user5, parkingSpot10);
        bookingCommand14.undo();
        java.lang.Class<?> wildcardClass16 = bookingCommand14.getClass();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(sensor13);
        org.junit.Assert.assertNotNull(wildcardClass16);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        logic.Sensor sensor0 = null;
        logic.DisableSensorCommand disableSensorCommand1 = new logic.DisableSensorCommand(sensor0);
        // The following exception was thrown during execution in test generation
        try {
            disableSensorCommand1.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"logic.Sensor.setSensorOn(boolean)\" because \"this.sensor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        logic.User user4 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str5 = user4.password;
        logic.StudentPricing studentPricing6 = new logic.StudentPricing();
        double double8 = studentPricing6.calculatePrice((int) (short) 0);
        double double10 = studentPricing6.calculatePrice(32);
        user4.setPricingStrategy((logic.PricingStrategy) studentPricing6);
        double double13 = studentPricing6.calculatePrice(0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.6666666666666665d + "'", double10 == 2.6666666666666665d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.0d + "'", double13 == 0.0d);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        logic.User user4 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        logic.BookingSystem bookingSystem5 = null;
        logic.User user10 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str11 = user10.password;
        logic.ParkingSpot parkingSpot15 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean16 = parkingSpot15.isOccupied();
        boolean boolean17 = parkingSpot15.isEnabled();
        logic.Sensor sensor18 = parkingSpot15.getSensor();
        logic.BookingCommand bookingCommand19 = new logic.BookingCommand(bookingSystem5, user10, parkingSpot15);
        logic.Booking booking20 = new logic.Booking(user4, parkingSpot15);
        logic.BookingSystem bookingSystem21 = null;
        logic.User user26 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str27 = user26.password;
        logic.ParkingSpot parkingSpot31 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean32 = parkingSpot31.isOccupied();
        boolean boolean33 = parkingSpot31.isEnabled();
        logic.Sensor sensor34 = parkingSpot31.getSensor();
        logic.BookingCommand bookingCommand35 = new logic.BookingCommand(bookingSystem21, user26, parkingSpot31);
        user26.id = '#';
        java.lang.String str38 = user26.name;
        user26.setId(10);
        booking20.user = user26;
        java.time.ZonedDateTime zonedDateTime42 = booking20.getBookingStartTime();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(sensor18);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(sensor34);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNull(zonedDateTime42);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        logic.BookingSystem bookingSystem0 = null;
        logic.User user5 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str6 = user5.password;
        logic.ParkingSpot parkingSpot10 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean11 = parkingSpot10.isOccupied();
        boolean boolean12 = parkingSpot10.isEnabled();
        logic.Sensor sensor13 = parkingSpot10.getSensor();
        logic.BookingCommand bookingCommand14 = new logic.BookingCommand(bookingSystem0, user5, parkingSpot10);
        logic.Sensor sensor16 = new logic.Sensor((int) ' ');
        sensor16.setCarArrived(true);
        DesignPatternClasses.Observer observer19 = null;
        sensor16.removeObserver(observer19);
        parkingSpot10.setSensor(sensor16);
        sensor16.notifyObservers();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(sensor13);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        logic.UserFactory userFactory0 = new logic.UserFactory();
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.time.ZonedDateTime zonedDateTime0 = null;
        java.time.ZonedDateTime zonedDateTime1 = null;
        logic.BookingSystem bookingSystem4 = null;
        logic.User user9 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str10 = user9.password;
        logic.ParkingSpot parkingSpot14 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean15 = parkingSpot14.isOccupied();
        boolean boolean16 = parkingSpot14.isEnabled();
        logic.Sensor sensor17 = parkingSpot14.getSensor();
        logic.BookingCommand bookingCommand18 = new logic.BookingCommand(bookingSystem4, user9, parkingSpot14);
        logic.Sensor sensor20 = new logic.Sensor((int) ' ');
        sensor20.setCarArrived(true);
        DesignPatternClasses.Observer observer23 = null;
        sensor20.removeObserver(observer23);
        parkingSpot14.setSensor(sensor20);
        logic.User user30 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str31 = user30.password;
        logic.PricingStrategy pricingStrategy32 = null;
        user30.setPricingStrategy(pricingStrategy32);
        logic.Booking booking34 = new logic.Booking(zonedDateTime0, zonedDateTime1, "Valid", false, parkingSpot14, user30);
        int int35 = booking34.getBookingId();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(sensor17);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
// flaky "1) test025(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        logic.User user4 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str5 = user4.password;
        logic.StudentPricing studentPricing6 = new logic.StudentPricing();
        double double8 = studentPricing6.calculatePrice((int) (short) 0);
        double double10 = studentPricing6.calculatePrice(32);
        user4.setPricingStrategy((logic.PricingStrategy) studentPricing6);
        double double13 = studentPricing6.calculatePrice((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.6666666666666665d + "'", double10 == 2.6666666666666665d);
        org.junit.Assert.assertTrue("'" + double13 + "' != '" + 0.8333333333333333d + "'", double13 == 0.8333333333333333d);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        logic.Sensor sensor1 = new logic.Sensor((int) ' ');
        boolean boolean2 = sensor1.isCarArrived();
        java.lang.String str3 = sensor1.getCurrentCarPlate();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        logic.Sensor sensor1 = new logic.Sensor((int) ' ');
        boolean boolean2 = sensor1.isCarArrived();
        java.lang.String str3 = sensor1.getCurrentCarBrand();
        sensor1.setSensorId(0);
        boolean boolean6 = sensor1.isSensorOn();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        // The following exception was thrown during execution in test generation
        try {
            java.sql.Connection connection0 = Connections.DatabaseConnection.getConnection();
            org.junit.Assert.fail("Expected exception of type java.sql.SQLException; message: Database file not found at: C:/Users/kamil/Downloads/D2/D2/csv-example/CSV-example/src/Resources/parkingsystem.db");
        } catch (java.sql.SQLException e) {
            // Expected exception.
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        logic.Sensor sensor1 = new logic.Sensor((int) (byte) 100);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        logic.User user5 = logic.UserFactory.createUser("hi!", "", (int) (byte) 100, "", "");
        org.junit.Assert.assertNull(user5);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        logic.FacultyPricing facultyPricing0 = new logic.FacultyPricing();
        double double2 = facultyPricing0.calculatePrice((int) (byte) 100);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 13.333333333333334d + "'", double2 == 13.333333333333334d);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        logic.ParkingManager parkingManager0 = null;
        logic.EnableParkingSpotCommand enableParkingSpotCommand2 = new logic.EnableParkingSpotCommand(parkingManager0, "");
        // The following exception was thrown during execution in test generation
        try {
            enableParkingSpotCommand2.undo();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"logic.ParkingManager.disableSpot(String)\" because \"this.manager\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        logic.SuperManager superManager0 = logic.SuperManager.getInstance();
        superManager0.addParkingLot();
        logic.ParkingSpot parkingSpot5 = new logic.ParkingSpot("hi!", false, false);
        java.lang.String str6 = parkingSpot5.toString();
        parkingSpot5.setLocation("Valid");
        superManager0.disableParkingSpot(parkingSpot5);
        java.lang.String str10 = parkingSpot5.getId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]" + "'", str6, "ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "hi!" + "'", str10, "hi!");
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        logic.NonFacultyPricing nonFacultyPricing0 = new logic.NonFacultyPricing();
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        logic.Sensor sensor1 = new logic.Sensor((int) ' ');
        sensor1.setCarArrived(true);
        java.time.ZonedDateTime zonedDateTime4 = null;
        sensor1.activateSensor(zonedDateTime4);
        sensor1.clearCurrentCarInfo();
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        logic.SuperManager superManager0 = logic.SuperManager.getInstance();
        superManager0.addParkingLot();
        superManager0.setName("Valid");
        logic.ParkingLot parkingLot4 = null;
        // The following exception was thrown during execution in test generation
        try {
            superManager0.enableParkingLot(parkingLot4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"logic.ParkingLot.getId()\" because \"lot\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        logic.ParkingSpot parkingSpot5 = new logic.ParkingSpot("hi!", "ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]", false, false, 0);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        logic.Sensor sensor1 = new logic.Sensor((int) ' ');
        sensor1.setCarArrived(true);
        DesignPatternClasses.Observer observer4 = null;
        sensor1.removeObserver(observer4);
        sensor1.setCarArrived(false);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        logic.SuperManager superManager0 = logic.SuperManager.getInstance();
        superManager0.addParkingLot();
        superManager0.setName("Valid");
        superManager0.requestAccountGeneration();
        superManager0.setName("ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]");
        logic.SuperManager superManager7 = logic.SuperManager.getInstance();
        superManager7.addParkingLot();
        superManager7.setName("Valid");
        superManager7.requestAccountGeneration();
        superManager7.setName("ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]");
        superManager0.enableManager((logic.User) superManager7);
        superManager0.email = "Valid";
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertNotNull(superManager7);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        logic.User user4 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        logic.BookingSystem bookingSystem5 = null;
        logic.User user10 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str11 = user10.password;
        logic.ParkingSpot parkingSpot15 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean16 = parkingSpot15.isOccupied();
        boolean boolean17 = parkingSpot15.isEnabled();
        logic.Sensor sensor18 = parkingSpot15.getSensor();
        logic.BookingCommand bookingCommand19 = new logic.BookingCommand(bookingSystem5, user10, parkingSpot15);
        logic.Booking booking20 = new logic.Booking(user4, parkingSpot15);
        logic.BookingSystem bookingSystem21 = null;
        logic.User user26 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str27 = user26.password;
        logic.ParkingSpot parkingSpot31 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean32 = parkingSpot31.isOccupied();
        boolean boolean33 = parkingSpot31.isEnabled();
        logic.Sensor sensor34 = parkingSpot31.getSensor();
        logic.BookingCommand bookingCommand35 = new logic.BookingCommand(bookingSystem21, user26, parkingSpot31);
        user26.id = '#';
        java.lang.String str38 = user26.name;
        user26.setId(10);
        booking20.user = user26;
        logic.ParkingSpot parkingSpot42 = booking20.getSpot();
        java.lang.String str43 = parkingSpot42.getLotId();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(sensor18);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(sensor34);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(parkingSpot42);
        org.junit.Assert.assertNull(str43);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        logic.SuperManager superManager0 = logic.SuperManager.getInstance();
        superManager0.addParkingLot();
        superManager0.setName("Valid");
        superManager0.requestAccountGeneration();
        superManager0.setName("ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]");
        logic.ParkingLot parkingLot7 = null;
        // The following exception was thrown during execution in test generation
        try {
            superManager0.disableParkingLot(parkingLot7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"logic.ParkingLot.getId()\" because \"lot\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        logic.Sensor sensor1 = new logic.Sensor((int) ' ');
        sensor1.setCarArrived(true);
        DesignPatternClasses.Observer observer4 = null;
        sensor1.removeObserver(observer4);
        sensor1.notifyObservers();
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        logic.SuperManager superManager0 = logic.SuperManager.getInstance();
        superManager0.addParkingLot();
        superManager0.setName("Valid");
        java.lang.String str4 = superManager0.getName();
        logic.ParkingLot parkingLot5 = null;
        // The following exception was thrown during execution in test generation
        try {
            superManager0.enableParkingLot(parkingLot5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"logic.ParkingLot.getId()\" because \"lot\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Valid" + "'", str4, "Valid");
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        logic.Sensor sensor1 = new logic.Sensor((int) ' ');
        sensor1.setCarArrived(true);
        DesignPatternClasses.Observer observer4 = null;
        sensor1.removeObserver(observer4);
        java.time.ZonedDateTime zonedDateTime6 = sensor1.getSensorActivationTime();
        sensor1.setCarArrived(true);
        org.junit.Assert.assertNull(zonedDateTime6);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        logic.Sensor sensor1 = new logic.Sensor((int) ' ');
        sensor1.setCarArrived(true);
        java.time.ZonedDateTime zonedDateTime4 = null;
        sensor1.activateSensor(zonedDateTime4);
        sensor1.setSensorOn(false);
        java.time.ZonedDateTime zonedDateTime8 = null;
        sensor1.deactivateSensor(zonedDateTime8);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        java.sql.Connection connection0 = null;
        Connections.DatabaseDAO databaseDAO1 = new Connections.DatabaseDAO(connection0);
        logic.Student student6 = new logic.Student("ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]", (-1), "ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]", "ParkingSpot [id=, location=, enabled=true, occupied=false]");
        // The following exception was thrown during execution in test generation
        try {
            databaseDAO1.addStudent(student6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.Connection.prepareStatement(String)\" because \"this.connection\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        logic.SuperManager superManager0 = logic.SuperManager.getInstance();
        superManager0.addParkingLot();
        superManager0.setName("Valid");
        java.lang.String str4 = superManager0.getName();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Valid" + "'", str4, "Valid");
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        java.sql.Connection connection0 = null;
        Connections.DatabaseDAO databaseDAO1 = new Connections.DatabaseDAO(connection0);
        // The following exception was thrown during execution in test generation
        try {
            databaseDAO1.updateParkingSpotStatus((int) (short) 0, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.Connection.prepareStatement(String)\" because \"this.connection\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        java.sql.Connection connection0 = null;
        Connections.DatabaseDAO databaseDAO1 = new Connections.DatabaseDAO(connection0);
        logic.Sensor sensor3 = new logic.Sensor((int) ' ');
        sensor3.setCarArrived(true);
        DesignPatternClasses.Observer observer6 = null;
        sensor3.removeObserver(observer6);
        sensor3.setCarArrived(true);
        // The following exception was thrown during execution in test generation
        try {
            databaseDAO1.addSensor(sensor3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.Connection.prepareStatement(String)\" because \"this.connection\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        logic.User user4 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        logic.BookingSystem bookingSystem5 = null;
        logic.User user10 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str11 = user10.password;
        logic.ParkingSpot parkingSpot15 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean16 = parkingSpot15.isOccupied();
        boolean boolean17 = parkingSpot15.isEnabled();
        logic.Sensor sensor18 = parkingSpot15.getSensor();
        logic.BookingCommand bookingCommand19 = new logic.BookingCommand(bookingSystem5, user10, parkingSpot15);
        logic.Booking booking20 = new logic.Booking(user4, parkingSpot15);
        logic.BookingSystem bookingSystem21 = null;
        logic.User user26 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str27 = user26.password;
        logic.ParkingSpot parkingSpot31 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean32 = parkingSpot31.isOccupied();
        boolean boolean33 = parkingSpot31.isEnabled();
        logic.Sensor sensor34 = parkingSpot31.getSensor();
        logic.BookingCommand bookingCommand35 = new logic.BookingCommand(bookingSystem21, user26, parkingSpot31);
        user26.id = '#';
        java.lang.String str38 = user26.name;
        user26.setId(10);
        booking20.user = user26;
        boolean boolean42 = booking20.isShowUp();
        boolean boolean43 = booking20.isShowUp();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(sensor18);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(sensor34);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        java.sql.Connection connection0 = null;
        Connections.DatabaseDAO databaseDAO1 = new Connections.DatabaseDAO(connection0);
        // The following exception was thrown during execution in test generation
        try {
            logic.Visitor visitor3 = databaseDAO1.getVisitor((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.Connection.prepareStatement(String)\" because \"this.connection\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        logic.Sensor sensor1 = new logic.Sensor((int) ' ');
        boolean boolean2 = sensor1.isCarArrived();
        java.lang.String str3 = sensor1.getCurrentCarBrand();
        java.util.List<DesignPatternClasses.Observer> observerList4 = sensor1.getObservers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(observerList4);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        logic.Sensor sensor1 = new logic.Sensor((int) ' ');
        sensor1.setCarArrived(true);
        DesignPatternClasses.Observer observer4 = null;
        sensor1.removeObserver(observer4);
        sensor1.setCarArrived(true);
        java.lang.String str8 = sensor1.getCurrentCarColor();
        sensor1.setCurrentCarModel("ParkingSpot [id=, location=, enabled=true, occupied=false]");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        logic.SuperManager superManager0 = logic.SuperManager.getInstance();
        superManager0.addParkingLot();
        superManager0.setName("Valid");
        superManager0.requestAccountGeneration();
        logic.User user9 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        logic.BookingSystem bookingSystem10 = null;
        logic.User user15 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str16 = user15.password;
        logic.ParkingSpot parkingSpot20 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean21 = parkingSpot20.isOccupied();
        boolean boolean22 = parkingSpot20.isEnabled();
        logic.Sensor sensor23 = parkingSpot20.getSensor();
        logic.BookingCommand bookingCommand24 = new logic.BookingCommand(bookingSystem10, user15, parkingSpot20);
        logic.Booking booking25 = new logic.Booking(user9, parkingSpot20);
        logic.BookingSystem bookingSystem26 = null;
        logic.User user31 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str32 = user31.password;
        logic.ParkingSpot parkingSpot36 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean37 = parkingSpot36.isOccupied();
        boolean boolean38 = parkingSpot36.isEnabled();
        logic.Sensor sensor39 = parkingSpot36.getSensor();
        logic.BookingCommand bookingCommand40 = new logic.BookingCommand(bookingSystem26, user31, parkingSpot36);
        user31.id = '#';
        java.lang.String str43 = user31.name;
        user31.setId(10);
        booking25.user = user31;
        superManager0.disableManager(user31);
        logic.ParkingLot parkingLot48 = null;
        // The following exception was thrown during execution in test generation
        try {
            superManager0.disableParkingLot(parkingLot48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"logic.ParkingLot.getId()\" because \"lot\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(sensor23);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(sensor39);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.sql.Connection connection0 = null;
        Connections.DatabaseDAO databaseDAO1 = new Connections.DatabaseDAO(connection0);
        logic.User user6 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str7 = user6.password;
        logic.PricingStrategy pricingStrategy8 = null;
        user6.setPricingStrategy(pricingStrategy8);
        // The following exception was thrown during execution in test generation
        try {
            databaseDAO1.addUser(user6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.Connection.prepareStatement(String)\" because \"this.connection\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        java.sql.Connection connection0 = null;
        Connections.DatabaseDAO databaseDAO1 = new Connections.DatabaseDAO(connection0);
        // The following exception was thrown during execution in test generation
        try {
            logic.Visitor visitor3 = databaseDAO1.getVisitor((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.Connection.prepareStatement(String)\" because \"this.connection\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        logic.ValidState validState1 = new logic.ValidState(0);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        logic.User user4 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        logic.BookingSystem bookingSystem5 = null;
        logic.User user10 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str11 = user10.password;
        logic.ParkingSpot parkingSpot15 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean16 = parkingSpot15.isOccupied();
        boolean boolean17 = parkingSpot15.isEnabled();
        logic.Sensor sensor18 = parkingSpot15.getSensor();
        logic.BookingCommand bookingCommand19 = new logic.BookingCommand(bookingSystem5, user10, parkingSpot15);
        logic.Booking booking20 = new logic.Booking(user4, parkingSpot15);
        logic.BookingSystem bookingSystem21 = null;
        logic.User user26 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str27 = user26.password;
        logic.ParkingSpot parkingSpot31 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean32 = parkingSpot31.isOccupied();
        boolean boolean33 = parkingSpot31.isEnabled();
        logic.Sensor sensor34 = parkingSpot31.getSensor();
        logic.BookingCommand bookingCommand35 = new logic.BookingCommand(bookingSystem21, user26, parkingSpot31);
        user26.id = '#';
        java.lang.String str38 = user26.name;
        user26.setId(10);
        booking20.user = user26;
        logic.ParkingSpot parkingSpot42 = booking20.getSpot();
        java.time.ZonedDateTime zonedDateTime43 = booking20.getBookingEndTime();
        logic.FacultyMember facultyMember48 = new logic.FacultyMember("ParkingSpot [id=, location=, enabled=true, occupied=false]", (int) (byte) 1, "hi!", "");
        logic.ParkingSpot parkingSpot53 = new logic.ParkingSpot("", false, true, "");
        logic.Booking booking55 = facultyMember48.bookParkingLot(parkingSpot53, (int) (byte) 1);
        booking20.setSpot(parkingSpot53);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(sensor18);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(sensor34);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(parkingSpot42);
        org.junit.Assert.assertNull(zonedDateTime43);
        org.junit.Assert.assertNotNull(booking55);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        logic.ParkingManager parkingManager0 = null;
        logic.EnableParkingSpotCommand enableParkingSpotCommand2 = new logic.EnableParkingSpotCommand(parkingManager0, "");
        // The following exception was thrown during execution in test generation
        try {
            enableParkingSpotCommand2.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"logic.ParkingManager.enableSpot(String)\" because \"this.manager\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        logic.FacultyMember facultyMember4 = new logic.FacultyMember("ParkingSpot [id=, location=, enabled=true, occupied=false]", (int) (byte) 1, "hi!", "");
        logic.ParkingSpot parkingSpot9 = new logic.ParkingSpot("", false, true, "");
        logic.Booking booking11 = facultyMember4.bookParkingLot(parkingSpot9, (int) (byte) 1);
        parkingSpot9.setLocation("hi!");
        org.junit.Assert.assertNotNull(booking11);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        logic.SuperManager superManager0 = logic.SuperManager.getInstance();
        boolean boolean2 = superManager0.authenticate((int) (byte) 0);
        java.lang.String str3 = superManager0.getEmail();
        superManager0.monitorParking();
        superManager0.setName("hi!");
        org.junit.Assert.assertNotNull(superManager0);
// flaky "2) test062(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Valid" + "'", str3, "Valid");
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        logic.SuperManager superManager0 = logic.SuperManager.getInstance();
        superManager0.addParkingLot();
        superManager0.setName("Valid");
        superManager0.requestAccountGeneration();
        superManager0.setName("ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]");
        logic.SuperManager superManager7 = logic.SuperManager.getInstance();
        superManager7.addParkingLot();
        superManager7.setName("Valid");
        superManager7.requestAccountGeneration();
        superManager7.setName("ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]");
        superManager0.enableManager((logic.User) superManager7);
        superManager0.setId(0);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertNotNull(superManager7);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        logic.SuperManager superManager0 = logic.SuperManager.getInstance();
        superManager0.addParkingLot();
        superManager0.setName("Valid");
        superManager0.requestAccountGeneration();
        superManager0.setName("ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]");
        superManager0.addParkingLot();
        superManager0.monitorParking();
        superManager0.id = (byte) 100;
        org.junit.Assert.assertNotNull(superManager0);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        logic.ParkingManager parkingManager0 = new logic.ParkingManager();
        boolean boolean2 = parkingManager0.enableSpot("ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]");
        boolean boolean4 = parkingManager0.addSpot("Valid");
        int int5 = parkingManager0.getSpotsCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 28 + "'", int5 == 28);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.sql.Connection connection0 = null;
        Connections.DatabaseDAO databaseDAO1 = new Connections.DatabaseDAO(connection0);
        // The following exception was thrown during execution in test generation
        try {
            logic.Sensor sensor3 = databaseDAO1.getSensorBySpotId((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.Connection.prepareStatement(String)\" because \"this.connection\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        logic.ParkingSpot parkingSpot5 = new logic.ParkingSpot("", "ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]", true, false, (int) 'a');
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        logic.ValidState validState1 = new logic.ValidState(32);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        logic.User user4 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        logic.BookingSystem bookingSystem5 = null;
        logic.User user10 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str11 = user10.password;
        logic.ParkingSpot parkingSpot15 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean16 = parkingSpot15.isOccupied();
        boolean boolean17 = parkingSpot15.isEnabled();
        logic.Sensor sensor18 = parkingSpot15.getSensor();
        logic.BookingCommand bookingCommand19 = new logic.BookingCommand(bookingSystem5, user10, parkingSpot15);
        logic.Booking booking20 = new logic.Booking(user4, parkingSpot15);
        logic.BookingSystem bookingSystem21 = null;
        logic.User user26 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str27 = user26.password;
        logic.ParkingSpot parkingSpot31 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean32 = parkingSpot31.isOccupied();
        boolean boolean33 = parkingSpot31.isEnabled();
        logic.Sensor sensor34 = parkingSpot31.getSensor();
        logic.BookingCommand bookingCommand35 = new logic.BookingCommand(bookingSystem21, user26, parkingSpot31);
        user26.id = '#';
        java.lang.String str38 = user26.name;
        user26.setId(10);
        booking20.user = user26;
        boolean boolean42 = booking20.isShowUp();
        logic.ParkingSpot parkingSpot43 = booking20.getSpot();
        java.time.ZonedDateTime zonedDateTime44 = null;
        booking20.setBookingStartTime(zonedDateTime44);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(sensor18);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(sensor34);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(parkingSpot43);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        java.sql.Connection connection0 = null;
        Connections.DatabaseDAO databaseDAO1 = new Connections.DatabaseDAO(connection0);
        logic.SuperManager superManager2 = logic.SuperManager.getInstance();
        superManager2.addParkingLot();
        superManager2.setName("Valid");
        superManager2.requestAccountGeneration();
        superManager2.setName("ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]");
        logic.SuperManager superManager9 = logic.SuperManager.getInstance();
        superManager9.addParkingLot();
        superManager9.setName("Valid");
        superManager9.requestAccountGeneration();
        superManager9.setName("ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]");
        superManager2.enableManager((logic.User) superManager9);
        // The following exception was thrown during execution in test generation
        try {
            databaseDAO1.addUser((logic.User) superManager2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.Connection.prepareStatement(String)\" because \"this.connection\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager2);
        org.junit.Assert.assertNotNull(superManager9);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        logic.SuperManager superManager0 = logic.SuperManager.getInstance();
        superManager0.addParkingLot();
        superManager0.setName("Valid");
        superManager0.requestAccountGeneration();
        superManager0.setName("ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]");
        superManager0.addParkingLot();
        superManager0.monitorParking();
        int int9 = superManager0.getId();
        logic.ParkingLot parkingLot10 = null;
        // The following exception was thrown during execution in test generation
        try {
            superManager0.disableParkingLot(parkingLot10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"logic.ParkingLot.getId()\" because \"lot\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        java.sql.Connection connection0 = null;
        Connections.DatabaseDAO databaseDAO1 = new Connections.DatabaseDAO(connection0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList3 = databaseDAO1.getAvailableParkingSpots((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.Connection.prepareStatement(String)\" because \"this.connection\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        logic.ParkingSpot parkingSpot5 = new logic.ParkingSpot("Valid", "", false, false, (int) (short) 100);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        logic.SuperManager superManager0 = logic.SuperManager.getInstance();
        superManager0.addParkingLot();
        superManager0.setName("Valid");
        superManager0.requestAccountGeneration();
        superManager0.setName("ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]");
        logic.SuperManager superManager7 = logic.SuperManager.getInstance();
        superManager7.addParkingLot();
        superManager7.setName("Valid");
        superManager7.requestAccountGeneration();
        superManager7.setName("ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]");
        superManager0.enableManager((logic.User) superManager7);
        int int15 = superManager7.getSuperMgrID();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertNotNull(superManager7);
// flaky "3) test074(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 100 + "'", int15 == 100);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        logic.Sensor sensor1 = new logic.Sensor((int) ' ');
        sensor1.setCarArrived(true);
        DesignPatternClasses.Observer observer4 = null;
        sensor1.removeObserver(observer4);
        java.time.ZonedDateTime zonedDateTime6 = sensor1.getSensorActivationTime();
        sensor1.setCarArrived(false);
        org.junit.Assert.assertNull(zonedDateTime6);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        logic.SuperManager superManager0 = logic.SuperManager.getInstance();
        superManager0.addParkingLot();
        superManager0.setName("Valid");
        superManager0.requestAccountGeneration();
        logic.ParkingLot parkingLot5 = null;
        // The following exception was thrown during execution in test generation
        try {
            superManager0.disableParkingLot(parkingLot5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"logic.ParkingLot.getId()\" because \"lot\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        logic.VisitorPricing visitorPricing0 = new logic.VisitorPricing();
        double double2 = visitorPricing0.calculatePrice((int) (short) 10);
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 2.5d + "'", double2 == 2.5d);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        logic.StudentPricing studentPricing0 = new logic.StudentPricing();
        double double2 = studentPricing0.calculatePrice((int) (short) 0);
        java.lang.Class<?> wildcardClass3 = studentPricing0.getClass();
        org.junit.Assert.assertTrue("'" + double2 + "' != '" + 0.0d + "'", double2 == 0.0d);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        logic.NonFacultyStaff nonFacultyStaff4 = new logic.NonFacultyStaff("ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]", 10, "hi!", "ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]");
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        logic.SuperManager superManager0 = logic.SuperManager.getInstance();
        superManager0.addParkingLot();
        superManager0.setName("Valid");
        superManager0.requestAccountGeneration();
        logic.ParkingLot parkingLot5 = null;
        // The following exception was thrown during execution in test generation
        try {
            superManager0.enableParkingLot(parkingLot5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"logic.ParkingLot.getId()\" because \"lot\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        logic.User user4 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        logic.BookingSystem bookingSystem5 = null;
        logic.User user10 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str11 = user10.password;
        logic.ParkingSpot parkingSpot15 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean16 = parkingSpot15.isOccupied();
        boolean boolean17 = parkingSpot15.isEnabled();
        logic.Sensor sensor18 = parkingSpot15.getSensor();
        logic.BookingCommand bookingCommand19 = new logic.BookingCommand(bookingSystem5, user10, parkingSpot15);
        logic.Booking booking20 = new logic.Booking(user4, parkingSpot15);
        logic.BookingSystem bookingSystem21 = null;
        logic.User user26 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str27 = user26.password;
        logic.ParkingSpot parkingSpot31 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean32 = parkingSpot31.isOccupied();
        boolean boolean33 = parkingSpot31.isEnabled();
        logic.Sensor sensor34 = parkingSpot31.getSensor();
        logic.BookingCommand bookingCommand35 = new logic.BookingCommand(bookingSystem21, user26, parkingSpot31);
        user26.id = '#';
        java.lang.String str38 = user26.name;
        user26.setId(10);
        booking20.user = user26;
        boolean boolean42 = booking20.isShowUp();
        java.time.ZonedDateTime zonedDateTime43 = booking20.getBookingEndTime();
        int int44 = booking20.userId;
        booking20.setSensorId((-1));
        java.lang.String str47 = booking20.email;
        booking20.bookingId = 0;
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(sensor18);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(sensor34);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(zonedDateTime43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNull(str47);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        logic.BookingSystem bookingSystem0 = null;
        logic.User user5 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str6 = user5.password;
        logic.ParkingSpot parkingSpot10 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean11 = parkingSpot10.isOccupied();
        boolean boolean12 = parkingSpot10.isEnabled();
        logic.Sensor sensor13 = parkingSpot10.getSensor();
        logic.BookingCommand bookingCommand14 = new logic.BookingCommand(bookingSystem0, user5, parkingSpot10);
        user5.id = '#';
        java.lang.String str17 = user5.name;
        user5.setId(10);
        logic.StudentPricing studentPricing20 = new logic.StudentPricing();
        double double22 = studentPricing20.calculatePrice((int) (short) 0);
        user5.setPricingStrategy((logic.PricingStrategy) studentPricing20);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(sensor13);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
        org.junit.Assert.assertTrue("'" + double22 + "' != '" + 0.0d + "'", double22 == 0.0d);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        logic.ParkingManager parkingManager0 = new logic.ParkingManager();
        logic.AddParkingSpotCommand addParkingSpotCommand2 = new logic.AddParkingSpotCommand(parkingManager0, "ParkingSpot [id=, location=, enabled=true, occupied=false]");
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        java.sql.Connection connection0 = null;
        Connections.DatabaseDAO databaseDAO1 = new Connections.DatabaseDAO(connection0);
        logic.ParkingLot parkingLot3 = new logic.ParkingLot("Valid");
        // The following exception was thrown during execution in test generation
        try {
            databaseDAO1.addParkingLot(parkingLot3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.Connection.prepareStatement(String)\" because \"this.connection\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.sql.Connection connection0 = null;
        Connections.DatabaseDAO databaseDAO1 = new Connections.DatabaseDAO(connection0);
        logic.User user6 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        logic.BookingSystem bookingSystem7 = null;
        logic.User user12 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str13 = user12.password;
        logic.ParkingSpot parkingSpot17 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean18 = parkingSpot17.isOccupied();
        boolean boolean19 = parkingSpot17.isEnabled();
        logic.Sensor sensor20 = parkingSpot17.getSensor();
        logic.BookingCommand bookingCommand21 = new logic.BookingCommand(bookingSystem7, user12, parkingSpot17);
        logic.Booking booking22 = new logic.Booking(user6, parkingSpot17);
        logic.BookingSystem bookingSystem23 = null;
        logic.User user28 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str29 = user28.password;
        logic.ParkingSpot parkingSpot33 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean34 = parkingSpot33.isOccupied();
        boolean boolean35 = parkingSpot33.isEnabled();
        logic.Sensor sensor36 = parkingSpot33.getSensor();
        logic.BookingCommand bookingCommand37 = new logic.BookingCommand(bookingSystem23, user28, parkingSpot33);
        user28.id = '#';
        java.lang.String str40 = user28.name;
        user28.setId(10);
        booking22.user = user28;
        boolean boolean44 = booking22.isShowUp();
        logic.ParkingSpot parkingSpot45 = booking22.getSpot();
        booking22.setShowUp(false);
        // The following exception was thrown during execution in test generation
        try {
            databaseDAO1.addBooking(booking22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.Connection.prepareStatement(String)\" because \"this.connection\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNull(sensor20);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(sensor36);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "hi!" + "'", str40, "hi!");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(parkingSpot45);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        java.sql.Connection connection0 = null;
        Connections.DatabaseDAO databaseDAO1 = new Connections.DatabaseDAO(connection0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.Integer> intList2 = databaseDAO1.getAllParkingLots();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.Connection.createStatement()\" because \"this.connection\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        logic.ParkingSpot parkingSpot3 = new logic.ParkingSpot("hi!", false, false);
        parkingSpot3.setEnabled(true);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        logic.CreditCardPaymentStrategy creditCardPaymentStrategy0 = new logic.CreditCardPaymentStrategy();
        logic.User user1 = new logic.User();
        java.lang.String str2 = user1.getEmail();
        boolean boolean4 = creditCardPaymentStrategy0.pay(user1, 2.5d);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        logic.User user4 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        logic.BookingSystem bookingSystem5 = null;
        logic.User user10 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str11 = user10.password;
        logic.ParkingSpot parkingSpot15 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean16 = parkingSpot15.isOccupied();
        boolean boolean17 = parkingSpot15.isEnabled();
        logic.Sensor sensor18 = parkingSpot15.getSensor();
        logic.BookingCommand bookingCommand19 = new logic.BookingCommand(bookingSystem5, user10, parkingSpot15);
        logic.Booking booking20 = new logic.Booking(user4, parkingSpot15);
        logic.BookingSystem bookingSystem21 = null;
        logic.User user26 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str27 = user26.password;
        logic.ParkingSpot parkingSpot31 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean32 = parkingSpot31.isOccupied();
        boolean boolean33 = parkingSpot31.isEnabled();
        logic.Sensor sensor34 = parkingSpot31.getSensor();
        logic.BookingCommand bookingCommand35 = new logic.BookingCommand(bookingSystem21, user26, parkingSpot31);
        user26.id = '#';
        java.lang.String str38 = user26.name;
        user26.setId(10);
        booking20.user = user26;
        logic.ParkingSpot parkingSpot42 = booking20.getSpot();
        java.time.ZonedDateTime zonedDateTime43 = booking20.getBookingEndTime();
        java.time.ZonedDateTime zonedDateTime44 = booking20.bookingStartTime;
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(sensor18);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(sensor34);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(parkingSpot42);
        org.junit.Assert.assertNull(zonedDateTime43);
        org.junit.Assert.assertNull(zonedDateTime44);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        logic.Sensor sensor1 = new logic.Sensor((int) ' ');
        boolean boolean2 = sensor1.isCarArrived();
        java.lang.String str3 = sensor1.getCurrentCarBrand();
        java.time.ZonedDateTime zonedDateTime4 = null;
        sensor1.activateSensor(zonedDateTime4);
        logic.Booking booking6 = new logic.Booking();
        sensor1.removeObserver((DesignPatternClasses.Observer) booking6);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        logic.SuperManager superManager0 = logic.SuperManager.getInstance();
        superManager0.addParkingLot();
        superManager0.setName("Valid");
        superManager0.requestAccountGeneration();
        superManager0.setName("ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]");
        java.lang.String str7 = superManager0.getPassword();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "adminpass" + "'", str7, "adminpass");
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        logic.User user4 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        logic.BookingSystem bookingSystem5 = null;
        logic.User user10 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str11 = user10.password;
        logic.ParkingSpot parkingSpot15 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean16 = parkingSpot15.isOccupied();
        boolean boolean17 = parkingSpot15.isEnabled();
        logic.Sensor sensor18 = parkingSpot15.getSensor();
        logic.BookingCommand bookingCommand19 = new logic.BookingCommand(bookingSystem5, user10, parkingSpot15);
        logic.Booking booking20 = new logic.Booking(user4, parkingSpot15);
        java.lang.String str21 = parkingSpot15.getLotId();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(sensor18);
        org.junit.Assert.assertNull(str21);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        logic.Sensor sensor1 = new logic.Sensor((int) ' ');
        boolean boolean2 = sensor1.isCarArrived();
        java.lang.String str3 = sensor1.getCurrentCarBrand();
        logic.User user8 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        logic.BookingSystem bookingSystem9 = null;
        logic.User user14 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str15 = user14.password;
        logic.ParkingSpot parkingSpot19 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean20 = parkingSpot19.isOccupied();
        boolean boolean21 = parkingSpot19.isEnabled();
        logic.Sensor sensor22 = parkingSpot19.getSensor();
        logic.BookingCommand bookingCommand23 = new logic.BookingCommand(bookingSystem9, user14, parkingSpot19);
        logic.Booking booking24 = new logic.Booking(user8, parkingSpot19);
        sensor1.removeObserver((DesignPatternClasses.Observer) booking24);
        logic.BookingSystem bookingSystem26 = null;
        logic.User user31 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str32 = user31.password;
        logic.ParkingSpot parkingSpot36 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean37 = parkingSpot36.isOccupied();
        boolean boolean38 = parkingSpot36.isEnabled();
        logic.Sensor sensor39 = parkingSpot36.getSensor();
        logic.BookingCommand bookingCommand40 = new logic.BookingCommand(bookingSystem26, user31, parkingSpot36);
        user31.id = '#';
        java.lang.String str43 = user31.name;
        booking24.user = user31;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(sensor22);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(sensor39);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        logic.Student student4 = new logic.Student("Valid", (int) (byte) 0, "ParkingSpot [id=, location=, enabled=true, occupied=false]", "");
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        logic.User user4 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        logic.BookingSystem bookingSystem5 = null;
        logic.User user10 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str11 = user10.password;
        logic.ParkingSpot parkingSpot15 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean16 = parkingSpot15.isOccupied();
        boolean boolean17 = parkingSpot15.isEnabled();
        logic.Sensor sensor18 = parkingSpot15.getSensor();
        logic.BookingCommand bookingCommand19 = new logic.BookingCommand(bookingSystem5, user10, parkingSpot15);
        logic.Booking booking20 = new logic.Booking(user4, parkingSpot15);
        logic.BookingSystem bookingSystem21 = null;
        logic.User user26 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str27 = user26.password;
        logic.ParkingSpot parkingSpot31 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean32 = parkingSpot31.isOccupied();
        boolean boolean33 = parkingSpot31.isEnabled();
        logic.Sensor sensor34 = parkingSpot31.getSensor();
        logic.BookingCommand bookingCommand35 = new logic.BookingCommand(bookingSystem21, user26, parkingSpot31);
        user26.id = '#';
        java.lang.String str38 = user26.name;
        user26.setId(10);
        booking20.user = user26;
        logic.ParkingSpot parkingSpot42 = booking20.getSpot();
        java.time.ZonedDateTime zonedDateTime43 = booking20.getBookingEndTime();
        int int44 = booking20.userId;
        java.time.ZonedDateTime zonedDateTime45 = null;
        booking20.bookingEndTime = zonedDateTime45;
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(sensor18);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(sensor34);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(parkingSpot42);
        org.junit.Assert.assertNull(zonedDateTime43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        logic.SuperManager superManager0 = logic.SuperManager.getInstance();
        boolean boolean2 = superManager0.authenticate((int) (byte) 0);
        superManager0.requestAccountGeneration();
        logic.SuperManager superManager4 = logic.SuperManager.getInstance();
        superManager4.addParkingLot();
        superManager0.disableManager((logic.User) superManager4);
        superManager4.setName("adminpass");
        org.junit.Assert.assertNotNull(superManager0);
// flaky "4) test096(RegressionTest0)":         org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(superManager4);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        logic.User user4 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        logic.BookingSystem bookingSystem5 = null;
        logic.User user10 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str11 = user10.password;
        logic.ParkingSpot parkingSpot15 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean16 = parkingSpot15.isOccupied();
        boolean boolean17 = parkingSpot15.isEnabled();
        logic.Sensor sensor18 = parkingSpot15.getSensor();
        logic.BookingCommand bookingCommand19 = new logic.BookingCommand(bookingSystem5, user10, parkingSpot15);
        logic.Booking booking20 = new logic.Booking(user4, parkingSpot15);
        java.time.ZonedDateTime zonedDateTime21 = booking20.bookingEndTime;
        booking20.setBookingId((int) (short) -1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(sensor18);
        org.junit.Assert.assertNull(zonedDateTime21);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        java.sql.Connection connection0 = null;
        Connections.DatabaseDAO databaseDAO1 = new Connections.DatabaseDAO(connection0);
        logic.Visitor visitor6 = new logic.Visitor("Valid", 1, "hi!", "Valid");
        // The following exception was thrown during execution in test generation
        try {
            databaseDAO1.addVisitor(visitor6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.Connection.prepareStatement(String)\" because \"this.connection\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        logic.SuperManager superManager0 = logic.SuperManager.getInstance();
        superManager0.addParkingLot();
        logic.ParkingSpot parkingSpot5 = new logic.ParkingSpot("hi!", false, false);
        java.lang.String str6 = parkingSpot5.toString();
        parkingSpot5.setLocation("Valid");
        superManager0.disableParkingSpot(parkingSpot5);
        superManager0.setSuperMgrID(100);
        superManager0.setName("Valid");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]" + "'", str6, "ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]");
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        logic.ValidState validState1 = new logic.ValidState(100);
        logic.ParkingBooking parkingBooking2 = null;
        // The following exception was thrown during execution in test generation
        try {
            validState1.extendBooking(parkingBooking2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"logic.ParkingBooking.setState(logic.BookingState)\" because \"booking\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        logic.User user4 = new logic.User("Valid", (int) (short) -1, "", "ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]");
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        DesignPatternClasses.Invoker invoker0 = new DesignPatternClasses.Invoker();
        invoker0.executeCommand();
        invoker0.executeCommand();
        invoker0.executeCommand();
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        logic.CompositeParkingLot compositeParkingLot1 = new logic.CompositeParkingLot("ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]");
        logic.ParkingSpot parkingSpot6 = new logic.ParkingSpot("", false, true, "");
        compositeParkingLot1.remove((logic.ParkingComponent) parkingSpot6);
        boolean boolean8 = compositeParkingLot1.isOccupied();
        java.lang.String str9 = compositeParkingLot1.getId();
        boolean boolean10 = compositeParkingLot1.isOccupied();
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]" + "'", str9, "ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.sql.Connection connection0 = null;
        Connections.DatabaseDAO databaseDAO1 = new Connections.DatabaseDAO(connection0);
        // The following exception was thrown during execution in test generation
        try {
            logic.NonFacultyStaff nonFacultyStaff3 = databaseDAO1.getNonFacultyStaff(2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.Connection.prepareStatement(String)\" because \"this.connection\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        logic.ParkingSpot parkingSpot5 = new logic.ParkingSpot("ParkingSpot [id=, location=, enabled=true, occupied=false]", true, true, "ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]", 0);
        java.lang.String str6 = parkingSpot5.getSpotId();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ParkingSpot [id=, location=, enabled=true, occupied=false]" + "'", str6, "ParkingSpot [id=, location=, enabled=true, occupied=false]");
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        logic.SuperManager superManager0 = logic.SuperManager.getInstance();
        boolean boolean2 = superManager0.authenticate((int) (byte) 0);
        java.lang.String str3 = superManager0.getEmail();
        java.lang.String str4 = superManager0.toString();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
// flaky "5) test106(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]" + "'", str3, "ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]");
// flaky "1) test106(RegressionTest0)":         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SuperManager [superMgrID=100, name=ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false], email=ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]]" + "'", str4, "SuperManager [superMgrID=100, name=ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false], email=ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]]");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        logic.Student student4 = new logic.Student("ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]", (-1), "ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]", "ParkingSpot [id=, location=, enabled=true, occupied=false]");
        logic.CompositeParkingLot compositeParkingLot6 = new logic.CompositeParkingLot("ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]");
        logic.ParkingSpot parkingSpot11 = new logic.ParkingSpot("", false, true, "");
        compositeParkingLot6.remove((logic.ParkingComponent) parkingSpot11);
        logic.Booking booking13 = new logic.Booking((logic.User) student4, parkingSpot11);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.sql.Connection connection0 = null;
        Connections.DatabaseDAO databaseDAO1 = new Connections.DatabaseDAO(connection0);
        logic.User user6 = new logic.User("ParkingSpot [id=, location=, enabled=true, occupied=false]", 10, "hi!", "ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]");
        // The following exception was thrown during execution in test generation
        try {
            databaseDAO1.addUserToSpecificTable(user6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.Connection.prepareStatement(String)\" because \"this.connection\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        logic.ParkingManager parkingManager0 = new logic.ParkingManager();
        boolean boolean2 = parkingManager0.addSpot("ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]");
        logic.AddParkingSpotCommand addParkingSpotCommand4 = new logic.AddParkingSpotCommand(parkingManager0, "ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]");
        java.util.List<logic.CompositeParkingLot> compositeParkingLotList5 = parkingManager0.getParkingLots();
        logic.DisableParkingSpotCommand disableParkingSpotCommand7 = new logic.DisableParkingSpotCommand(parkingManager0, "hi!");
        disableParkingSpotCommand7.execute();
        disableParkingSpotCommand7.undo();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(compositeParkingLotList5);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        logic.SuperManager superManager0 = logic.SuperManager.getInstance();
        superManager0.addParkingLot();
        superManager0.setName("Valid");
        superManager0.requestAccountGeneration();
        superManager0.setName("ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]");
        superManager0.setEmail("ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]");
        org.junit.Assert.assertNotNull(superManager0);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        logic.Sensor sensor1 = new logic.Sensor((int) ' ');
        boolean boolean2 = sensor1.isCarArrived();
        logic.User user7 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        logic.BookingSystem bookingSystem8 = null;
        logic.User user13 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str14 = user13.password;
        logic.ParkingSpot parkingSpot18 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean19 = parkingSpot18.isOccupied();
        boolean boolean20 = parkingSpot18.isEnabled();
        logic.Sensor sensor21 = parkingSpot18.getSensor();
        logic.BookingCommand bookingCommand22 = new logic.BookingCommand(bookingSystem8, user13, parkingSpot18);
        logic.Booking booking23 = new logic.Booking(user7, parkingSpot18);
        logic.BookingSystem bookingSystem24 = null;
        logic.User user29 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str30 = user29.password;
        logic.ParkingSpot parkingSpot34 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean35 = parkingSpot34.isOccupied();
        boolean boolean36 = parkingSpot34.isEnabled();
        logic.Sensor sensor37 = parkingSpot34.getSensor();
        logic.BookingCommand bookingCommand38 = new logic.BookingCommand(bookingSystem24, user29, parkingSpot34);
        user29.id = '#';
        java.lang.String str41 = user29.name;
        user29.setId(10);
        booking23.user = user29;
        logic.ParkingSpot parkingSpot45 = booking23.getSpot();
        boolean boolean46 = booking23.isShowUp();
        java.time.ZonedDateTime zonedDateTime47 = booking23.getBookingStartTime();
        java.time.ZonedDateTime zonedDateTime48 = booking23.bookingStartTime;
        sensor1.removeObserver((DesignPatternClasses.Observer) booking23);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNull(sensor21);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNull(sensor37);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "hi!" + "'", str41, "hi!");
        org.junit.Assert.assertNotNull(parkingSpot45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNull(zonedDateTime47);
        org.junit.Assert.assertNull(zonedDateTime48);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        logic.Booking booking0 = new logic.Booking();
        boolean boolean1 = booking0.isValid();
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        logic.Sensor sensor1 = new logic.Sensor((int) ' ');
        boolean boolean2 = sensor1.isCarArrived();
        java.lang.String str3 = sensor1.getCurrentCarBrand();
        logic.User user8 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        logic.BookingSystem bookingSystem9 = null;
        logic.User user14 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str15 = user14.password;
        logic.ParkingSpot parkingSpot19 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean20 = parkingSpot19.isOccupied();
        boolean boolean21 = parkingSpot19.isEnabled();
        logic.Sensor sensor22 = parkingSpot19.getSensor();
        logic.BookingCommand bookingCommand23 = new logic.BookingCommand(bookingSystem9, user14, parkingSpot19);
        logic.Booking booking24 = new logic.Booking(user8, parkingSpot19);
        sensor1.removeObserver((DesignPatternClasses.Observer) booking24);
        booking24.isValid = false;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(sensor22);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        DesignPatternClasses.Invoker invoker0 = new DesignPatternClasses.Invoker();
        invoker0.executeCommand();
        invoker0.undoLastCommand();
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        java.sql.Connection connection0 = null;
        Connections.DatabaseDAO databaseDAO1 = new Connections.DatabaseDAO(connection0);
        // The following exception was thrown during execution in test generation
        try {
            logic.Visitor visitor3 = databaseDAO1.getVisitor(32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.Connection.prepareStatement(String)\" because \"this.connection\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        logic.BookingSystem bookingSystem0 = null;
        logic.User user5 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str6 = user5.password;
        logic.ParkingSpot parkingSpot10 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean11 = parkingSpot10.isOccupied();
        boolean boolean12 = parkingSpot10.isEnabled();
        logic.Sensor sensor13 = parkingSpot10.getSensor();
        logic.BookingCommand bookingCommand14 = new logic.BookingCommand(bookingSystem0, user5, parkingSpot10);
        java.lang.String str15 = user5.getPassword();
        user5.setName("");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(sensor13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        logic.User user0 = new logic.User();
        java.lang.String str1 = user0.getEmail();
        logic.BookingSystem bookingSystem2 = null;
        logic.User user7 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str8 = user7.password;
        logic.ParkingSpot parkingSpot12 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean13 = parkingSpot12.isOccupied();
        boolean boolean14 = parkingSpot12.isEnabled();
        logic.Sensor sensor15 = parkingSpot12.getSensor();
        logic.BookingCommand bookingCommand16 = new logic.BookingCommand(bookingSystem2, user7, parkingSpot12);
        parkingSpot12.setLocation("ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]");
        // The following exception was thrown during execution in test generation
        try {
            logic.ParkingBooking parkingBooking20 = new logic.ParkingBooking(user0, parkingSpot12, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"logic.Sensor.getSensorId()\" because \"this.sensor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNull(sensor15);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        logic.User user4 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        logic.BookingSystem bookingSystem5 = null;
        logic.User user10 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str11 = user10.password;
        logic.ParkingSpot parkingSpot15 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean16 = parkingSpot15.isOccupied();
        boolean boolean17 = parkingSpot15.isEnabled();
        logic.Sensor sensor18 = parkingSpot15.getSensor();
        logic.BookingCommand bookingCommand19 = new logic.BookingCommand(bookingSystem5, user10, parkingSpot15);
        logic.Booking booking20 = new logic.Booking(user4, parkingSpot15);
        logic.BookingSystem bookingSystem21 = null;
        logic.User user26 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str27 = user26.password;
        logic.ParkingSpot parkingSpot31 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean32 = parkingSpot31.isOccupied();
        boolean boolean33 = parkingSpot31.isEnabled();
        logic.Sensor sensor34 = parkingSpot31.getSensor();
        logic.BookingCommand bookingCommand35 = new logic.BookingCommand(bookingSystem21, user26, parkingSpot31);
        user26.id = '#';
        java.lang.String str38 = user26.name;
        user26.setId(10);
        booking20.user = user26;
        logic.ParkingSpot parkingSpot42 = booking20.getSpot();
        boolean boolean43 = booking20.isShowUp();
        logic.ParkingSpot parkingSpot47 = new logic.ParkingSpot("hi!", false, false);
        java.lang.String str48 = parkingSpot47.toString();
        parkingSpot47.setLocation("Valid");
        java.lang.String str51 = parkingSpot47.getSpotId();
        booking20.spot = parkingSpot47;
        java.lang.String str53 = booking20.getCarLicensePlate();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(sensor18);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(sensor34);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(parkingSpot42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]" + "'", str48, "ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertNull(str53);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        logic.ParkingSpot parkingSpot3 = new logic.ParkingSpot("Valid", true, true);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        logic.ValidState validState1 = new logic.ValidState((int) (byte) 0);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        logic.ParkingSpot parkingSpot3 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean4 = parkingSpot3.isOccupied();
        boolean boolean5 = parkingSpot3.isEnabled();
        parkingSpot3.setSpotId("ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]");
        java.lang.String str8 = parkingSpot3.getLocation();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "General Lot" + "'", str8, "General Lot");
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        DesignPatternClasses.Invoker invoker0 = new DesignPatternClasses.Invoker();
        invoker0.executeCommand();
        java.util.List<DesignPatternClasses.Command> commandList2 = invoker0.getCommandHistory();
        org.junit.Assert.assertNotNull(commandList2);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        java.time.LocalDateTime localDateTime0 = null;
        // The following exception was thrown during execution in test generation
        try {
            logic.ExtendedState extendedState2 = new logic.ExtendedState(localDateTime0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.plusMinutes(long)\" because \"originalExpirationTime\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        logic.Sensor sensor1 = new logic.Sensor((int) ' ');
        boolean boolean2 = sensor1.isCarArrived();
        java.lang.String str3 = sensor1.getCurrentCarBrand();
        sensor1.setSensorId(0);
        logic.FacultyMember facultyMember10 = new logic.FacultyMember("ParkingSpot [id=, location=, enabled=true, occupied=false]", (int) (byte) 1, "hi!", "");
        logic.ParkingSpot parkingSpot15 = new logic.ParkingSpot("", false, true, "");
        logic.Booking booking17 = facultyMember10.bookParkingLot(parkingSpot15, (int) (byte) 1);
        boolean boolean18 = facultyMember10.validateRegistration();
        java.time.ZonedDateTime zonedDateTime19 = null;
        java.time.ZonedDateTime zonedDateTime20 = null;
        logic.BookingSystem bookingSystem23 = null;
        logic.User user28 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str29 = user28.password;
        logic.ParkingSpot parkingSpot33 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean34 = parkingSpot33.isOccupied();
        boolean boolean35 = parkingSpot33.isEnabled();
        logic.Sensor sensor36 = parkingSpot33.getSensor();
        logic.BookingCommand bookingCommand37 = new logic.BookingCommand(bookingSystem23, user28, parkingSpot33);
        logic.Sensor sensor39 = new logic.Sensor((int) ' ');
        sensor39.setCarArrived(true);
        DesignPatternClasses.Observer observer42 = null;
        sensor39.removeObserver(observer42);
        parkingSpot33.setSensor(sensor39);
        logic.User user49 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str50 = user49.password;
        logic.PricingStrategy pricingStrategy51 = null;
        user49.setPricingStrategy(pricingStrategy51);
        logic.Booking booking53 = new logic.Booking(zonedDateTime19, zonedDateTime20, "Valid", false, parkingSpot33, user49);
        logic.Booking booking55 = facultyMember10.bookParkingLot(parkingSpot33, (int) (byte) -1);
        sensor1.addObserver((DesignPatternClasses.Observer) booking55);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(booking17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNull(sensor36);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(booking55);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        logic.Sensor sensor1 = new logic.Sensor((int) ' ');
        sensor1.setCarArrived(true);
        DesignPatternClasses.Observer observer4 = null;
        sensor1.removeObserver(observer4);
        logic.Booking booking6 = new logic.Booking();
        sensor1.addObserver((DesignPatternClasses.Observer) booking6);
        int int8 = booking6.userId;
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        logic.User user4 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str5 = user4.password;
        logic.PricingStrategy pricingStrategy6 = null;
        user4.setPricingStrategy(pricingStrategy6);
        user4.setName("ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        java.sql.Connection connection0 = null;
        Connections.DatabaseDAO databaseDAO1 = new Connections.DatabaseDAO(connection0);
        // The following exception was thrown during execution in test generation
        try {
            logic.User user3 = databaseDAO1.getUserById((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.Connection.prepareStatement(String)\" because \"this.connection\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        logic.ParkingManager parkingManager0 = new logic.ParkingManager();
        boolean boolean2 = parkingManager0.addSpot("ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]");
        logic.AddParkingSpotCommand addParkingSpotCommand4 = new logic.AddParkingSpotCommand(parkingManager0, "ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]");
        java.util.List<logic.CompositeParkingLot> compositeParkingLotList5 = parkingManager0.getParkingLots();
        logic.DisableParkingSpotCommand disableParkingSpotCommand7 = new logic.DisableParkingSpotCommand(parkingManager0, "hi!");
        disableParkingSpotCommand7.execute();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(compositeParkingLotList5);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        logic.CompositeParkingLot compositeParkingLot1 = new logic.CompositeParkingLot("ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]");
        boolean boolean2 = compositeParkingLot1.isOccupied();
        logic.BookingSystem bookingSystem3 = null;
        logic.User user8 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str9 = user8.password;
        logic.ParkingSpot parkingSpot13 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean14 = parkingSpot13.isOccupied();
        boolean boolean15 = parkingSpot13.isEnabled();
        logic.Sensor sensor16 = parkingSpot13.getSensor();
        logic.BookingCommand bookingCommand17 = new logic.BookingCommand(bookingSystem3, user8, parkingSpot13);
        java.lang.String str18 = parkingSpot13.toString();
        compositeParkingLot1.remove((logic.ParkingComponent) parkingSpot13);
        logic.ParkingComponent parkingComponent20 = null;
        compositeParkingLot1.add(parkingComponent20);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNull(sensor16);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]" + "'", str18, "ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        logic.User user4 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        logic.BookingSystem bookingSystem5 = null;
        logic.User user10 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str11 = user10.password;
        logic.ParkingSpot parkingSpot15 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean16 = parkingSpot15.isOccupied();
        boolean boolean17 = parkingSpot15.isEnabled();
        logic.Sensor sensor18 = parkingSpot15.getSensor();
        logic.BookingCommand bookingCommand19 = new logic.BookingCommand(bookingSystem5, user10, parkingSpot15);
        logic.Booking booking20 = new logic.Booking(user4, parkingSpot15);
        logic.BookingSystem bookingSystem21 = null;
        logic.User user26 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str27 = user26.password;
        logic.ParkingSpot parkingSpot31 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean32 = parkingSpot31.isOccupied();
        boolean boolean33 = parkingSpot31.isEnabled();
        logic.Sensor sensor34 = parkingSpot31.getSensor();
        logic.BookingCommand bookingCommand35 = new logic.BookingCommand(bookingSystem21, user26, parkingSpot31);
        user26.id = '#';
        java.lang.String str38 = user26.name;
        user26.setId(10);
        booking20.user = user26;
        boolean boolean42 = booking20.isShowUp();
        logic.ParkingSpot parkingSpot43 = booking20.getSpot();
        boolean boolean44 = booking20.isShowUp();
        boolean boolean45 = booking20.isShowUp();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(sensor18);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(sensor34);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(parkingSpot43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        logic.User user4 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        logic.BookingSystem bookingSystem5 = null;
        logic.User user10 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str11 = user10.password;
        logic.ParkingSpot parkingSpot15 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean16 = parkingSpot15.isOccupied();
        boolean boolean17 = parkingSpot15.isEnabled();
        logic.Sensor sensor18 = parkingSpot15.getSensor();
        logic.BookingCommand bookingCommand19 = new logic.BookingCommand(bookingSystem5, user10, parkingSpot15);
        logic.Booking booking20 = new logic.Booking(user4, parkingSpot15);
        logic.BookingSystem bookingSystem21 = null;
        logic.User user26 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str27 = user26.password;
        logic.ParkingSpot parkingSpot31 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean32 = parkingSpot31.isOccupied();
        boolean boolean33 = parkingSpot31.isEnabled();
        logic.Sensor sensor34 = parkingSpot31.getSensor();
        logic.BookingCommand bookingCommand35 = new logic.BookingCommand(bookingSystem21, user26, parkingSpot31);
        user26.id = '#';
        java.lang.String str38 = user26.name;
        user26.setId(10);
        booking20.user = user26;
        boolean boolean42 = booking20.isShowUp();
        java.time.ZonedDateTime zonedDateTime43 = booking20.getBookingEndTime();
        int int44 = booking20.userId;
        booking20.setSensorId((-1));
        java.lang.String str47 = booking20.email;
        booking20.setBookingId(8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(sensor18);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(sensor34);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(zonedDateTime43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNull(str47);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        logic.ParkingSpot parkingSpot5 = new logic.ParkingSpot("hi!", "hi!", true, true, (int) ' ');
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.time.LocalDateTime localDateTime0 = null;
        // The following exception was thrown during execution in test generation
        try {
            logic.ExtendedState extendedState2 = new logic.ExtendedState(localDateTime0, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.time.LocalDateTime.plusMinutes(long)\" because \"originalExpirationTime\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        logic.BookingSystem bookingSystem0 = null;
        logic.User user5 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str6 = user5.password;
        logic.ParkingSpot parkingSpot10 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean11 = parkingSpot10.isOccupied();
        boolean boolean12 = parkingSpot10.isEnabled();
        logic.Sensor sensor13 = parkingSpot10.getSensor();
        logic.BookingCommand bookingCommand14 = new logic.BookingCommand(bookingSystem0, user5, parkingSpot10);
        java.lang.String str15 = user5.email;
        double double16 = user5.getBalance();
        user5.setName("ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(sensor13);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "hi!" + "'", str15, "hi!");
        org.junit.Assert.assertTrue("'" + double16 + "' != '" + 15.0d + "'", double16 == 15.0d);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        logic.SuperManager superManager0 = logic.SuperManager.getInstance();
        boolean boolean2 = superManager0.authenticate((int) (byte) 0);
        java.lang.String str3 = superManager0.getEmail();
        superManager0.setName("ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]" + "'", str3, "ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]");
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        logic.SuperManager superManager0 = logic.SuperManager.getInstance();
        boolean boolean2 = superManager0.authenticate((int) (byte) 0);
        java.lang.String str3 = superManager0.getEmail();
        superManager0.monitorParking();
        superManager0.setId((int) (short) 1);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]" + "'", str3, "ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]");
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        logic.SuperManager superManager0 = logic.SuperManager.getInstance();
        superManager0.addParkingLot();
        superManager0.setName("Valid");
        superManager0.requestAccountGeneration();
        logic.User user9 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        logic.BookingSystem bookingSystem10 = null;
        logic.User user15 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str16 = user15.password;
        logic.ParkingSpot parkingSpot20 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean21 = parkingSpot20.isOccupied();
        boolean boolean22 = parkingSpot20.isEnabled();
        logic.Sensor sensor23 = parkingSpot20.getSensor();
        logic.BookingCommand bookingCommand24 = new logic.BookingCommand(bookingSystem10, user15, parkingSpot20);
        logic.Booking booking25 = new logic.Booking(user9, parkingSpot20);
        logic.BookingSystem bookingSystem26 = null;
        logic.User user31 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str32 = user31.password;
        logic.ParkingSpot parkingSpot36 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean37 = parkingSpot36.isOccupied();
        boolean boolean38 = parkingSpot36.isEnabled();
        logic.Sensor sensor39 = parkingSpot36.getSensor();
        logic.BookingCommand bookingCommand40 = new logic.BookingCommand(bookingSystem26, user31, parkingSpot36);
        user31.id = '#';
        java.lang.String str43 = user31.name;
        user31.setId(10);
        booking25.user = user31;
        superManager0.disableManager(user31);
        java.time.ZonedDateTime zonedDateTime48 = null;
        java.time.ZonedDateTime zonedDateTime49 = null;
        logic.BookingSystem bookingSystem52 = null;
        logic.User user57 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str58 = user57.password;
        logic.ParkingSpot parkingSpot62 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean63 = parkingSpot62.isOccupied();
        boolean boolean64 = parkingSpot62.isEnabled();
        logic.Sensor sensor65 = parkingSpot62.getSensor();
        logic.BookingCommand bookingCommand66 = new logic.BookingCommand(bookingSystem52, user57, parkingSpot62);
        logic.Sensor sensor68 = new logic.Sensor((int) ' ');
        sensor68.setCarArrived(true);
        DesignPatternClasses.Observer observer71 = null;
        sensor68.removeObserver(observer71);
        parkingSpot62.setSensor(sensor68);
        logic.User user78 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str79 = user78.password;
        logic.PricingStrategy pricingStrategy80 = null;
        user78.setPricingStrategy(pricingStrategy80);
        logic.Booking booking82 = new logic.Booking(zonedDateTime48, zonedDateTime49, "Valid", false, parkingSpot62, user78);
        superManager0.disableParkingSpot(parkingSpot62);
        java.lang.String str84 = parkingSpot62.getLotId();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(sensor23);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(sensor39);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(sensor65);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertNull(str84);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        logic.User user4 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        logic.BookingSystem bookingSystem5 = null;
        logic.User user10 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str11 = user10.password;
        logic.ParkingSpot parkingSpot15 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean16 = parkingSpot15.isOccupied();
        boolean boolean17 = parkingSpot15.isEnabled();
        logic.Sensor sensor18 = parkingSpot15.getSensor();
        logic.BookingCommand bookingCommand19 = new logic.BookingCommand(bookingSystem5, user10, parkingSpot15);
        logic.Booking booking20 = new logic.Booking(user4, parkingSpot15);
        logic.BookingSystem bookingSystem21 = null;
        logic.User user26 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str27 = user26.password;
        logic.ParkingSpot parkingSpot31 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean32 = parkingSpot31.isOccupied();
        boolean boolean33 = parkingSpot31.isEnabled();
        logic.Sensor sensor34 = parkingSpot31.getSensor();
        logic.BookingCommand bookingCommand35 = new logic.BookingCommand(bookingSystem21, user26, parkingSpot31);
        user26.id = '#';
        java.lang.String str38 = user26.name;
        user26.setId(10);
        booking20.user = user26;
        logic.ParkingSpot parkingSpot42 = booking20.getSpot();
        java.time.ZonedDateTime zonedDateTime43 = booking20.getBookingEndTime();
        int int44 = booking20.userId;
        booking20.setUserId((int) (short) 1);
        booking20.isValid = false;
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(sensor18);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(sensor34);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(parkingSpot42);
        org.junit.Assert.assertNull(zonedDateTime43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        logic.SuperManager superManager0 = logic.SuperManager.getInstance();
        boolean boolean2 = superManager0.authenticate((int) (byte) 0);
        logic.ParkingSpot parkingSpot6 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean7 = parkingSpot6.isOccupied();
        superManager0.disableParkingSpot(parkingSpot6);
        logic.SuperManager superManager9 = logic.SuperManager.getInstance();
        superManager9.addParkingLot();
        superManager9.setName("Valid");
        java.lang.String str13 = superManager9.getName();
        superManager0.enableManager((logic.User) superManager9);
        superManager9.requestAccountGeneration();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(superManager9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Valid" + "'", str13, "Valid");
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        logic.ParkingSpot parkingSpot4 = new logic.ParkingSpot("hi!", true, false, "");
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        java.sql.Connection connection0 = null;
        Connections.DatabaseDAO databaseDAO1 = new Connections.DatabaseDAO(connection0);
        // The following exception was thrown during execution in test generation
        try {
            logic.Manager manager3 = databaseDAO1.getManager((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid Manager ID: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        logic.ParkingManager parkingManager0 = new logic.ParkingManager();
        boolean boolean2 = parkingManager0.addSpot("ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]");
        logic.AddParkingSpotCommand addParkingSpotCommand4 = new logic.AddParkingSpotCommand(parkingManager0, "ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]");
        java.util.List<logic.CompositeParkingLot> compositeParkingLotList5 = parkingManager0.getParkingLots();
        logic.DisableParkingSpotCommand disableParkingSpotCommand7 = new logic.DisableParkingSpotCommand(parkingManager0, "hi!");
        logic.DisableParkingSpotCommand disableParkingSpotCommand9 = new logic.DisableParkingSpotCommand(parkingManager0, "ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]");
        disableParkingSpotCommand9.undo();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(compositeParkingLotList5);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        logic.BookingSystem bookingSystem0 = new logic.BookingSystem();
        logic.User user5 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        logic.BookingSystem bookingSystem6 = null;
        logic.User user11 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str12 = user11.password;
        logic.ParkingSpot parkingSpot16 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean17 = parkingSpot16.isOccupied();
        boolean boolean18 = parkingSpot16.isEnabled();
        logic.Sensor sensor19 = parkingSpot16.getSensor();
        logic.BookingCommand bookingCommand20 = new logic.BookingCommand(bookingSystem6, user11, parkingSpot16);
        logic.Booking booking21 = new logic.Booking(user5, parkingSpot16);
        logic.BookingSystem bookingSystem22 = null;
        logic.User user27 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str28 = user27.password;
        logic.ParkingSpot parkingSpot32 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean33 = parkingSpot32.isOccupied();
        boolean boolean34 = parkingSpot32.isEnabled();
        logic.Sensor sensor35 = parkingSpot32.getSensor();
        logic.BookingCommand bookingCommand36 = new logic.BookingCommand(bookingSystem22, user27, parkingSpot32);
        user27.id = '#';
        java.lang.String str39 = user27.name;
        user27.setId(10);
        booking21.user = user27;
        logic.ParkingSpot parkingSpot43 = booking21.getSpot();
        java.time.ZonedDateTime zonedDateTime44 = booking21.getBookingEndTime();
        logic.CancellingBookingCommand cancellingBookingCommand45 = new logic.CancellingBookingCommand(bookingSystem0, booking21);
        cancellingBookingCommand45.execute();
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(sensor19);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(sensor35);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNotNull(parkingSpot43);
        org.junit.Assert.assertNull(zonedDateTime44);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        logic.CreditCardPaymentStrategy creditCardPaymentStrategy0 = new logic.CreditCardPaymentStrategy();
        logic.Visitor visitor5 = new logic.Visitor("", (int) (byte) -1, "ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]", "");
        boolean boolean7 = creditCardPaymentStrategy0.pay((logic.User) visitor5, 1.0d);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        java.sql.Connection connection0 = null;
        Connections.DatabaseDAO databaseDAO1 = new Connections.DatabaseDAO(connection0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = databaseDAO1.isSensorOn((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.Connection.prepareStatement(String)\" because \"this.connection\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        logic.Sensor sensor1 = new logic.Sensor((int) ' ');
        sensor1.setCarArrived(true);
        DesignPatternClasses.Observer observer4 = null;
        sensor1.removeObserver(observer4);
        logic.Booking booking6 = new logic.Booking();
        sensor1.addObserver((DesignPatternClasses.Observer) booking6);
        logic.DisableSensorCommand disableSensorCommand8 = new logic.DisableSensorCommand(sensor1);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        logic.ParkingManager parkingManager0 = new logic.ParkingManager();
        boolean boolean2 = parkingManager0.addSpot("ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]");
        logic.DisableParkingSpotCommand disableParkingSpotCommand4 = new logic.DisableParkingSpotCommand(parkingManager0, "ParkingSpot [id=, location=, enabled=true, occupied=false]");
        boolean boolean6 = parkingManager0.enableSpot("SuperManager [superMgrID=100, name=ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false], email=ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]]");
        boolean boolean8 = parkingManager0.enableSpot("ParkingSpot [id=, location=, enabled=true, occupied=false]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        java.sql.Connection connection0 = null;
        Connections.DatabaseDAO databaseDAO1 = new Connections.DatabaseDAO(connection0);
        // The following exception was thrown during execution in test generation
        try {
            logic.User user3 = databaseDAO1.getUserById((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.Connection.prepareStatement(String)\" because \"this.connection\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        logic.User user5 = logic.UserFactory.createUser("SuperManager [superMgrID=100, name=ParkingSpot [id=, location=, enabled=true, occupied=false], email=ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]]", "Valid", (int) (short) 100, "SuperManager [superMgrID=100, name=ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false], email=ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]]", "Valid");
        org.junit.Assert.assertNull(user5);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        logic.Sensor sensor1 = new logic.Sensor((int) ' ');
        sensor1.setCarArrived(true);
        DesignPatternClasses.Observer observer4 = null;
        sensor1.removeObserver(observer4);
        sensor1.setCarArrived(true);
        java.lang.String str8 = sensor1.getCurrentCarModel();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        logic.Sensor sensor1 = new logic.Sensor((int) ' ');
        boolean boolean2 = sensor1.isCarArrived();
        java.lang.String str3 = sensor1.getCurrentCarBrand();
        java.time.ZonedDateTime zonedDateTime4 = null;
        sensor1.activateSensor(zonedDateTime4);
        java.time.ZonedDateTime zonedDateTime6 = sensor1.getSensorActivationTime();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNull(zonedDateTime6);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        logic.BookingSystem bookingSystem0 = null;
        logic.User user5 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str6 = user5.password;
        logic.ParkingSpot parkingSpot10 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean11 = parkingSpot10.isOccupied();
        boolean boolean12 = parkingSpot10.isEnabled();
        logic.Sensor sensor13 = parkingSpot10.getSensor();
        logic.BookingCommand bookingCommand14 = new logic.BookingCommand(bookingSystem0, user5, parkingSpot10);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = parkingSpot10.getSensorId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"logic.Sensor.getSensorId()\" because \"this.sensor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(sensor13);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        java.sql.Connection connection0 = null;
        Connections.DatabaseDAO databaseDAO1 = new Connections.DatabaseDAO(connection0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = databaseDAO1.isSensorOn(0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.Connection.prepareStatement(String)\" because \"this.connection\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        logic.Sensor sensor1 = new logic.Sensor((int) ' ');
        boolean boolean2 = sensor1.isCarArrived();
        java.lang.String str3 = sensor1.getCurrentCarBrand();
        java.time.ZonedDateTime zonedDateTime4 = null;
        sensor1.activateSensor(zonedDateTime4);
        java.util.List<DesignPatternClasses.Observer> observerList6 = sensor1.getObservers();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(observerList6);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        logic.FacultyMember facultyMember4 = new logic.FacultyMember("Valid", (int) '4', "General Lot", "hi!");
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        java.sql.Connection connection0 = null;
        Connections.DatabaseDAO databaseDAO1 = new Connections.DatabaseDAO(connection0);
        // The following exception was thrown during execution in test generation
        try {
            logic.FacultyMember facultyMember3 = databaseDAO1.getFacultyMember((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.Connection.prepareStatement(String)\" because \"this.connection\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        logic.ParkingManager parkingManager0 = new logic.ParkingManager();
        boolean boolean2 = parkingManager0.addSpot("ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]");
        logic.AddParkingSpotCommand addParkingSpotCommand4 = new logic.AddParkingSpotCommand(parkingManager0, "ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]");
        java.util.List<logic.CompositeParkingLot> compositeParkingLotList5 = parkingManager0.getParkingLots();
        logic.DisableParkingSpotCommand disableParkingSpotCommand7 = new logic.DisableParkingSpotCommand(parkingManager0, "hi!");
        logic.DisableParkingSpotCommand disableParkingSpotCommand9 = new logic.DisableParkingSpotCommand(parkingManager0, "ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]");
        logic.AddParkingSpotCommand addParkingSpotCommand11 = new logic.AddParkingSpotCommand(parkingManager0, "ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]");
        boolean boolean13 = parkingManager0.spotExists("Valid");
        boolean boolean15 = parkingManager0.enableSpot("");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(compositeParkingLotList5);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        logic.SuperManager superManager0 = logic.SuperManager.getInstance();
        boolean boolean2 = superManager0.authenticate((int) (byte) 0);
        logic.ParkingSpot parkingSpot6 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean7 = parkingSpot6.isOccupied();
        superManager0.disableParkingSpot(parkingSpot6);
        logic.SuperManager superManager9 = logic.SuperManager.getInstance();
        superManager9.addParkingLot();
        superManager9.setName("Valid");
        java.lang.String str13 = superManager9.getName();
        superManager0.enableManager((logic.User) superManager9);
        logic.PaymentStrategy paymentStrategy15 = superManager0.getPaymentStrategy();
        logic.User user16 = null;
        // The following exception was thrown during execution in test generation
        try {
            superManager0.enableManager(user16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"logic.User.getName()\" because \"user\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(superManager9);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Valid" + "'", str13, "Valid");
        org.junit.Assert.assertNull(paymentStrategy15);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        logic.User user4 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        logic.BookingSystem bookingSystem5 = null;
        logic.User user10 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str11 = user10.password;
        logic.ParkingSpot parkingSpot15 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean16 = parkingSpot15.isOccupied();
        boolean boolean17 = parkingSpot15.isEnabled();
        logic.Sensor sensor18 = parkingSpot15.getSensor();
        logic.BookingCommand bookingCommand19 = new logic.BookingCommand(bookingSystem5, user10, parkingSpot15);
        logic.Booking booking20 = new logic.Booking(user4, parkingSpot15);
        logic.BookingSystem bookingSystem21 = null;
        logic.User user26 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str27 = user26.password;
        logic.ParkingSpot parkingSpot31 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean32 = parkingSpot31.isOccupied();
        boolean boolean33 = parkingSpot31.isEnabled();
        logic.Sensor sensor34 = parkingSpot31.getSensor();
        logic.BookingCommand bookingCommand35 = new logic.BookingCommand(bookingSystem21, user26, parkingSpot31);
        user26.id = '#';
        java.lang.String str38 = user26.name;
        user26.setId(10);
        booking20.user = user26;
        boolean boolean42 = booking20.isShowUp();
        java.time.ZonedDateTime zonedDateTime43 = booking20.getBookingEndTime();
        int int44 = booking20.userId;
        booking20.isValid = true;
        java.lang.String str47 = booking20.email;
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(sensor18);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(sensor34);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(zonedDateTime43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNull(str47);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        logic.BookingSystem bookingSystem0 = new logic.BookingSystem();
        logic.SuperManager superManager1 = logic.SuperManager.getInstance();
        superManager1.addParkingLot();
        superManager1.setName("Valid");
        superManager1.requestAccountGeneration();
        superManager1.setName("ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]");
        superManager1.addParkingLot();
        superManager1.monitorParking();
        java.lang.String str10 = superManager1.getEmail();
        logic.User user15 = new logic.User("hi!", (int) 'a', "ParkingSpot [id=, location=, enabled=true, occupied=false]", "Valid");
        superManager1.enableManager(user15);
        logic.ParkingSpot parkingSpot21 = new logic.ParkingSpot("", false, true, "");
        java.lang.String str22 = parkingSpot21.toString();
        logic.Booking booking23 = bookingSystem0.book((logic.User) superManager1, parkingSpot21);
        logic.PaymentStrategy paymentStrategy24 = superManager1.getPaymentStrategy();
        org.junit.Assert.assertNotNull(superManager1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]" + "'", str10, "ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ParkingSpot [id=, location=, enabled=true, occupied=false]" + "'", str22, "ParkingSpot [id=, location=, enabled=true, occupied=false]");
        org.junit.Assert.assertNotNull(booking23);
        org.junit.Assert.assertNull(paymentStrategy24);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        logic.SuperManager superManager0 = logic.SuperManager.getInstance();
        superManager0.addParkingLot();
        superManager0.setName("Valid");
        superManager0.setName("ParkingSpot [id=, location=, enabled=true, occupied=false]");
        superManager0.requestAccountGeneration();
        org.junit.Assert.assertNotNull(superManager0);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        logic.FacultyMember facultyMember4 = new logic.FacultyMember("SuperManager [superMgrID=100, name=ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false], email=ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]]", 100, "General Lot", "SuperManager [superMgrID=100, name=Valid, email=ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]]");
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        logic.SuperManager superManager0 = logic.SuperManager.getInstance();
        boolean boolean2 = superManager0.authenticate((int) (byte) 0);
        superManager0.requestAccountGeneration();
        logic.PricingStrategy pricingStrategy4 = superManager0.getPricingStrategy();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(pricingStrategy4);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        java.sql.Connection connection0 = null;
        Connections.DatabaseDAO databaseDAO1 = new Connections.DatabaseDAO(connection0);
        logic.SuperManager superManager2 = logic.SuperManager.getInstance();
        superManager2.addParkingLot();
        superManager2.setName("Valid");
        superManager2.requestAccountGeneration();
        superManager2.setName("ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]");
        superManager2.addParkingLot();
        superManager2.monitorParking();
        java.lang.String str11 = superManager2.getEmail();
        logic.User user16 = new logic.User("hi!", (int) 'a', "ParkingSpot [id=, location=, enabled=true, occupied=false]", "Valid");
        superManager2.enableManager(user16);
        java.lang.String str18 = superManager2.toString();
        logic.ParkingLot parkingLot20 = new logic.ParkingLot("General Lot");
        superManager2.enableParkingLot(parkingLot20);
        // The following exception was thrown during execution in test generation
        try {
            databaseDAO1.addParkingLot(parkingLot20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.Connection.prepareStatement(String)\" because \"this.connection\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager2);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]" + "'", str11, "ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "SuperManager [superMgrID=100, name=ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false], email=ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]]" + "'", str18, "SuperManager [superMgrID=100, name=ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false], email=ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]]");
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        logic.ParkingManager parkingManager0 = null;
        logic.DisableParkingSpotCommand disableParkingSpotCommand2 = new logic.DisableParkingSpotCommand(parkingManager0, "ParkingSpot [id=, location=, enabled=true, occupied=false]");
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        logic.SuperManager superManager0 = logic.SuperManager.getInstance();
        boolean boolean2 = superManager0.authenticate((int) (byte) 0);
        superManager0.requestAccountGeneration();
        superManager0.setName("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        logic.ParkingSpot parkingSpot3 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean4 = parkingSpot3.isOccupied();
        boolean boolean5 = parkingSpot3.isEnabled();
        parkingSpot3.setOccupied(false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        logic.BookingSystem bookingSystem0 = null;
        logic.User user5 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str6 = user5.password;
        logic.ParkingSpot parkingSpot10 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean11 = parkingSpot10.isOccupied();
        boolean boolean12 = parkingSpot10.isEnabled();
        logic.Sensor sensor13 = parkingSpot10.getSensor();
        logic.BookingCommand bookingCommand14 = new logic.BookingCommand(bookingSystem0, user5, parkingSpot10);
        user5.id = '#';
        user5.setEmail("hi!");
        logic.PricingStrategy pricingStrategy19 = user5.getPricingStrategy();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(sensor13);
        org.junit.Assert.assertNull(pricingStrategy19);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        logic.BookingSystem bookingSystem0 = new logic.BookingSystem();
        logic.User user5 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str6 = user5.getName();
        user5.setEmail("ParkingSpot [id=, location=, enabled=true, occupied=false]");
        logic.BookingSystem bookingSystem9 = null;
        logic.User user14 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str15 = user14.password;
        logic.ParkingSpot parkingSpot19 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean20 = parkingSpot19.isOccupied();
        boolean boolean21 = parkingSpot19.isEnabled();
        logic.Sensor sensor22 = parkingSpot19.getSensor();
        logic.BookingCommand bookingCommand23 = new logic.BookingCommand(bookingSystem9, user14, parkingSpot19);
        parkingSpot19.setLocation("ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]");
        logic.BookingCommand bookingCommand26 = new logic.BookingCommand(bookingSystem0, user5, parkingSpot19);
        bookingCommand26.undo();
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "hi!" + "'", str6, "hi!");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(sensor22);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        logic.ParkingSpot parkingSpot4 = new logic.ParkingSpot("", false, true, "");
        parkingSpot4.setEnabled(false);
        java.lang.String str7 = parkingSpot4.getSpotId();
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        java.sql.Connection connection0 = null;
        Connections.DatabaseDAO databaseDAO1 = new Connections.DatabaseDAO(connection0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = databaseDAO1.isSensorOn(100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.Connection.prepareStatement(String)\" because \"this.connection\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        logic.SuperManager superManager0 = logic.SuperManager.getInstance();
        superManager0.addParkingLot();
        superManager0.setName("Valid");
        superManager0.requestAccountGeneration();
        superManager0.setName("ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]");
        superManager0.addParkingLot();
        superManager0.monitorParking();
        int int9 = superManager0.getSuperMgrID();
        superManager0.setEmail("General Lot");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        java.sql.Connection connection0 = null;
        Connections.DatabaseDAO databaseDAO1 = new Connections.DatabaseDAO(connection0);
        logic.SuperManager superManager2 = logic.SuperManager.getInstance();
        boolean boolean4 = superManager2.authenticate((int) (byte) 0);
        superManager2.requestAccountGeneration();
        logic.SuperManager superManager6 = logic.SuperManager.getInstance();
        superManager6.addParkingLot();
        superManager2.disableManager((logic.User) superManager6);
        java.lang.String str9 = superManager6.toString();
        logic.NonFacultyStaff nonFacultyStaff14 = new logic.NonFacultyStaff("ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]", (int) (byte) 1, "Valid", "Valid");
        boolean boolean15 = nonFacultyStaff14.validateRegistration();
        superManager6.disableManager((logic.User) nonFacultyStaff14);
        // The following exception was thrown during execution in test generation
        try {
            databaseDAO1.addNonFacultyStaff(nonFacultyStaff14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.Connection.prepareStatement(String)\" because \"this.connection\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(superManager6);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SuperManager [superMgrID=100, name=ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false], email=General Lot]" + "'", str9, "SuperManager [superMgrID=100, name=ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false], email=General Lot]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        logic.User user4 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        logic.BookingSystem bookingSystem5 = null;
        logic.User user10 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str11 = user10.password;
        logic.ParkingSpot parkingSpot15 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean16 = parkingSpot15.isOccupied();
        boolean boolean17 = parkingSpot15.isEnabled();
        logic.Sensor sensor18 = parkingSpot15.getSensor();
        logic.BookingCommand bookingCommand19 = new logic.BookingCommand(bookingSystem5, user10, parkingSpot15);
        logic.Booking booking20 = new logic.Booking(user4, parkingSpot15);
        boolean boolean21 = parkingSpot15.isOccupied();
        java.lang.String str22 = parkingSpot15.toString();
        parkingSpot15.setLocation("ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(sensor18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]" + "'", str22, "ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]");
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        logic.User user4 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        logic.BookingSystem bookingSystem5 = null;
        logic.User user10 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str11 = user10.password;
        logic.ParkingSpot parkingSpot15 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean16 = parkingSpot15.isOccupied();
        boolean boolean17 = parkingSpot15.isEnabled();
        logic.Sensor sensor18 = parkingSpot15.getSensor();
        logic.BookingCommand bookingCommand19 = new logic.BookingCommand(bookingSystem5, user10, parkingSpot15);
        logic.Booking booking20 = new logic.Booking(user4, parkingSpot15);
        logic.BookingSystem bookingSystem21 = null;
        logic.User user26 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str27 = user26.password;
        logic.ParkingSpot parkingSpot31 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean32 = parkingSpot31.isOccupied();
        boolean boolean33 = parkingSpot31.isEnabled();
        logic.Sensor sensor34 = parkingSpot31.getSensor();
        logic.BookingCommand bookingCommand35 = new logic.BookingCommand(bookingSystem21, user26, parkingSpot31);
        user26.id = '#';
        java.lang.String str38 = user26.name;
        user26.setId(10);
        booking20.user = user26;
        boolean boolean42 = booking20.isShowUp();
        java.time.ZonedDateTime zonedDateTime43 = booking20.getBookingEndTime();
        int int44 = booking20.userId;
        booking20.setSensorId((-1));
        java.lang.String str47 = booking20.email;
        booking20.setSensorId((int) (byte) 10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(sensor18);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(sensor34);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNull(zonedDateTime43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNull(str47);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        logic.User user4 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        logic.BookingSystem bookingSystem5 = null;
        logic.User user10 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str11 = user10.password;
        logic.ParkingSpot parkingSpot15 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean16 = parkingSpot15.isOccupied();
        boolean boolean17 = parkingSpot15.isEnabled();
        logic.Sensor sensor18 = parkingSpot15.getSensor();
        logic.BookingCommand bookingCommand19 = new logic.BookingCommand(bookingSystem5, user10, parkingSpot15);
        logic.Booking booking20 = new logic.Booking(user4, parkingSpot15);
        boolean boolean21 = parkingSpot15.isOccupied();
        logic.Sensor sensor23 = new logic.Sensor((int) ' ');
        sensor23.setCarArrived(true);
        DesignPatternClasses.Observer observer26 = null;
        sensor23.removeObserver(observer26);
        java.time.ZonedDateTime zonedDateTime28 = sensor23.getSensorActivationTime();
        parkingSpot15.setSensor(sensor23);
        sensor23.setSensorOn(true);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(sensor18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(zonedDateTime28);
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        logic.User user4 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        logic.BookingSystem bookingSystem5 = null;
        logic.User user10 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str11 = user10.password;
        logic.ParkingSpot parkingSpot15 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean16 = parkingSpot15.isOccupied();
        boolean boolean17 = parkingSpot15.isEnabled();
        logic.Sensor sensor18 = parkingSpot15.getSensor();
        logic.BookingCommand bookingCommand19 = new logic.BookingCommand(bookingSystem5, user10, parkingSpot15);
        logic.Booking booking20 = new logic.Booking(user4, parkingSpot15);
        logic.BookingSystem bookingSystem21 = null;
        logic.User user26 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str27 = user26.password;
        logic.ParkingSpot parkingSpot31 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean32 = parkingSpot31.isOccupied();
        boolean boolean33 = parkingSpot31.isEnabled();
        logic.Sensor sensor34 = parkingSpot31.getSensor();
        logic.BookingCommand bookingCommand35 = new logic.BookingCommand(bookingSystem21, user26, parkingSpot31);
        user26.id = '#';
        java.lang.String str38 = user26.name;
        user26.setId(10);
        booking20.user = user26;
        boolean boolean42 = booking20.isShowUp();
        booking20.userId = (byte) -1;
        boolean boolean45 = booking20.isValid();
        java.time.ZonedDateTime zonedDateTime46 = booking20.bookingEndTime;
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(sensor18);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(sensor34);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(zonedDateTime46);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        logic.CompositeParkingLot compositeParkingLot1 = new logic.CompositeParkingLot("General Lot");
        java.lang.String str2 = compositeParkingLot1.getId();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "General Lot" + "'", str2, "General Lot");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        logic.ParkingManager parkingManager0 = new logic.ParkingManager();
        boolean boolean2 = parkingManager0.addSpot("ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]");
        logic.AddParkingSpotCommand addParkingSpotCommand4 = new logic.AddParkingSpotCommand(parkingManager0, "ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]");
        addParkingSpotCommand4.execute();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        logic.ParkingManager parkingManager0 = new logic.ParkingManager();
        boolean boolean2 = parkingManager0.enableSpot("General Lot");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        java.sql.Connection connection0 = null;
        Connections.DatabaseDAO databaseDAO1 = new Connections.DatabaseDAO(connection0);
        // The following exception was thrown during execution in test generation
        try {
            logic.Sensor sensor3 = databaseDAO1.getSensorBySpotId(19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.Connection.prepareStatement(String)\" because \"this.connection\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        logic.Sensor sensor1 = new logic.Sensor((int) ' ');
        sensor1.setCarArrived(true);
        DesignPatternClasses.Observer observer4 = null;
        sensor1.removeObserver(observer4);
        int int6 = sensor1.getSensorId();
        logic.EnableSensorCommand enableSensorCommand7 = new logic.EnableSensorCommand(sensor1);
        enableSensorCommand7.undo();
        enableSensorCommand7.execute();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        logic.SuperManager superManager0 = logic.SuperManager.getInstance();
        superManager0.addParkingLot();
        superManager0.setName("Valid");
        superManager0.requestAccountGeneration();
        superManager0.setName("ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]");
        superManager0.addParkingLot();
        superManager0.monitorParking();
        java.lang.String str9 = superManager0.getEmail();
        logic.User user14 = new logic.User("hi!", (int) 'a', "ParkingSpot [id=, location=, enabled=true, occupied=false]", "Valid");
        superManager0.enableManager(user14);
        superManager0.monitorParking();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "General Lot" + "'", str9, "General Lot");
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        logic.NonFacultyStaff nonFacultyStaff4 = new logic.NonFacultyStaff("ParkingSpot [id=, location=, enabled=true, occupied=false]", (int) 'a', "ParkingSpot [id=, location=, enabled=true, occupied=false]", "hi!");
        java.lang.String str5 = nonFacultyStaff4.password;
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "hi!" + "'", str5, "hi!");
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        logic.FacultyMember facultyMember4 = new logic.FacultyMember("ParkingSpot [id=, location=, enabled=true, occupied=false]", (int) (byte) 1, "hi!", "");
        logic.ParkingSpot parkingSpot9 = new logic.ParkingSpot("", false, true, "");
        logic.Booking booking11 = facultyMember4.bookParkingLot(parkingSpot9, (int) (byte) 1);
        boolean boolean12 = facultyMember4.validateRegistration();
        boolean boolean13 = facultyMember4.validateRegistration();
        org.junit.Assert.assertNotNull(booking11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        logic.Sensor sensor1 = new logic.Sensor((int) ' ');
        boolean boolean2 = sensor1.isCarArrived();
        java.lang.String str3 = sensor1.getCurrentCarBrand();
        sensor1.clearCurrentCarInfo();
        int int5 = sensor1.getSensorId();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32 + "'", int5 == 32);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        logic.CompositeParkingLot compositeParkingLot1 = new logic.CompositeParkingLot("ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]");
        boolean boolean2 = compositeParkingLot1.isOccupied();
        logic.CompositeParkingLot compositeParkingLot4 = new logic.CompositeParkingLot("ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]");
        logic.ParkingSpot parkingSpot9 = new logic.ParkingSpot("", false, true, "");
        compositeParkingLot4.remove((logic.ParkingComponent) parkingSpot9);
        boolean boolean11 = compositeParkingLot4.isOccupied();
        boolean boolean12 = compositeParkingLot4.isOccupied();
        compositeParkingLot1.remove((logic.ParkingComponent) compositeParkingLot4);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        logic.SuperManager superManager0 = logic.SuperManager.getInstance();
        boolean boolean2 = superManager0.authenticate((int) (byte) 0);
        logic.ParkingSpot parkingSpot6 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean7 = parkingSpot6.isOccupied();
        superManager0.disableParkingSpot(parkingSpot6);
        superManager0.setEmail("ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]");
        logic.SuperManager superManager11 = logic.SuperManager.getInstance();
        superManager11.addParkingLot();
        superManager11.setName("Valid");
        superManager11.requestAccountGeneration();
        superManager11.setName("ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]");
        superManager11.addParkingLot();
        superManager11.monitorParking();
        java.lang.String str20 = superManager11.getEmail();
        superManager0.enableManager((logic.User) superManager11);
        superManager11.name = "ParkingSpot [id=, location=, enabled=true, occupied=false]";
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(superManager11);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]" + "'", str20, "ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]");
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        java.sql.Connection connection0 = null;
        Connections.DatabaseDAO databaseDAO1 = new Connections.DatabaseDAO(connection0);
        logic.User user6 = new logic.User("Valid", (int) (byte) 1, "", "ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]");
        // The following exception was thrown during execution in test generation
        try {
            databaseDAO1.addUser(user6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.Connection.prepareStatement(String)\" because \"this.connection\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        logic.SuperManager superManager0 = logic.SuperManager.getInstance();
        superManager0.addParkingLot();
        superManager0.setName("Valid");
        superManager0.requestAccountGeneration();
        logic.User user9 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        logic.BookingSystem bookingSystem10 = null;
        logic.User user15 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str16 = user15.password;
        logic.ParkingSpot parkingSpot20 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean21 = parkingSpot20.isOccupied();
        boolean boolean22 = parkingSpot20.isEnabled();
        logic.Sensor sensor23 = parkingSpot20.getSensor();
        logic.BookingCommand bookingCommand24 = new logic.BookingCommand(bookingSystem10, user15, parkingSpot20);
        logic.Booking booking25 = new logic.Booking(user9, parkingSpot20);
        logic.BookingSystem bookingSystem26 = null;
        logic.User user31 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str32 = user31.password;
        logic.ParkingSpot parkingSpot36 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean37 = parkingSpot36.isOccupied();
        boolean boolean38 = parkingSpot36.isEnabled();
        logic.Sensor sensor39 = parkingSpot36.getSensor();
        logic.BookingCommand bookingCommand40 = new logic.BookingCommand(bookingSystem26, user31, parkingSpot36);
        user31.id = '#';
        java.lang.String str43 = user31.name;
        user31.setId(10);
        booking25.user = user31;
        superManager0.disableManager(user31);
        java.time.ZonedDateTime zonedDateTime48 = null;
        java.time.ZonedDateTime zonedDateTime49 = null;
        logic.BookingSystem bookingSystem52 = null;
        logic.User user57 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str58 = user57.password;
        logic.ParkingSpot parkingSpot62 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean63 = parkingSpot62.isOccupied();
        boolean boolean64 = parkingSpot62.isEnabled();
        logic.Sensor sensor65 = parkingSpot62.getSensor();
        logic.BookingCommand bookingCommand66 = new logic.BookingCommand(bookingSystem52, user57, parkingSpot62);
        logic.Sensor sensor68 = new logic.Sensor((int) ' ');
        sensor68.setCarArrived(true);
        DesignPatternClasses.Observer observer71 = null;
        sensor68.removeObserver(observer71);
        parkingSpot62.setSensor(sensor68);
        logic.User user78 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str79 = user78.password;
        logic.PricingStrategy pricingStrategy80 = null;
        user78.setPricingStrategy(pricingStrategy80);
        logic.Booking booking82 = new logic.Booking(zonedDateTime48, zonedDateTime49, "Valid", false, parkingSpot62, user78);
        superManager0.disableParkingSpot(parkingSpot62);
        double double84 = superManager0.getBalance();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(sensor23);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(sensor39);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(sensor65);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertTrue("'" + double84 + "' != '" + 15.0d + "'", double84 == 15.0d);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        logic.User user4 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        logic.BookingSystem bookingSystem5 = null;
        logic.User user10 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str11 = user10.password;
        logic.ParkingSpot parkingSpot15 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean16 = parkingSpot15.isOccupied();
        boolean boolean17 = parkingSpot15.isEnabled();
        logic.Sensor sensor18 = parkingSpot15.getSensor();
        logic.BookingCommand bookingCommand19 = new logic.BookingCommand(bookingSystem5, user10, parkingSpot15);
        logic.Booking booking20 = new logic.Booking(user4, parkingSpot15);
        logic.BookingSystem bookingSystem21 = null;
        logic.User user26 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str27 = user26.password;
        logic.ParkingSpot parkingSpot31 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean32 = parkingSpot31.isOccupied();
        boolean boolean33 = parkingSpot31.isEnabled();
        logic.Sensor sensor34 = parkingSpot31.getSensor();
        logic.BookingCommand bookingCommand35 = new logic.BookingCommand(bookingSystem21, user26, parkingSpot31);
        user26.id = '#';
        java.lang.String str38 = user26.name;
        user26.setId(10);
        booking20.user = user26;
        boolean boolean42 = booking20.isShowUp();
        logic.ParkingSpot parkingSpot43 = booking20.getSpot();
        booking20.setShowUp(false);
        booking20.setSensorId(0);
        java.time.ZonedDateTime zonedDateTime48 = booking20.bookingEndTime;
        booking20.setSensorId(10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(sensor18);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(sensor34);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(parkingSpot43);
        org.junit.Assert.assertNull(zonedDateTime48);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        logic.Sensor sensor1 = new logic.Sensor((int) ' ');
        sensor1.setCarArrived(true);
        DesignPatternClasses.Observer observer4 = null;
        sensor1.removeObserver(observer4);
        sensor1.setCurrentCarColor("SuperManager [superMgrID=100, name=Valid, email=ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]]");
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        logic.NonFacultyStaff nonFacultyStaff4 = new logic.NonFacultyStaff("ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]", (int) (byte) 1, "Valid", "Valid");
        boolean boolean5 = nonFacultyStaff4.validateRegistration();
        logic.ParkingSpot parkingSpot10 = new logic.ParkingSpot("", true, true, "hi!");
        logic.Booking booking12 = nonFacultyStaff4.bookParkingLot(parkingSpot10, (int) (short) 100);
        int int13 = booking12.bookingId;
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(booking12);
// flaky "6) test193(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 29 + "'", int13 == 29);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        logic.BookingSystem bookingSystem0 = null;
        logic.User user5 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str6 = user5.password;
        logic.ParkingSpot parkingSpot10 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean11 = parkingSpot10.isOccupied();
        boolean boolean12 = parkingSpot10.isEnabled();
        logic.Sensor sensor13 = parkingSpot10.getSensor();
        logic.BookingCommand bookingCommand14 = new logic.BookingCommand(bookingSystem0, user5, parkingSpot10);
        bookingCommand14.undo();
        logic.Booking booking16 = bookingCommand14.getBookingResult();
        // The following exception was thrown during execution in test generation
        try {
            bookingCommand14.execute();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"logic.BookingSystem.book(logic.User, logic.ParkingSpot)\" because \"this.bookingSystem\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNull(sensor13);
        org.junit.Assert.assertNull(booking16);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        logic.SuperManager superManager0 = logic.SuperManager.getInstance();
        superManager0.addParkingLot();
        superManager0.setName("Valid");
        superManager0.requestAccountGeneration();
        superManager0.setName("ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]");
        logic.SuperManager superManager7 = logic.SuperManager.getInstance();
        superManager7.addParkingLot();
        superManager7.setName("Valid");
        superManager7.requestAccountGeneration();
        superManager7.setName("ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]");
        superManager0.enableManager((logic.User) superManager7);
        logic.SuperManager superManager15 = logic.SuperManager.getInstance();
        superManager15.addParkingLot();
        logic.User user21 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        logic.BookingSystem bookingSystem22 = null;
        logic.User user27 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str28 = user27.password;
        logic.ParkingSpot parkingSpot32 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean33 = parkingSpot32.isOccupied();
        boolean boolean34 = parkingSpot32.isEnabled();
        logic.Sensor sensor35 = parkingSpot32.getSensor();
        logic.BookingCommand bookingCommand36 = new logic.BookingCommand(bookingSystem22, user27, parkingSpot32);
        logic.Booking booking37 = new logic.Booking(user21, parkingSpot32);
        boolean boolean38 = parkingSpot32.isOccupied();
        superManager15.disableParkingSpot(parkingSpot32);
        superManager0.enableParkingSpot(parkingSpot32);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertNotNull(superManager7);
        org.junit.Assert.assertNotNull(superManager15);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(sensor35);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        logic.BookingSystem bookingSystem0 = new logic.BookingSystem();
        logic.Booking booking1 = bookingSystem0.getCurrentBooking();
        logic.Booking booking2 = bookingSystem0.getCurrentBooking();
        org.junit.Assert.assertNull(booking1);
        org.junit.Assert.assertNull(booking2);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        logic.SuperManager superManager0 = logic.SuperManager.getInstance();
        superManager0.addParkingLot();
        logic.ParkingSpot parkingSpot5 = new logic.ParkingSpot("hi!", false, false);
        java.lang.String str6 = parkingSpot5.toString();
        parkingSpot5.setLocation("Valid");
        superManager0.disableParkingSpot(parkingSpot5);
        boolean boolean11 = superManager0.authenticate((int) (short) 100);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]" + "'", str6, "ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        logic.ParkingManager parkingManager0 = new logic.ParkingManager();
        boolean boolean2 = parkingManager0.addSpot("ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]");
        logic.AddParkingSpotCommand addParkingSpotCommand4 = new logic.AddParkingSpotCommand(parkingManager0, "ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]");
        java.util.List<logic.CompositeParkingLot> compositeParkingLotList5 = parkingManager0.getParkingLots();
        logic.DisableParkingSpotCommand disableParkingSpotCommand7 = new logic.DisableParkingSpotCommand(parkingManager0, "hi!");
        logic.DisableParkingSpotCommand disableParkingSpotCommand9 = new logic.DisableParkingSpotCommand(parkingManager0, "ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]");
        java.util.Map<java.lang.String, logic.ParkingSpot> strMap10 = parkingManager0.getSpots();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(compositeParkingLotList5);
        org.junit.Assert.assertNotNull(strMap10);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        logic.Visitor visitor4 = new logic.Visitor("", (int) (byte) -1, "ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]", "");
        logic.ParkingSpot parkingSpot9 = new logic.ParkingSpot("", true, true, "hi!");
        logic.Booking booking11 = visitor4.bookParkingLot(parkingSpot9, 2);
        org.junit.Assert.assertNotNull(booking11);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        logic.ParkingSpot parkingSpot3 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean4 = parkingSpot3.isOccupied();
        boolean boolean5 = parkingSpot3.isEnabled();
        boolean boolean6 = parkingSpot3.isOccupied();
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        logic.SuperManager superManager0 = logic.SuperManager.getInstance();
        superManager0.addParkingLot();
        superManager0.setName("Valid");
        superManager0.requestAccountGeneration();
        superManager0.setName("ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]");
        superManager0.addParkingLot();
        superManager0.monitorParking();
        java.lang.String str9 = superManager0.getEmail();
        superManager0.addParkingLot();
        boolean boolean12 = superManager0.authenticate(0);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]" + "'", str9, "ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        logic.SuperManager superManager0 = logic.SuperManager.getInstance();
        superManager0.addParkingLot();
        logic.ParkingSpot parkingSpot5 = new logic.ParkingSpot("hi!", false, false);
        java.lang.String str6 = parkingSpot5.toString();
        parkingSpot5.setLocation("Valid");
        superManager0.disableParkingSpot(parkingSpot5);
        logic.FacultyMember facultyMember14 = new logic.FacultyMember("ParkingSpot [id=, location=, enabled=true, occupied=false]", (int) (byte) 1, "hi!", "");
        logic.ParkingSpot parkingSpot19 = new logic.ParkingSpot("", false, true, "");
        logic.Booking booking21 = facultyMember14.bookParkingLot(parkingSpot19, (int) (byte) 1);
        boolean boolean22 = facultyMember14.validateRegistration();
        java.time.ZonedDateTime zonedDateTime23 = null;
        java.time.ZonedDateTime zonedDateTime24 = null;
        logic.BookingSystem bookingSystem27 = null;
        logic.User user32 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str33 = user32.password;
        logic.ParkingSpot parkingSpot37 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean38 = parkingSpot37.isOccupied();
        boolean boolean39 = parkingSpot37.isEnabled();
        logic.Sensor sensor40 = parkingSpot37.getSensor();
        logic.BookingCommand bookingCommand41 = new logic.BookingCommand(bookingSystem27, user32, parkingSpot37);
        logic.Sensor sensor43 = new logic.Sensor((int) ' ');
        sensor43.setCarArrived(true);
        DesignPatternClasses.Observer observer46 = null;
        sensor43.removeObserver(observer46);
        parkingSpot37.setSensor(sensor43);
        logic.User user53 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str54 = user53.password;
        logic.PricingStrategy pricingStrategy55 = null;
        user53.setPricingStrategy(pricingStrategy55);
        logic.Booking booking57 = new logic.Booking(zonedDateTime23, zonedDateTime24, "Valid", false, parkingSpot37, user53);
        logic.Booking booking59 = facultyMember14.bookParkingLot(parkingSpot37, (int) (byte) -1);
        parkingSpot37.setLocation("adminpass");
        superManager0.enableParkingSpot(parkingSpot37);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]" + "'", str6, "ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]");
        org.junit.Assert.assertNotNull(booking21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNull(sensor40);
        org.junit.Assert.assertEquals("'" + str54 + "' != '" + "" + "'", str54, "");
        org.junit.Assert.assertNotNull(booking59);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        logic.SuperManager superManager0 = logic.SuperManager.getInstance();
        superManager0.addParkingLot();
        superManager0.setName("Valid");
        superManager0.requestAccountGeneration();
        superManager0.setName("ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]");
        superManager0.addParkingLot();
        superManager0.monitorParking();
        int int9 = superManager0.getId();
        logic.SuperManager superManager10 = logic.SuperManager.getInstance();
        superManager10.addParkingLot();
        superManager10.setName("Valid");
        superManager10.requestAccountGeneration();
        superManager10.setName("ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]");
        superManager10.addParkingLot();
        superManager10.monitorParking();
        java.lang.String str19 = superManager10.getEmail();
        logic.User user24 = new logic.User("hi!", (int) 'a', "ParkingSpot [id=, location=, enabled=true, occupied=false]", "Valid");
        superManager10.enableManager(user24);
        java.lang.String str26 = superManager10.toString();
        logic.ParkingLot parkingLot28 = new logic.ParkingLot("General Lot");
        superManager10.enableParkingLot(parkingLot28);
        parkingLot28.setId("SuperManager [superMgrID=100, name=Valid, email=ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]]");
        superManager0.enableParkingLot(parkingLot28);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(superManager10);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]" + "'", str19, "ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "SuperManager [superMgrID=100, name=ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false], email=ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]]" + "'", str26, "SuperManager [superMgrID=100, name=ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false], email=ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]]");
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        logic.User user4 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        logic.BookingSystem bookingSystem5 = null;
        logic.User user10 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str11 = user10.password;
        logic.ParkingSpot parkingSpot15 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean16 = parkingSpot15.isOccupied();
        boolean boolean17 = parkingSpot15.isEnabled();
        logic.Sensor sensor18 = parkingSpot15.getSensor();
        logic.BookingCommand bookingCommand19 = new logic.BookingCommand(bookingSystem5, user10, parkingSpot15);
        logic.Booking booking20 = new logic.Booking(user4, parkingSpot15);
        logic.BookingSystem bookingSystem21 = null;
        logic.User user26 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str27 = user26.password;
        logic.ParkingSpot parkingSpot31 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean32 = parkingSpot31.isOccupied();
        boolean boolean33 = parkingSpot31.isEnabled();
        logic.Sensor sensor34 = parkingSpot31.getSensor();
        logic.BookingCommand bookingCommand35 = new logic.BookingCommand(bookingSystem21, user26, parkingSpot31);
        user26.id = '#';
        java.lang.String str38 = user26.name;
        user26.setId(10);
        booking20.user = user26;
        boolean boolean42 = booking20.isShowUp();
        logic.ParkingSpot parkingSpot43 = booking20.getSpot();
        booking20.setShowUp(false);
        booking20.setSensorId(0);
        java.time.ZonedDateTime zonedDateTime48 = booking20.bookingEndTime;
        boolean boolean49 = booking20.isValid;
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(sensor18);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(sensor34);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(parkingSpot43);
        org.junit.Assert.assertNull(zonedDateTime48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        logic.User user4 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        logic.BookingSystem bookingSystem5 = null;
        logic.User user10 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str11 = user10.password;
        logic.ParkingSpot parkingSpot15 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean16 = parkingSpot15.isOccupied();
        boolean boolean17 = parkingSpot15.isEnabled();
        logic.Sensor sensor18 = parkingSpot15.getSensor();
        logic.BookingCommand bookingCommand19 = new logic.BookingCommand(bookingSystem5, user10, parkingSpot15);
        logic.Booking booking20 = new logic.Booking(user4, parkingSpot15);
        logic.BookingSystem bookingSystem21 = null;
        logic.User user26 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str27 = user26.password;
        logic.ParkingSpot parkingSpot31 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean32 = parkingSpot31.isOccupied();
        boolean boolean33 = parkingSpot31.isEnabled();
        logic.Sensor sensor34 = parkingSpot31.getSensor();
        logic.BookingCommand bookingCommand35 = new logic.BookingCommand(bookingSystem21, user26, parkingSpot31);
        user26.id = '#';
        java.lang.String str38 = user26.name;
        user26.setId(10);
        booking20.user = user26;
        boolean boolean42 = booking20.isShowUp();
        booking20.userId = (byte) -1;
        boolean boolean45 = booking20.isValid();
        java.time.ZonedDateTime zonedDateTime46 = booking20.getBookingStartTime();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(sensor18);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(sensor34);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNull(zonedDateTime46);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        java.sql.Connection connection0 = null;
        Connections.DatabaseDAO databaseDAO1 = new Connections.DatabaseDAO(connection0);
        // The following exception was thrown during execution in test generation
        try {
            logic.Sensor sensor3 = databaseDAO1.getSensorById(19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.Connection.prepareStatement(String)\" because \"this.connection\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        logic.User user5 = logic.UserFactory.createUser("ParkingSpot [id=, location=, enabled=true, occupied=false]", "SuperManager [superMgrID=100, name=ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false], email=ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]]", (int) (byte) 1, "hi!", "Valid");
        org.junit.Assert.assertNull(user5);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        java.sql.Connection connection0 = null;
        Connections.DatabaseDAO databaseDAO1 = new Connections.DatabaseDAO(connection0);
        // The following exception was thrown during execution in test generation
        try {
            databaseDAO1.deleteBooking((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.Connection.prepareStatement(String)\" because \"this.connection\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        logic.User user4 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        logic.BookingSystem bookingSystem5 = null;
        logic.User user10 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str11 = user10.password;
        logic.ParkingSpot parkingSpot15 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean16 = parkingSpot15.isOccupied();
        boolean boolean17 = parkingSpot15.isEnabled();
        logic.Sensor sensor18 = parkingSpot15.getSensor();
        logic.BookingCommand bookingCommand19 = new logic.BookingCommand(bookingSystem5, user10, parkingSpot15);
        logic.Booking booking20 = new logic.Booking(user4, parkingSpot15);
        logic.BookingSystem bookingSystem21 = null;
        logic.User user26 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str27 = user26.password;
        logic.ParkingSpot parkingSpot31 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean32 = parkingSpot31.isOccupied();
        boolean boolean33 = parkingSpot31.isEnabled();
        logic.Sensor sensor34 = parkingSpot31.getSensor();
        logic.BookingCommand bookingCommand35 = new logic.BookingCommand(bookingSystem21, user26, parkingSpot31);
        user26.id = '#';
        java.lang.String str38 = user26.name;
        user26.setId(10);
        booking20.user = user26;
        logic.ParkingSpot parkingSpot42 = booking20.getSpot();
        boolean boolean43 = booking20.isShowUp();
        logic.ParkingSpot parkingSpot47 = new logic.ParkingSpot("hi!", false, false);
        java.lang.String str48 = parkingSpot47.toString();
        parkingSpot47.setLocation("Valid");
        java.lang.String str51 = parkingSpot47.getSpotId();
        booking20.spot = parkingSpot47;
        logic.ParkingSpot parkingSpot53 = booking20.spot;
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(sensor18);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(sensor34);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(parkingSpot42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]" + "'", str48, "ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "hi!" + "'", str51, "hi!");
        org.junit.Assert.assertNotNull(parkingSpot53);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        logic.Sensor sensor1 = new logic.Sensor((int) ' ');
        sensor1.setCarArrived(true);
        java.lang.String str4 = sensor1.getCurrentCarPlate();
        boolean boolean5 = sensor1.isCarArrived();
        java.time.ZonedDateTime zonedDateTime6 = sensor1.getSensorDeactivationTime();
        sensor1.setCurrentCarBrand("Valid");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNull(zonedDateTime6);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        logic.CompositeParkingLot compositeParkingLot1 = new logic.CompositeParkingLot("ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]");
        logic.ParkingSpot parkingSpot6 = new logic.ParkingSpot("", false, true, "");
        parkingSpot6.setEnabled(false);
        compositeParkingLot1.add((logic.ParkingComponent) parkingSpot6);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        logic.Sensor sensor1 = new logic.Sensor((int) ' ');
        boolean boolean2 = sensor1.isCarArrived();
        java.lang.String str3 = sensor1.getCurrentCarBrand();
        logic.User user8 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        logic.BookingSystem bookingSystem9 = null;
        logic.User user14 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str15 = user14.password;
        logic.ParkingSpot parkingSpot19 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean20 = parkingSpot19.isOccupied();
        boolean boolean21 = parkingSpot19.isEnabled();
        logic.Sensor sensor22 = parkingSpot19.getSensor();
        logic.BookingCommand bookingCommand23 = new logic.BookingCommand(bookingSystem9, user14, parkingSpot19);
        logic.Booking booking24 = new logic.Booking(user8, parkingSpot19);
        sensor1.removeObserver((DesignPatternClasses.Observer) booking24);
        booking24.bookingId = (byte) 10;
        java.time.ZonedDateTime zonedDateTime28 = null;
        booking24.bookingStartTime = zonedDateTime28;
        int int30 = booking24.getBookingId();
        logic.Sensor sensor32 = new logic.Sensor((int) ' ');
        boolean boolean33 = sensor32.isCarArrived();
        java.lang.String str34 = sensor32.getCurrentCarBrand();
        logic.User user39 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        logic.BookingSystem bookingSystem40 = null;
        logic.User user45 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str46 = user45.password;
        logic.ParkingSpot parkingSpot50 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean51 = parkingSpot50.isOccupied();
        boolean boolean52 = parkingSpot50.isEnabled();
        logic.Sensor sensor53 = parkingSpot50.getSensor();
        logic.BookingCommand bookingCommand54 = new logic.BookingCommand(bookingSystem40, user45, parkingSpot50);
        logic.Booking booking55 = new logic.Booking(user39, parkingSpot50);
        sensor32.removeObserver((DesignPatternClasses.Observer) booking55);
        booking55.bookingId = (byte) 10;
        logic.FacultyMember facultyMember63 = new logic.FacultyMember("ParkingSpot [id=, location=, enabled=true, occupied=false]", (int) (byte) 1, "hi!", "");
        boolean boolean64 = facultyMember63.validateRegistration();
        logic.SuperManager superManager65 = logic.SuperManager.getInstance();
        superManager65.addParkingLot();
        logic.ParkingSpot parkingSpot70 = new logic.ParkingSpot("hi!", false, false);
        java.lang.String str71 = parkingSpot70.toString();
        parkingSpot70.setLocation("Valid");
        superManager65.disableParkingSpot(parkingSpot70);
        java.lang.String str75 = parkingSpot70.toString();
        logic.Booking booking77 = facultyMember63.bookParkingLot(parkingSpot70, (int) (byte) -1);
        int int78 = booking77.bookingId;
        java.time.ZonedDateTime zonedDateTime79 = booking77.bookingStartTime;
        booking55.setBookingEndTime(zonedDateTime79);
        booking24.bookingStartTime = zonedDateTime79;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(sensor22);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 10 + "'", int30 == 10);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNull(sensor53);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(superManager65);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]" + "'", str71, "ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]" + "'", str75, "ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]");
        org.junit.Assert.assertNotNull(booking77);
// flaky "7) test212(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int78 + "' != '" + 35 + "'", int78 == 35);
        org.junit.Assert.assertNotNull(zonedDateTime79);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        logic.ParkingManager parkingManager0 = new logic.ParkingManager();
        boolean boolean2 = parkingManager0.addSpot("ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]");
        logic.AddParkingSpotCommand addParkingSpotCommand4 = new logic.AddParkingSpotCommand(parkingManager0, "ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]");
        addParkingSpotCommand4.execute();
        addParkingSpotCommand4.execute();
        addParkingSpotCommand4.execute();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        logic.ParkingManager parkingManager0 = new logic.ParkingManager();
        boolean boolean2 = parkingManager0.addSpot("ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]");
        logic.AddParkingSpotCommand addParkingSpotCommand4 = new logic.AddParkingSpotCommand(parkingManager0, "ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]");
        java.util.List<logic.CompositeParkingLot> compositeParkingLotList5 = parkingManager0.getParkingLots();
        int int6 = parkingManager0.getSpotsCount();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(compositeParkingLotList5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 28 + "'", int6 == 28);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        logic.User user4 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        logic.BookingSystem bookingSystem5 = null;
        logic.User user10 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str11 = user10.password;
        logic.ParkingSpot parkingSpot15 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean16 = parkingSpot15.isOccupied();
        boolean boolean17 = parkingSpot15.isEnabled();
        logic.Sensor sensor18 = parkingSpot15.getSensor();
        logic.BookingCommand bookingCommand19 = new logic.BookingCommand(bookingSystem5, user10, parkingSpot15);
        logic.Booking booking20 = new logic.Booking(user4, parkingSpot15);
        logic.BookingSystem bookingSystem21 = null;
        logic.User user26 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str27 = user26.password;
        logic.ParkingSpot parkingSpot31 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean32 = parkingSpot31.isOccupied();
        boolean boolean33 = parkingSpot31.isEnabled();
        logic.Sensor sensor34 = parkingSpot31.getSensor();
        logic.BookingCommand bookingCommand35 = new logic.BookingCommand(bookingSystem21, user26, parkingSpot31);
        user26.id = '#';
        java.lang.String str38 = user26.name;
        user26.setId(10);
        booking20.user = user26;
        boolean boolean42 = booking20.isShowUp();
        booking20.userId = (byte) -1;
        logic.BookingSystem bookingSystem45 = null;
        logic.User user50 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str51 = user50.password;
        logic.ParkingSpot parkingSpot55 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean56 = parkingSpot55.isOccupied();
        boolean boolean57 = parkingSpot55.isEnabled();
        logic.Sensor sensor58 = parkingSpot55.getSensor();
        logic.BookingCommand bookingCommand59 = new logic.BookingCommand(bookingSystem45, user50, parkingSpot55);
        user50.id = '#';
        java.lang.String str62 = user50.name;
        booking20.user = user50;
        logic.User user64 = booking20.getUser();
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(sensor18);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(sensor34);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + false + "'", boolean56 == false);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNull(sensor58);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "hi!" + "'", str62, "hi!");
        org.junit.Assert.assertNotNull(user64);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        logic.User user4 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str5 = user4.password;
        logic.StudentPricing studentPricing6 = new logic.StudentPricing();
        double double8 = studentPricing6.calculatePrice((int) (short) 0);
        double double10 = studentPricing6.calculatePrice(32);
        user4.setPricingStrategy((logic.PricingStrategy) studentPricing6);
        user4.deductBalance((double) 100.0f);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double8 + "' != '" + 0.0d + "'", double8 == 0.0d);
        org.junit.Assert.assertTrue("'" + double10 + "' != '" + 2.6666666666666665d + "'", double10 == 2.6666666666666665d);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        logic.BookingSystem bookingSystem0 = new logic.BookingSystem();
        logic.SuperManager superManager1 = logic.SuperManager.getInstance();
        superManager1.addParkingLot();
        superManager1.setName("Valid");
        superManager1.requestAccountGeneration();
        superManager1.setName("ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]");
        superManager1.addParkingLot();
        superManager1.monitorParking();
        java.lang.String str10 = superManager1.getEmail();
        logic.User user15 = new logic.User("hi!", (int) 'a', "ParkingSpot [id=, location=, enabled=true, occupied=false]", "Valid");
        superManager1.enableManager(user15);
        logic.ParkingSpot parkingSpot21 = new logic.ParkingSpot("", false, true, "");
        java.lang.String str22 = parkingSpot21.toString();
        logic.Booking booking23 = bookingSystem0.book((logic.User) superManager1, parkingSpot21);
        superManager1.setName("ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]");
        org.junit.Assert.assertNotNull(superManager1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]" + "'", str10, "ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ParkingSpot [id=, location=, enabled=true, occupied=false]" + "'", str22, "ParkingSpot [id=, location=, enabled=true, occupied=false]");
        org.junit.Assert.assertNotNull(booking23);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        logic.User user4 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str5 = user4.password;
        logic.FacultyPricing facultyPricing6 = new logic.FacultyPricing();
        user4.setPricingStrategy((logic.PricingStrategy) facultyPricing6);
        double double9 = facultyPricing6.calculatePrice(0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + double9 + "' != '" + 0.0d + "'", double9 == 0.0d);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        logic.ParkingManager parkingManager0 = new logic.ParkingManager();
        boolean boolean2 = parkingManager0.enableSpot("ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]");
        boolean boolean4 = parkingManager0.addSpot("Valid");
        java.util.Map<java.lang.String, logic.ParkingSpot> strMap5 = parkingManager0.getSpots();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(strMap5);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        logic.Sensor sensor1 = new logic.Sensor((int) ' ');
        boolean boolean2 = sensor1.isCarArrived();
        java.lang.String str3 = sensor1.getCurrentCarBrand();
        logic.User user8 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        logic.BookingSystem bookingSystem9 = null;
        logic.User user14 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str15 = user14.password;
        logic.ParkingSpot parkingSpot19 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean20 = parkingSpot19.isOccupied();
        boolean boolean21 = parkingSpot19.isEnabled();
        logic.Sensor sensor22 = parkingSpot19.getSensor();
        logic.BookingCommand bookingCommand23 = new logic.BookingCommand(bookingSystem9, user14, parkingSpot19);
        logic.Booking booking24 = new logic.Booking(user8, parkingSpot19);
        sensor1.removeObserver((DesignPatternClasses.Observer) booking24);
        booking24.bookingId = (byte) 10;
        logic.ParkingSpot parkingSpot28 = booking24.getSpot();
        logic.FacultyMember facultyMember33 = new logic.FacultyMember("ParkingSpot [id=, location=, enabled=true, occupied=false]", (int) (byte) 1, "hi!", "");
        logic.ParkingSpot parkingSpot38 = new logic.ParkingSpot("", false, true, "");
        logic.Booking booking40 = facultyMember33.bookParkingLot(parkingSpot38, (int) (byte) 1);
        boolean boolean41 = facultyMember33.validateRegistration();
        java.time.ZonedDateTime zonedDateTime42 = null;
        java.time.ZonedDateTime zonedDateTime43 = null;
        logic.BookingSystem bookingSystem46 = null;
        logic.User user51 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str52 = user51.password;
        logic.ParkingSpot parkingSpot56 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean57 = parkingSpot56.isOccupied();
        boolean boolean58 = parkingSpot56.isEnabled();
        logic.Sensor sensor59 = parkingSpot56.getSensor();
        logic.BookingCommand bookingCommand60 = new logic.BookingCommand(bookingSystem46, user51, parkingSpot56);
        logic.Sensor sensor62 = new logic.Sensor((int) ' ');
        sensor62.setCarArrived(true);
        DesignPatternClasses.Observer observer65 = null;
        sensor62.removeObserver(observer65);
        parkingSpot56.setSensor(sensor62);
        logic.User user72 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str73 = user72.password;
        logic.PricingStrategy pricingStrategy74 = null;
        user72.setPricingStrategy(pricingStrategy74);
        logic.Booking booking76 = new logic.Booking(zonedDateTime42, zonedDateTime43, "Valid", false, parkingSpot56, user72);
        logic.Booking booking78 = facultyMember33.bookParkingLot(parkingSpot56, (int) (byte) -1);
        parkingSpot56.setLocation("adminpass");
        booking24.spot = parkingSpot56;
        int int82 = booking24.getBookingId();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(sensor22);
        org.junit.Assert.assertNotNull(parkingSpot28);
        org.junit.Assert.assertNotNull(booking40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertNull(sensor59);
        org.junit.Assert.assertEquals("'" + str73 + "' != '" + "" + "'", str73, "");
        org.junit.Assert.assertNotNull(booking78);
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 10 + "'", int82 == 10);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        logic.Sensor sensor1 = new logic.Sensor((int) ' ');
        sensor1.setCarArrived(true);
        DesignPatternClasses.Observer observer4 = null;
        sensor1.removeObserver(observer4);
        int int6 = sensor1.getSensorId();
        sensor1.setCurrentCarPlate("ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]");
        sensor1.setSensorOn(false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32 + "'", int6 == 32);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        logic.Sensor sensor1 = new logic.Sensor((int) ' ');
        boolean boolean2 = sensor1.isCarArrived();
        java.lang.String str3 = sensor1.getCurrentCarBrand();
        sensor1.clearCurrentCarInfo();
        java.lang.String str5 = sensor1.getCurrentCarModel();
        logic.Sensor sensor7 = new logic.Sensor((int) ' ');
        boolean boolean8 = sensor7.isCarArrived();
        java.lang.String str9 = sensor7.getCurrentCarBrand();
        logic.User user14 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        logic.BookingSystem bookingSystem15 = null;
        logic.User user20 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str21 = user20.password;
        logic.ParkingSpot parkingSpot25 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean26 = parkingSpot25.isOccupied();
        boolean boolean27 = parkingSpot25.isEnabled();
        logic.Sensor sensor28 = parkingSpot25.getSensor();
        logic.BookingCommand bookingCommand29 = new logic.BookingCommand(bookingSystem15, user20, parkingSpot25);
        logic.Booking booking30 = new logic.Booking(user14, parkingSpot25);
        sensor7.removeObserver((DesignPatternClasses.Observer) booking30);
        booking30.bookingId = (byte) 10;
        logic.FacultyMember facultyMember38 = new logic.FacultyMember("ParkingSpot [id=, location=, enabled=true, occupied=false]", (int) (byte) 1, "hi!", "");
        boolean boolean39 = facultyMember38.validateRegistration();
        logic.SuperManager superManager40 = logic.SuperManager.getInstance();
        superManager40.addParkingLot();
        logic.ParkingSpot parkingSpot45 = new logic.ParkingSpot("hi!", false, false);
        java.lang.String str46 = parkingSpot45.toString();
        parkingSpot45.setLocation("Valid");
        superManager40.disableParkingSpot(parkingSpot45);
        java.lang.String str50 = parkingSpot45.toString();
        logic.Booking booking52 = facultyMember38.bookParkingLot(parkingSpot45, (int) (byte) -1);
        int int53 = booking52.bookingId;
        java.time.ZonedDateTime zonedDateTime54 = booking52.bookingStartTime;
        booking30.setBookingEndTime(zonedDateTime54);
        sensor1.activateSensor(zonedDateTime54);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(sensor28);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(superManager40);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]" + "'", str46, "ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]" + "'", str50, "ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]");
        org.junit.Assert.assertNotNull(booking52);
// flaky "8) test222(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int53 + "' != '" + 43 + "'", int53 == 43);
        org.junit.Assert.assertNotNull(zonedDateTime54);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        java.sql.Connection connection0 = null;
        Connections.DatabaseDAO databaseDAO1 = new Connections.DatabaseDAO(connection0);
        logic.NonFacultyStaff nonFacultyStaff6 = new logic.NonFacultyStaff("ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]", (int) (byte) 1, "Valid", "Valid");
        // The following exception was thrown during execution in test generation
        try {
            databaseDAO1.addNonFacultyStaff(nonFacultyStaff6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.Connection.prepareStatement(String)\" because \"this.connection\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        logic.ParkingSpot parkingSpot5 = new logic.ParkingSpot("SuperManager [superMgrID=100, name=ParkingSpot [id=, location=, enabled=true, occupied=false], email=ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]]", "hi!", true, false, (-1));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        logic.SuperManager superManager0 = logic.SuperManager.getInstance();
        superManager0.addParkingLot();
        superManager0.setName("Valid");
        superManager0.requestAccountGeneration();
        superManager0.setName("ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]");
        superManager0.addParkingLot();
        superManager0.monitorParking();
        java.lang.String str9 = superManager0.getEmail();
        logic.User user14 = new logic.User("hi!", (int) 'a', "ParkingSpot [id=, location=, enabled=true, occupied=false]", "Valid");
        superManager0.enableManager(user14);
        java.lang.String str16 = superManager0.toString();
        logic.ParkingLot parkingLot18 = new logic.ParkingLot("General Lot");
        superManager0.enableParkingLot(parkingLot18);
        superManager0.email = "SuperManager [superMgrID=100, name=ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false], email=ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]]";
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]" + "'", str9, "ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "SuperManager [superMgrID=100, name=ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false], email=ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]]" + "'", str16, "SuperManager [superMgrID=100, name=ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false], email=ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]]");
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        java.sql.Connection connection0 = null;
        Connections.DatabaseDAO databaseDAO1 = new Connections.DatabaseDAO(connection0);
        logic.Student student6 = new logic.Student("ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]", (-1), "ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]", "ParkingSpot [id=, location=, enabled=true, occupied=false]");
        boolean boolean7 = student6.validateRegistration();
        // The following exception was thrown during execution in test generation
        try {
            databaseDAO1.addStudent(student6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.Connection.prepareStatement(String)\" because \"this.connection\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        logic.Sensor sensor1 = new logic.Sensor((int) ' ');
        boolean boolean2 = sensor1.isCarArrived();
        java.time.ZonedDateTime zonedDateTime3 = sensor1.getSensorActivationTime();
        sensor1.setCarArrived(false);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNull(zonedDateTime3);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        logic.NonFacultyStaff nonFacultyStaff4 = new logic.NonFacultyStaff("ParkingSpot [id=, location=, enabled=true, occupied=false]", (int) 'a', "ParkingSpot [id=, location=, enabled=true, occupied=false]", "hi!");
        nonFacultyStaff4.email = "ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]";
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        logic.CompositeParkingLot compositeParkingLot1 = new logic.CompositeParkingLot("ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]");
        logic.ParkingSpot parkingSpot6 = new logic.ParkingSpot("", false, true, "");
        compositeParkingLot1.remove((logic.ParkingComponent) parkingSpot6);
        boolean boolean8 = compositeParkingLot1.isOccupied();
        logic.ParkingComponent parkingComponent9 = null;
        compositeParkingLot1.add(parkingComponent9);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        logic.ValidState validState1 = new logic.ValidState(100);
        java.time.LocalDateTime localDateTime2 = validState1.getExpirationTime();
        logic.ExtendedState extendedState4 = new logic.ExtendedState(localDateTime2, (int) (byte) 0);
        int int5 = extendedState4.getExtensionMinutes();
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        logic.SuperManager superManager0 = logic.SuperManager.getInstance();
        superManager0.addParkingLot();
        superManager0.setName("Valid");
        superManager0.requestAccountGeneration();
        superManager0.setName("ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]");
        superManager0.addParkingLot();
        superManager0.monitorParking();
        java.lang.String str9 = superManager0.getEmail();
        logic.User user14 = new logic.User("hi!", (int) 'a', "ParkingSpot [id=, location=, enabled=true, occupied=false]", "Valid");
        superManager0.enableManager(user14);
        java.lang.String str16 = superManager0.toString();
        logic.ParkingLot parkingLot18 = new logic.ParkingLot("General Lot");
        superManager0.enableParkingLot(parkingLot18);
        parkingLot18.enableSpot("SuperManager [superMgrID=100, name=ParkingSpot [id=, location=, enabled=true, occupied=false], email=ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]]");
        java.util.Map<java.lang.String, logic.ParkingSpot> strMap22 = parkingLot18.getSpots();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "SuperManager [superMgrID=100, name=ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false], email=ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]]" + "'", str9, "SuperManager [superMgrID=100, name=ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false], email=ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "SuperManager [superMgrID=100, name=ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false], email=SuperManager [superMgrID=100, name=ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false], email=ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]]]" + "'", str16, "SuperManager [superMgrID=100, name=ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false], email=SuperManager [superMgrID=100, name=ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false], email=ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]]]");
        org.junit.Assert.assertNotNull(strMap22);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        java.time.ZonedDateTime zonedDateTime0 = null;
        java.time.ZonedDateTime zonedDateTime1 = null;
        logic.BookingSystem bookingSystem4 = null;
        logic.User user9 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str10 = user9.password;
        logic.ParkingSpot parkingSpot14 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean15 = parkingSpot14.isOccupied();
        boolean boolean16 = parkingSpot14.isEnabled();
        logic.Sensor sensor17 = parkingSpot14.getSensor();
        logic.BookingCommand bookingCommand18 = new logic.BookingCommand(bookingSystem4, user9, parkingSpot14);
        logic.Sensor sensor20 = new logic.Sensor((int) ' ');
        sensor20.setCarArrived(true);
        DesignPatternClasses.Observer observer23 = null;
        sensor20.removeObserver(observer23);
        parkingSpot14.setSensor(sensor20);
        logic.User user30 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str31 = user30.password;
        logic.PricingStrategy pricingStrategy32 = null;
        user30.setPricingStrategy(pricingStrategy32);
        logic.Booking booking34 = new logic.Booking(zonedDateTime0, zonedDateTime1, "Valid", false, parkingSpot14, user30);
        booking34.setCarLicensePlate("SuperManager [superMgrID=100, name=ParkingSpot [id=, location=, enabled=true, occupied=false], email=ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]]");
        java.lang.String str37 = booking34.getEmail();
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(sensor17);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "hi!" + "'", str37, "hi!");
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        logic.Sensor sensor1 = new logic.Sensor((int) ' ');
        sensor1.setCarArrived(true);
        DesignPatternClasses.Observer observer4 = null;
        sensor1.removeObserver(observer4);
        sensor1.setCarArrived(true);
        java.lang.String str8 = sensor1.getCurrentCarColor();
        java.lang.String str9 = sensor1.getCurrentCarPlate();
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        logic.MobileAppPaymentsStrategy mobileAppPaymentsStrategy0 = new logic.MobileAppPaymentsStrategy();
        logic.SuperManager superManager1 = logic.SuperManager.getInstance();
        boolean boolean3 = superManager1.authenticate((int) (byte) 0);
        java.lang.String str4 = superManager1.getEmail();
        superManager1.monitorParking();
        boolean boolean7 = mobileAppPaymentsStrategy0.pay((logic.User) superManager1, (double) (short) 0);
        org.junit.Assert.assertNotNull(superManager1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "SuperManager [superMgrID=100, name=ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false], email=ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]]" + "'", str4, "SuperManager [superMgrID=100, name=ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false], email=ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        logic.ParkingSpot parkingSpot5 = new logic.ParkingSpot("adminpass", false, false, "SuperManager [superMgrID=100, name=ParkingSpot [id=, location=, enabled=true, occupied=false], email=ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]]", 0);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        logic.BookingSystem bookingSystem0 = new logic.BookingSystem();
        logic.SuperManager superManager1 = logic.SuperManager.getInstance();
        superManager1.addParkingLot();
        superManager1.setName("Valid");
        superManager1.requestAccountGeneration();
        superManager1.setName("ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]");
        superManager1.addParkingLot();
        superManager1.monitorParking();
        java.lang.String str10 = superManager1.getEmail();
        logic.User user15 = new logic.User("hi!", (int) 'a', "ParkingSpot [id=, location=, enabled=true, occupied=false]", "Valid");
        superManager1.enableManager(user15);
        logic.ParkingSpot parkingSpot21 = new logic.ParkingSpot("", false, true, "");
        java.lang.String str22 = parkingSpot21.toString();
        logic.Booking booking23 = bookingSystem0.book((logic.User) superManager1, parkingSpot21);
        logic.Booking booking24 = bookingSystem0.getCurrentBooking();
        org.junit.Assert.assertNotNull(superManager1);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "SuperManager [superMgrID=100, name=ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false], email=ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]]" + "'", str10, "SuperManager [superMgrID=100, name=ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false], email=ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]]");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ParkingSpot [id=, location=, enabled=true, occupied=false]" + "'", str22, "ParkingSpot [id=, location=, enabled=true, occupied=false]");
        org.junit.Assert.assertNotNull(booking23);
        org.junit.Assert.assertNotNull(booking24);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        java.time.ZonedDateTime zonedDateTime0 = null;
        java.time.ZonedDateTime zonedDateTime1 = null;
        logic.BookingSystem bookingSystem4 = null;
        logic.User user9 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str10 = user9.password;
        logic.ParkingSpot parkingSpot14 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean15 = parkingSpot14.isOccupied();
        boolean boolean16 = parkingSpot14.isEnabled();
        logic.Sensor sensor17 = parkingSpot14.getSensor();
        logic.BookingCommand bookingCommand18 = new logic.BookingCommand(bookingSystem4, user9, parkingSpot14);
        logic.Sensor sensor20 = new logic.Sensor((int) ' ');
        sensor20.setCarArrived(true);
        DesignPatternClasses.Observer observer23 = null;
        sensor20.removeObserver(observer23);
        parkingSpot14.setSensor(sensor20);
        logic.User user30 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str31 = user30.password;
        logic.PricingStrategy pricingStrategy32 = null;
        user30.setPricingStrategy(pricingStrategy32);
        logic.Booking booking34 = new logic.Booking(zonedDateTime0, zonedDateTime1, "Valid", false, parkingSpot14, user30);
        booking34.setCarLicensePlate("SuperManager [superMgrID=100, name=ParkingSpot [id=, location=, enabled=true, occupied=false], email=ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]]");
        int int37 = booking34.userId;
        int int38 = booking34.userId;
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNull(sensor17);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        logic.Sensor sensor1 = new logic.Sensor((int) ' ');
        sensor1.setCarArrived(true);
        java.lang.String str4 = sensor1.getCurrentCarPlate();
        sensor1.setCurrentCarModel("SuperManager [superMgrID=100, name=ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false], email=SuperManager [superMgrID=100, name=ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false], email=ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]]]");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        logic.Sensor sensor1 = new logic.Sensor((int) ' ');
        boolean boolean2 = sensor1.isCarArrived();
        java.lang.String str3 = sensor1.getCurrentCarBrand();
        sensor1.clearCurrentCarInfo();
        sensor1.clearCurrentCarInfo();
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        logic.Sensor sensor1 = new logic.Sensor((int) ' ');
        boolean boolean2 = sensor1.isCarArrived();
        java.lang.String str3 = sensor1.getCurrentCarBrand();
        logic.User user8 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        logic.BookingSystem bookingSystem9 = null;
        logic.User user14 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str15 = user14.password;
        logic.ParkingSpot parkingSpot19 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean20 = parkingSpot19.isOccupied();
        boolean boolean21 = parkingSpot19.isEnabled();
        logic.Sensor sensor22 = parkingSpot19.getSensor();
        logic.BookingCommand bookingCommand23 = new logic.BookingCommand(bookingSystem9, user14, parkingSpot19);
        logic.Booking booking24 = new logic.Booking(user8, parkingSpot19);
        sensor1.removeObserver((DesignPatternClasses.Observer) booking24);
        booking24.bookingId = (byte) 10;
        logic.FacultyMember facultyMember32 = new logic.FacultyMember("ParkingSpot [id=, location=, enabled=true, occupied=false]", (int) (byte) 1, "hi!", "");
        boolean boolean33 = facultyMember32.validateRegistration();
        logic.SuperManager superManager34 = logic.SuperManager.getInstance();
        superManager34.addParkingLot();
        logic.ParkingSpot parkingSpot39 = new logic.ParkingSpot("hi!", false, false);
        java.lang.String str40 = parkingSpot39.toString();
        parkingSpot39.setLocation("Valid");
        superManager34.disableParkingSpot(parkingSpot39);
        java.lang.String str44 = parkingSpot39.toString();
        logic.Booking booking46 = facultyMember32.bookParkingLot(parkingSpot39, (int) (byte) -1);
        int int47 = booking46.bookingId;
        java.time.ZonedDateTime zonedDateTime48 = booking46.bookingStartTime;
        booking24.setBookingEndTime(zonedDateTime48);
        logic.ParkingSpot parkingSpot50 = booking24.spot;
        logic.ParkingSpot parkingSpot51 = booking24.spot;
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(sensor22);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertNotNull(superManager34);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]" + "'", str40, "ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]" + "'", str44, "ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]");
        org.junit.Assert.assertNotNull(booking46);
// flaky "9) test240(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int47 + "' != '" + 47 + "'", int47 == 47);
        org.junit.Assert.assertNotNull(zonedDateTime48);
        org.junit.Assert.assertNotNull(parkingSpot50);
        org.junit.Assert.assertNotNull(parkingSpot51);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        logic.Visitor visitor4 = new logic.Visitor("", (int) (byte) -1, "ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]", "");
        visitor4.setEmail("ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]");
        logic.CompositeParkingLot compositeParkingLot8 = new logic.CompositeParkingLot("ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]");
        logic.ParkingSpot parkingSpot13 = new logic.ParkingSpot("", false, true, "");
        compositeParkingLot8.remove((logic.ParkingComponent) parkingSpot13);
        logic.User user19 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        logic.BookingSystem bookingSystem20 = null;
        logic.User user25 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str26 = user25.password;
        logic.ParkingSpot parkingSpot30 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean31 = parkingSpot30.isOccupied();
        boolean boolean32 = parkingSpot30.isEnabled();
        logic.Sensor sensor33 = parkingSpot30.getSensor();
        logic.BookingCommand bookingCommand34 = new logic.BookingCommand(bookingSystem20, user25, parkingSpot30);
        logic.Booking booking35 = new logic.Booking(user19, parkingSpot30);
        boolean boolean36 = parkingSpot30.isOccupied();
        parkingSpot30.showDetails();
        compositeParkingLot8.remove((logic.ParkingComponent) parkingSpot30);
        logic.Booking booking40 = visitor4.bookParkingLot(parkingSpot30, (int) (short) 0);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNull(sensor33);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(booking40);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        logic.SuperManager superManager0 = logic.SuperManager.getInstance();
        superManager0.addParkingLot();
        superManager0.setName("Valid");
        superManager0.requestAccountGeneration();
        logic.User user9 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        logic.BookingSystem bookingSystem10 = null;
        logic.User user15 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str16 = user15.password;
        logic.ParkingSpot parkingSpot20 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean21 = parkingSpot20.isOccupied();
        boolean boolean22 = parkingSpot20.isEnabled();
        logic.Sensor sensor23 = parkingSpot20.getSensor();
        logic.BookingCommand bookingCommand24 = new logic.BookingCommand(bookingSystem10, user15, parkingSpot20);
        logic.Booking booking25 = new logic.Booking(user9, parkingSpot20);
        logic.BookingSystem bookingSystem26 = null;
        logic.User user31 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str32 = user31.password;
        logic.ParkingSpot parkingSpot36 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean37 = parkingSpot36.isOccupied();
        boolean boolean38 = parkingSpot36.isEnabled();
        logic.Sensor sensor39 = parkingSpot36.getSensor();
        logic.BookingCommand bookingCommand40 = new logic.BookingCommand(bookingSystem26, user31, parkingSpot36);
        user31.id = '#';
        java.lang.String str43 = user31.name;
        user31.setId(10);
        booking25.user = user31;
        superManager0.disableManager(user31);
        logic.DebitCardPaymentsStrategy debitCardPaymentsStrategy48 = new logic.DebitCardPaymentsStrategy();
        user31.setPaymentStrategy((logic.PaymentStrategy) debitCardPaymentsStrategy48);
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNull(sensor23);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNull(sensor39);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "hi!" + "'", str43, "hi!");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        logic.User user4 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        logic.BookingSystem bookingSystem5 = null;
        logic.User user10 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str11 = user10.password;
        logic.ParkingSpot parkingSpot15 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean16 = parkingSpot15.isOccupied();
        boolean boolean17 = parkingSpot15.isEnabled();
        logic.Sensor sensor18 = parkingSpot15.getSensor();
        logic.BookingCommand bookingCommand19 = new logic.BookingCommand(bookingSystem5, user10, parkingSpot15);
        logic.Booking booking20 = new logic.Booking(user4, parkingSpot15);
        java.time.ZonedDateTime zonedDateTime21 = booking20.bookingEndTime;
        // The following exception was thrown during execution in test generation
        try {
            booking20.update();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"logic.Sensor.isSensorOn()\" because \"sensor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(sensor18);
        org.junit.Assert.assertNull(zonedDateTime21);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        logic.SuperManager superManager0 = logic.SuperManager.getInstance();
        boolean boolean2 = superManager0.authenticate((int) (byte) 0);
        superManager0.requestAccountGeneration();
        logic.SuperManager superManager4 = logic.SuperManager.getInstance();
        superManager4.addParkingLot();
        superManager0.disableManager((logic.User) superManager4);
        java.lang.String str7 = superManager4.toString();
        superManager4.setEmail("hi!");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(superManager4);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "SuperManager [superMgrID=100, name=Valid, email=SuperManager [superMgrID=100, name=ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false], email=ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]]]" + "'", str7, "SuperManager [superMgrID=100, name=Valid, email=SuperManager [superMgrID=100, name=ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false], email=ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]]]");
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        logic.ParkingSpot parkingSpot4 = new logic.ParkingSpot("Valid", true, true, "adminpass");
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        logic.SuperManager superManager0 = logic.SuperManager.getInstance();
        superManager0.addParkingLot();
        superManager0.setName("Valid");
        superManager0.setName("ParkingSpot [id=, location=, enabled=true, occupied=false]");
        logic.ParkingSpot parkingSpot9 = new logic.ParkingSpot("adminpass", false, true);
        logic.Booking booking10 = new logic.Booking((logic.User) superManager0, parkingSpot9);
        org.junit.Assert.assertNotNull(superManager0);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        logic.Sensor sensor1 = new logic.Sensor((int) ' ');
        sensor1.setCarArrived(true);
        DesignPatternClasses.Observer observer4 = null;
        sensor1.removeObserver(observer4);
        logic.Booking booking6 = new logic.Booking();
        sensor1.addObserver((DesignPatternClasses.Observer) booking6);
        logic.User user8 = booking6.user;
        org.junit.Assert.assertNull(user8);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        logic.CompositeParkingLot compositeParkingLot1 = new logic.CompositeParkingLot("ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]");
        logic.ParkingSpot parkingSpot6 = new logic.ParkingSpot("", false, true, "");
        compositeParkingLot1.remove((logic.ParkingComponent) parkingSpot6);
        logic.User user12 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        logic.BookingSystem bookingSystem13 = null;
        logic.User user18 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str19 = user18.password;
        logic.ParkingSpot parkingSpot23 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean24 = parkingSpot23.isOccupied();
        boolean boolean25 = parkingSpot23.isEnabled();
        logic.Sensor sensor26 = parkingSpot23.getSensor();
        logic.BookingCommand bookingCommand27 = new logic.BookingCommand(bookingSystem13, user18, parkingSpot23);
        logic.Booking booking28 = new logic.Booking(user12, parkingSpot23);
        boolean boolean29 = parkingSpot23.isOccupied();
        parkingSpot23.showDetails();
        compositeParkingLot1.remove((logic.ParkingComponent) parkingSpot23);
        java.lang.String str32 = compositeParkingLot1.getId();
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(sensor26);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]" + "'", str32, "ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]");
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        logic.Sensor sensor1 = new logic.Sensor((int) ' ');
        sensor1.setCarArrived(true);
        java.time.ZonedDateTime zonedDateTime4 = null;
        sensor1.activateSensor(zonedDateTime4);
        DesignPatternClasses.Observer observer6 = null;
        sensor1.removeObserver(observer6);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        logic.FacultyMember facultyMember4 = new logic.FacultyMember("ParkingSpot [id=, location=, enabled=true, occupied=false]", (int) (byte) 1, "hi!", "");
        logic.ParkingSpot parkingSpot9 = new logic.ParkingSpot("", false, true, "");
        logic.Booking booking11 = facultyMember4.bookParkingLot(parkingSpot9, (int) (byte) 1);
        boolean boolean12 = facultyMember4.validateRegistration();
        java.time.ZonedDateTime zonedDateTime13 = null;
        java.time.ZonedDateTime zonedDateTime14 = null;
        logic.BookingSystem bookingSystem17 = null;
        logic.User user22 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str23 = user22.password;
        logic.ParkingSpot parkingSpot27 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean28 = parkingSpot27.isOccupied();
        boolean boolean29 = parkingSpot27.isEnabled();
        logic.Sensor sensor30 = parkingSpot27.getSensor();
        logic.BookingCommand bookingCommand31 = new logic.BookingCommand(bookingSystem17, user22, parkingSpot27);
        logic.Sensor sensor33 = new logic.Sensor((int) ' ');
        sensor33.setCarArrived(true);
        DesignPatternClasses.Observer observer36 = null;
        sensor33.removeObserver(observer36);
        parkingSpot27.setSensor(sensor33);
        logic.User user43 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str44 = user43.password;
        logic.PricingStrategy pricingStrategy45 = null;
        user43.setPricingStrategy(pricingStrategy45);
        logic.Booking booking47 = new logic.Booking(zonedDateTime13, zonedDateTime14, "Valid", false, parkingSpot27, user43);
        logic.Booking booking49 = facultyMember4.bookParkingLot(parkingSpot27, (int) (byte) -1);
        parkingSpot27.setOccupied(false);
        org.junit.Assert.assertNotNull(booking11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNull(sensor30);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "" + "'", str44, "");
        org.junit.Assert.assertNotNull(booking49);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        logic.Student student4 = new logic.Student("ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]", (-1), "ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]", "ParkingSpot [id=, location=, enabled=true, occupied=false]");
        boolean boolean5 = student4.validateRegistration();
        logic.Sensor sensor7 = new logic.Sensor((int) ' ');
        boolean boolean8 = sensor7.isCarArrived();
        java.lang.String str9 = sensor7.getCurrentCarBrand();
        logic.User user14 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        logic.BookingSystem bookingSystem15 = null;
        logic.User user20 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str21 = user20.password;
        logic.ParkingSpot parkingSpot25 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean26 = parkingSpot25.isOccupied();
        boolean boolean27 = parkingSpot25.isEnabled();
        logic.Sensor sensor28 = parkingSpot25.getSensor();
        logic.BookingCommand bookingCommand29 = new logic.BookingCommand(bookingSystem15, user20, parkingSpot25);
        logic.Booking booking30 = new logic.Booking(user14, parkingSpot25);
        sensor7.removeObserver((DesignPatternClasses.Observer) booking30);
        booking30.bookingId = (byte) 10;
        logic.ParkingSpot parkingSpot34 = booking30.getSpot();
        logic.FacultyMember facultyMember39 = new logic.FacultyMember("ParkingSpot [id=, location=, enabled=true, occupied=false]", (int) (byte) 1, "hi!", "");
        logic.ParkingSpot parkingSpot44 = new logic.ParkingSpot("", false, true, "");
        logic.Booking booking46 = facultyMember39.bookParkingLot(parkingSpot44, (int) (byte) 1);
        boolean boolean47 = facultyMember39.validateRegistration();
        java.time.ZonedDateTime zonedDateTime48 = null;
        java.time.ZonedDateTime zonedDateTime49 = null;
        logic.BookingSystem bookingSystem52 = null;
        logic.User user57 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str58 = user57.password;
        logic.ParkingSpot parkingSpot62 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean63 = parkingSpot62.isOccupied();
        boolean boolean64 = parkingSpot62.isEnabled();
        logic.Sensor sensor65 = parkingSpot62.getSensor();
        logic.BookingCommand bookingCommand66 = new logic.BookingCommand(bookingSystem52, user57, parkingSpot62);
        logic.Sensor sensor68 = new logic.Sensor((int) ' ');
        sensor68.setCarArrived(true);
        DesignPatternClasses.Observer observer71 = null;
        sensor68.removeObserver(observer71);
        parkingSpot62.setSensor(sensor68);
        logic.User user78 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str79 = user78.password;
        logic.PricingStrategy pricingStrategy80 = null;
        user78.setPricingStrategy(pricingStrategy80);
        logic.Booking booking82 = new logic.Booking(zonedDateTime48, zonedDateTime49, "Valid", false, parkingSpot62, user78);
        logic.Booking booking84 = facultyMember39.bookParkingLot(parkingSpot62, (int) (byte) -1);
        parkingSpot62.setLocation("adminpass");
        booking30.spot = parkingSpot62;
        logic.Booking booking89 = student4.bookParkingLot(parkingSpot62, (int) (short) -1);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNull(sensor28);
        org.junit.Assert.assertNotNull(parkingSpot34);
        org.junit.Assert.assertNotNull(booking46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNull(sensor65);
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "" + "'", str79, "");
        org.junit.Assert.assertNotNull(booking84);
        org.junit.Assert.assertNotNull(booking89);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        logic.Sensor sensor1 = new logic.Sensor((int) ' ');
        sensor1.setCarArrived(true);
        DesignPatternClasses.Observer observer4 = null;
        sensor1.removeObserver(observer4);
        sensor1.setCarArrived(true);
        java.util.List<DesignPatternClasses.Observer> observerList8 = sensor1.getObservers();
        int int9 = sensor1.getSensorId();
        logic.BookingSystem bookingSystem10 = new logic.BookingSystem();
        logic.SuperManager superManager11 = logic.SuperManager.getInstance();
        superManager11.addParkingLot();
        superManager11.setName("Valid");
        superManager11.requestAccountGeneration();
        superManager11.setName("ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]");
        superManager11.addParkingLot();
        superManager11.monitorParking();
        java.lang.String str20 = superManager11.getEmail();
        logic.User user25 = new logic.User("hi!", (int) 'a', "ParkingSpot [id=, location=, enabled=true, occupied=false]", "Valid");
        superManager11.enableManager(user25);
        logic.ParkingSpot parkingSpot31 = new logic.ParkingSpot("", false, true, "");
        java.lang.String str32 = parkingSpot31.toString();
        logic.Booking booking33 = bookingSystem10.book((logic.User) superManager11, parkingSpot31);
        logic.FacultyMember facultyMember38 = new logic.FacultyMember("ParkingSpot [id=, location=, enabled=true, occupied=false]", (int) (byte) 1, "hi!", "");
        boolean boolean39 = facultyMember38.validateRegistration();
        logic.SuperManager superManager40 = logic.SuperManager.getInstance();
        superManager40.addParkingLot();
        logic.ParkingSpot parkingSpot45 = new logic.ParkingSpot("hi!", false, false);
        java.lang.String str46 = parkingSpot45.toString();
        parkingSpot45.setLocation("Valid");
        superManager40.disableParkingSpot(parkingSpot45);
        java.lang.String str50 = parkingSpot45.toString();
        logic.Booking booking52 = facultyMember38.bookParkingLot(parkingSpot45, (int) (byte) -1);
        int int53 = booking52.bookingId;
        booking52.isValid = true;
        bookingSystem10.cancel(booking52);
        sensor1.addObserver((DesignPatternClasses.Observer) booking52);
        org.junit.Assert.assertNotNull(observerList8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 32 + "'", int9 == 32);
        org.junit.Assert.assertNotNull(superManager11);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "hi!" + "'", str20, "hi!");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "ParkingSpot [id=, location=, enabled=true, occupied=false]" + "'", str32, "ParkingSpot [id=, location=, enabled=true, occupied=false]");
        org.junit.Assert.assertNotNull(booking33);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(superManager40);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]" + "'", str46, "ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]");
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]" + "'", str50, "ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]");
        org.junit.Assert.assertNotNull(booking52);
// flaky "10) test252(RegressionTest0)":         org.junit.Assert.assertTrue("'" + int53 + "' != '" + 56 + "'", int53 == 56);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        logic.SuperManager superManager0 = logic.SuperManager.getInstance();
        boolean boolean2 = superManager0.authenticate((int) (byte) 0);
        java.lang.String str3 = superManager0.getEmail();
        int int4 = superManager0.getSuperMgrID();
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "hi!" + "'", str3, "hi!");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        java.sql.Connection connection0 = null;
        Connections.DatabaseDAO databaseDAO1 = new Connections.DatabaseDAO(connection0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = databaseDAO1.isSensorOn(2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.Connection.prepareStatement(String)\" because \"this.connection\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        DesignPatternClasses.Invoker invoker0 = new DesignPatternClasses.Invoker();
        invoker0.undoLastCommand();
        invoker0.undoLastCommand();
        java.util.List<DesignPatternClasses.Command> commandList3 = invoker0.getCommandHistory();
        org.junit.Assert.assertNotNull(commandList3);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        logic.SuperManager superManager0 = logic.SuperManager.getInstance();
        superManager0.addParkingLot();
        superManager0.setName("Valid");
        superManager0.requestAccountGeneration();
        superManager0.setName("ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]");
        superManager0.addParkingLot();
        java.lang.String str8 = superManager0.getPassword();
        logic.CompositeParkingLot compositeParkingLot10 = new logic.CompositeParkingLot("ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]");
        boolean boolean11 = compositeParkingLot10.isOccupied();
        logic.BookingSystem bookingSystem12 = null;
        logic.User user17 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str18 = user17.password;
        logic.ParkingSpot parkingSpot22 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean23 = parkingSpot22.isOccupied();
        boolean boolean24 = parkingSpot22.isEnabled();
        logic.Sensor sensor25 = parkingSpot22.getSensor();
        logic.BookingCommand bookingCommand26 = new logic.BookingCommand(bookingSystem12, user17, parkingSpot22);
        java.lang.String str27 = parkingSpot22.toString();
        compositeParkingLot10.remove((logic.ParkingComponent) parkingSpot22);
        superManager0.enableParkingSpot(parkingSpot22);
        parkingSpot22.setSpotId("SuperManager [superMgrID=100, name=Valid, email=SuperManager [superMgrID=100, name=ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false], email=ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]]]");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "adminpass" + "'", str8, "adminpass");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNull(sensor25);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]" + "'", str27, "ParkingSpot [id=hi!, location=General Lot, enabled=false, occupied=false]");
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        logic.BookingSystem bookingSystem0 = new logic.BookingSystem();
        logic.User user5 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        logic.BookingSystem bookingSystem6 = null;
        logic.User user11 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str12 = user11.password;
        logic.ParkingSpot parkingSpot16 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean17 = parkingSpot16.isOccupied();
        boolean boolean18 = parkingSpot16.isEnabled();
        logic.Sensor sensor19 = parkingSpot16.getSensor();
        logic.BookingCommand bookingCommand20 = new logic.BookingCommand(bookingSystem6, user11, parkingSpot16);
        logic.Booking booking21 = new logic.Booking(user5, parkingSpot16);
        logic.BookingSystem bookingSystem22 = null;
        logic.User user27 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str28 = user27.password;
        logic.ParkingSpot parkingSpot32 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean33 = parkingSpot32.isOccupied();
        boolean boolean34 = parkingSpot32.isEnabled();
        logic.Sensor sensor35 = parkingSpot32.getSensor();
        logic.BookingCommand bookingCommand36 = new logic.BookingCommand(bookingSystem22, user27, parkingSpot32);
        user27.id = '#';
        java.lang.String str39 = user27.name;
        user27.setId(10);
        booking21.user = user27;
        logic.ParkingSpot parkingSpot43 = booking21.getSpot();
        java.time.ZonedDateTime zonedDateTime44 = booking21.getBookingEndTime();
        logic.CancellingBookingCommand cancellingBookingCommand45 = new logic.CancellingBookingCommand(bookingSystem0, booking21);
        logic.User user50 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        logic.BookingSystem bookingSystem51 = null;
        logic.User user56 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str57 = user56.password;
        logic.ParkingSpot parkingSpot61 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean62 = parkingSpot61.isOccupied();
        boolean boolean63 = parkingSpot61.isEnabled();
        logic.Sensor sensor64 = parkingSpot61.getSensor();
        logic.BookingCommand bookingCommand65 = new logic.BookingCommand(bookingSystem51, user56, parkingSpot61);
        logic.Booking booking66 = new logic.Booking(user50, parkingSpot61);
        booking21.user = user50;
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNull(sensor19);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNull(sensor35);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "hi!" + "'", str39, "hi!");
        org.junit.Assert.assertNotNull(parkingSpot43);
        org.junit.Assert.assertNull(zonedDateTime44);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "" + "'", str57, "");
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNull(sensor64);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        logic.ValidState validState1 = new logic.ValidState(100);
        java.time.LocalDateTime localDateTime2 = validState1.getExpirationTime();
        logic.ExtendedState extendedState4 = new logic.ExtendedState(localDateTime2, (int) (byte) 0);
        java.lang.String str5 = extendedState4.getStateName();
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Extended" + "'", str5, "Extended");
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        logic.User user4 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        logic.BookingSystem bookingSystem5 = null;
        logic.User user10 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str11 = user10.password;
        logic.ParkingSpot parkingSpot15 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean16 = parkingSpot15.isOccupied();
        boolean boolean17 = parkingSpot15.isEnabled();
        logic.Sensor sensor18 = parkingSpot15.getSensor();
        logic.BookingCommand bookingCommand19 = new logic.BookingCommand(bookingSystem5, user10, parkingSpot15);
        logic.Booking booking20 = new logic.Booking(user4, parkingSpot15);
        logic.BookingSystem bookingSystem21 = null;
        logic.User user26 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str27 = user26.password;
        logic.ParkingSpot parkingSpot31 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean32 = parkingSpot31.isOccupied();
        boolean boolean33 = parkingSpot31.isEnabled();
        logic.Sensor sensor34 = parkingSpot31.getSensor();
        logic.BookingCommand bookingCommand35 = new logic.BookingCommand(bookingSystem21, user26, parkingSpot31);
        user26.id = '#';
        java.lang.String str38 = user26.name;
        user26.setId(10);
        booking20.user = user26;
        boolean boolean42 = booking20.isShowUp();
        logic.ParkingSpot parkingSpot43 = booking20.getSpot();
        boolean boolean44 = booking20.isShowUp();
        int int45 = booking20.getBookingId();
        booking20.setValid(false);
        // The following exception was thrown during execution in test generation
        try {
            booking20.update();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"logic.Sensor.isSensorOn()\" because \"sensor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(sensor18);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(sensor34);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(parkingSpot43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        logic.SuperManager superManager0 = logic.SuperManager.getInstance();
        superManager0.addParkingLot();
        superManager0.setName("Valid");
        superManager0.requestAccountGeneration();
        superManager0.setName("ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]");
        superManager0.addParkingLot();
        superManager0.monitorParking();
        java.lang.String str9 = superManager0.getEmail();
        logic.User user14 = new logic.User("hi!", (int) 'a', "ParkingSpot [id=, location=, enabled=true, occupied=false]", "Valid");
        superManager0.enableManager(user14);
        java.lang.String str16 = superManager0.toString();
        logic.ParkingLot parkingLot18 = new logic.ParkingLot("General Lot");
        superManager0.enableParkingLot(parkingLot18);
        parkingLot18.setId("SuperManager [superMgrID=100, name=Valid, email=ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]]");
        parkingLot18.disableSpot("Valid");
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hi!" + "'", str9, "hi!");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "SuperManager [superMgrID=100, name=ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false], email=hi!]" + "'", str16, "SuperManager [superMgrID=100, name=ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false], email=hi!]");
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        logic.GeneralManager generalManager4 = new logic.GeneralManager("SuperManager [superMgrID=100, name=ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false], email=ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]]", (int) (byte) 0, "ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]", "ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]");
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        logic.Sensor sensor1 = new logic.Sensor((int) ' ');
        boolean boolean2 = sensor1.isCarArrived();
        java.lang.String str3 = sensor1.getCurrentCarBrand();
        java.time.ZonedDateTime zonedDateTime4 = null;
        sensor1.activateSensor(zonedDateTime4);
        sensor1.setCurrentCarPlate("SuperManager [superMgrID=100, name=Valid, email=ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]]");
        logic.User user12 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        logic.BookingSystem bookingSystem13 = null;
        logic.User user18 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str19 = user18.password;
        logic.ParkingSpot parkingSpot23 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean24 = parkingSpot23.isOccupied();
        boolean boolean25 = parkingSpot23.isEnabled();
        logic.Sensor sensor26 = parkingSpot23.getSensor();
        logic.BookingCommand bookingCommand27 = new logic.BookingCommand(bookingSystem13, user18, parkingSpot23);
        logic.Booking booking28 = new logic.Booking(user12, parkingSpot23);
        logic.BookingSystem bookingSystem29 = null;
        logic.User user34 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str35 = user34.password;
        logic.ParkingSpot parkingSpot39 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean40 = parkingSpot39.isOccupied();
        boolean boolean41 = parkingSpot39.isEnabled();
        logic.Sensor sensor42 = parkingSpot39.getSensor();
        logic.BookingCommand bookingCommand43 = new logic.BookingCommand(bookingSystem29, user34, parkingSpot39);
        user34.id = '#';
        java.lang.String str46 = user34.name;
        user34.setId(10);
        booking28.user = user34;
        boolean boolean50 = booking28.isShowUp();
        booking28.userId = (byte) -1;
        sensor1.addObserver((DesignPatternClasses.Observer) booking28);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNull(sensor26);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNull(sensor42);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "hi!" + "'", str46, "hi!");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        logic.SuperManager superManager0 = logic.SuperManager.getInstance();
        boolean boolean2 = superManager0.authenticate((int) (byte) 0);
        java.lang.String str3 = superManager0.toString();
        logic.User user8 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        logic.BookingSystem bookingSystem9 = null;
        logic.User user14 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str15 = user14.password;
        logic.ParkingSpot parkingSpot19 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean20 = parkingSpot19.isOccupied();
        boolean boolean21 = parkingSpot19.isEnabled();
        logic.Sensor sensor22 = parkingSpot19.getSensor();
        logic.BookingCommand bookingCommand23 = new logic.BookingCommand(bookingSystem9, user14, parkingSpot19);
        logic.Booking booking24 = new logic.Booking(user8, parkingSpot19);
        boolean boolean25 = parkingSpot19.isOccupied();
        parkingSpot19.showDetails();
        // The following exception was thrown during execution in test generation
        try {
            logic.ParkingBooking parkingBooking28 = new logic.ParkingBooking((logic.User) superManager0, parkingSpot19, 28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"logic.Sensor.getSensorId()\" because \"this.sensor\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(superManager0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "SuperManager [superMgrID=100, name=ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false], email=hi!]" + "'", str3, "SuperManager [superMgrID=100, name=ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false], email=hi!]");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(sensor22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        logic.ParkingSpot parkingSpot5 = new logic.ParkingSpot("ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]", true, false, "General Lot", (int) (byte) 10);
        logic.Sensor sensor7 = new logic.Sensor((int) ' ');
        sensor7.setCarArrived(true);
        java.time.ZonedDateTime zonedDateTime10 = null;
        sensor7.activateSensor(zonedDateTime10);
        sensor7.setSensorOn(false);
        java.lang.String str14 = sensor7.getCurrentCarColor();
        parkingSpot5.setSensor(sensor7);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        logic.ParkingManager parkingManager0 = new logic.ParkingManager();
        boolean boolean2 = parkingManager0.addSpot("ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]");
        logic.DisableParkingSpotCommand disableParkingSpotCommand4 = new logic.DisableParkingSpotCommand(parkingManager0, "ParkingSpot [id=, location=, enabled=true, occupied=false]");
        boolean boolean6 = parkingManager0.enableSpot("SuperManager [superMgrID=100, name=ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false], email=ParkingSpot [id=hi!, location=Valid, enabled=false, occupied=false]]");
        boolean boolean8 = parkingManager0.spotExists("General Lot");
        logic.AddParkingSpotCommand addParkingSpotCommand10 = new logic.AddParkingSpotCommand(parkingManager0, "");
        logic.DisableParkingSpotCommand disableParkingSpotCommand12 = new logic.DisableParkingSpotCommand(parkingManager0, "ParkingSpot [id=, location=, enabled=true, occupied=false]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        java.sql.Connection connection0 = null;
        Connections.DatabaseDAO databaseDAO1 = new Connections.DatabaseDAO(connection0);
        logic.FacultyMember facultyMember6 = new logic.FacultyMember("ParkingSpot [id=, location=, enabled=true, occupied=false]", (int) (byte) 1, "hi!", "");
        logic.ParkingSpot parkingSpot11 = new logic.ParkingSpot("", false, true, "");
        logic.Booking booking13 = facultyMember6.bookParkingLot(parkingSpot11, (int) (byte) 1);
        boolean boolean14 = facultyMember6.validateRegistration();
        // The following exception was thrown during execution in test generation
        try {
            databaseDAO1.addFacultyMember(facultyMember6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Cannot invoke \"java.sql.Connection.prepareStatement(String)\" because \"this.connection\" is null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(booking13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        logic.User user4 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        logic.BookingSystem bookingSystem5 = null;
        logic.User user10 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str11 = user10.password;
        logic.ParkingSpot parkingSpot15 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean16 = parkingSpot15.isOccupied();
        boolean boolean17 = parkingSpot15.isEnabled();
        logic.Sensor sensor18 = parkingSpot15.getSensor();
        logic.BookingCommand bookingCommand19 = new logic.BookingCommand(bookingSystem5, user10, parkingSpot15);
        logic.Booking booking20 = new logic.Booking(user4, parkingSpot15);
        boolean boolean21 = parkingSpot15.isOccupied();
        logic.Sensor sensor23 = new logic.Sensor((int) ' ');
        sensor23.setCarArrived(true);
        DesignPatternClasses.Observer observer26 = null;
        sensor23.removeObserver(observer26);
        java.time.ZonedDateTime zonedDateTime28 = sensor23.getSensorActivationTime();
        parkingSpot15.setSensor(sensor23);
        logic.Sensor sensor31 = new logic.Sensor((int) ' ');
        sensor31.setCarArrived(true);
        DesignPatternClasses.Observer observer34 = null;
        sensor31.removeObserver(observer34);
        int int36 = sensor31.getSensorId();
        sensor31.setCarArrived(true);
        parkingSpot15.setSensor(sensor31);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(sensor18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNull(zonedDateTime28);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 32 + "'", int36 == 32);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        logic.User user4 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        logic.BookingSystem bookingSystem5 = null;
        logic.User user10 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str11 = user10.password;
        logic.ParkingSpot parkingSpot15 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean16 = parkingSpot15.isOccupied();
        boolean boolean17 = parkingSpot15.isEnabled();
        logic.Sensor sensor18 = parkingSpot15.getSensor();
        logic.BookingCommand bookingCommand19 = new logic.BookingCommand(bookingSystem5, user10, parkingSpot15);
        logic.Booking booking20 = new logic.Booking(user4, parkingSpot15);
        logic.BookingSystem bookingSystem21 = null;
        logic.User user26 = new logic.User("hi!", (int) (byte) 0, "hi!", "");
        java.lang.String str27 = user26.password;
        logic.ParkingSpot parkingSpot31 = new logic.ParkingSpot("hi!", false, false);
        boolean boolean32 = parkingSpot31.isOccupied();
        boolean boolean33 = parkingSpot31.isEnabled();
        logic.Sensor sensor34 = parkingSpot31.getSensor();
        logic.BookingCommand bookingCommand35 = new logic.BookingCommand(bookingSystem21, user26, parkingSpot31);
        user26.id = '#';
        java.lang.String str38 = user26.name;
        user26.setId(10);
        booking20.user = user26;
        logic.ParkingSpot parkingSpot42 = booking20.getSpot();
        boolean boolean43 = booking20.isShowUp();
        java.time.ZonedDateTime zonedDateTime44 = booking20.getBookingStartTime();
        boolean boolean45 = booking20.isShowUp();
        logic.User user46 = booking20.user;
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull(sensor18);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNull(sensor34);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "hi!" + "'", str38, "hi!");
        org.junit.Assert.assertNotNull(parkingSpot42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNull(zonedDateTime44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(user46);
    }
}
