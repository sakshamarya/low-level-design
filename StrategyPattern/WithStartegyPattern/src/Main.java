import Vehicle.PassengerVehicle;
import Vehicle.SportyVehicle;
import Vehicle.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle sportyVehicle = new SportyVehicle();
        Vehicle passengerVehicle = new PassengerVehicle();

        sportyVehicle.drive();
        passengerVehicle.drive();
    }
}