package Vehicle;

import DriveFunctionality.SpecialDrive;

public class SportyVehicle extends Vehicle{
    public SportyVehicle(){
        super(new SpecialDrive());
    }
}
