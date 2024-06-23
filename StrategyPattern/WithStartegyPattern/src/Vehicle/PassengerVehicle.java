package Vehicle;

import DriveFunctionality.NormalDrive;

public class PassengerVehicle extends Vehicle{
    public PassengerVehicle(){
        super(new NormalDrive());
    }
}
