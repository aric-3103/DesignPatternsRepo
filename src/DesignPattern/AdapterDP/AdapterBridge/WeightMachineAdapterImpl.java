package DesignPattern.AdapterDP.AdapterBridge;

import DesignPattern.AdapterDP.ExistingAdaptee.WeightMachine;

public class WeightMachineAdapterImpl implements WeightMachineAdapter {

    WeightMachine weightMachine;

    public WeightMachineAdapterImpl(WeightMachine weightMachine) {
        this.weightMachine = weightMachine;
    }

    @Override
    public double getWeightInKg() {
        double weightInPound = weightMachine.getWeightInPounds();

        //Convert into KG
        double weightInKg = weightInPound * .45;
        return weightInKg;
    }
}
