package Vehicle;

import DriveFunctionality.DriveFunctionality;

public class Vehicle {
    DriveFunctionality driveObject;

    Vehicle(DriveFunctionality driveObject){
        this.driveObject = driveObject;
    }

    public void drive(){
        driveObject.drive();
    }
}
