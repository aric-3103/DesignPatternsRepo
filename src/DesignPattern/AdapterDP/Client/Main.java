package DesignPattern.AdapterDP.Client;

import DesignPattern.AdapterDP.ExistingAdaptee.WeightMachineForBabies;
import DesignPattern.AdapterDP.AdapterBridge.WeightMachineAdapter;
import DesignPattern.AdapterDP.AdapterBridge.WeightMachineAdapterImpl;

public class Main {
    public static void main(String[] args) {
        WeightMachineAdapter machineAdapter = new WeightMachineAdapterImpl(new WeightMachineForBabies());
        System.out.println(machineAdapter.getWeightInKg());
    }
}
