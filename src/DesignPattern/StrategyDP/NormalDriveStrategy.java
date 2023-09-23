package DesignPattern.StrategyDP;

public class NormalDriveStrategy implements DriveStrategy{

    @Override
    public void drive() {
        System.out.println("Normal drive approach");
    }
}
