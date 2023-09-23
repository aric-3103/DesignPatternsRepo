package DesignPattern.StrategyDP;

public class Vehicle {

    DriveStrategy driveObject;

    //This is known as Constructor Injection
    Vehicle(DriveStrategy ob) {
        this.driveObject = ob;
    }

    public void drive() {
        driveObject.drive();
    }
}
