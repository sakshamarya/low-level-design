public class Main {
    public static void main(String[] args) {
        Vehicle sportyVehicle = new SportyVehicle();
        Vehicle offroadVehicle = new OffroadVehicle();
        Vehicle passengerVehicle = new PassengerVehicle();

        sportyVehicle.drive();
        offroadVehicle.drive();
        passengerVehicle.drive();
    }
}