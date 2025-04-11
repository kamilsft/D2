@echo off
echo Generating Randoop tests for all relevant classes in the logic, design pattern, and connections packages...

java -classpath "C:\Users\dursa\IdeaProjects\D2\D2\csv-example\CSV-example\src\main\Randoop\randoop-all-4.3.3.jar;C:\Users\dursa\IdeaProjects\D2\D2\csv-example\CSV-example\target\classes" randoop.main.Main gentests ^
--testclass=logic.AddParkingSpotCommand ^
--testclass=logic.Booking ^
--testclass=logic.BookingCommand ^
--testclass=logic.BookingSystem ^
--testclass=logic.CancellingBookingCommand ^
--testclass=logic.CompositeParkingLot ^
--testclass=logic.CreditCardPaymentStrategy ^
--testclass=logic.DebitCardPaymentsStrategy ^
--testclass=logic.DisableParkingSpotCommand ^
--testclass=logic.DisableSensorCommand ^
--testclass=logic.EnableParkingSpotCommand ^
--testclass=logic.EnableSensorCommand ^
--testclass=logic.ExtendedState ^
--testclass=logic.FacultyMember ^
--testclass=logic.FacultyPricing ^
--testclass=logic.GeneralManager ^
--testclass=logic.MaintainUser ^
--testclass=logic.Manager ^
--testclass=logic.MobileAppPaymentsStrategy ^
--testclass=logic.NonFacultyPricing ^
--testclass=logic.NonFacultyStaff ^
--testclass=logic.ParkingBooking ^
--testclass=logic.ParkingLot ^
--testclass=logic.ParkingManager ^
--testclass=logic.ParkingSpot ^
--testclass=logic.Sensor ^
--testclass=logic.Student ^
--testclass=logic.StudentPricing ^
--testclass=logic.SuperManager ^
--testclass=logic.User ^
--testclass=logic.UserFactory ^
--testclass=logic.ValidState ^
--testclass=logic.Visitor ^
--testclass=logic.VisitorPricing ^
--testclass=Connections.DatabaseConnection ^
--testclass=Connections.DatabaseDAO ^
--testclass=DesignPatternClasses.Invoker ^
--testclass=DesignPatternClasses.Subject ^
--testclass=DesignPatternClasses.Observer ^
--testclass=DesignPatternClasses.Command ^
--output-limit=500 ^
--time-limit=60 ^
--junit-output-dir=C:\Users\dursa\IdeaProjects\D2\D2\csv-example\CSV-example\src\test\RandoopTests ^
--regression-test-basename=RegressionTest

echo Test generation complete! Tests have been saved to C:\Users\dursa\IdeaProjects\D2\D2\csv-example\CSV-example\src\test\RandoopTests
pause
