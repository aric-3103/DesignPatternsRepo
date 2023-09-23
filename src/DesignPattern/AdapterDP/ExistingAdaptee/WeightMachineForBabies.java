package DesignPattern.AdapterDP.ExistingAdaptee;

public class WeightMachineForBabies implements WeightMachine {
    @Override
    public double getWeightInPounds() {
        return 25;
    }
}
