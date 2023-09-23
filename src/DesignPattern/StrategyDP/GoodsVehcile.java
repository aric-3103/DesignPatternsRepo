package DesignPattern.StrategyDP;

public class GoodsVehcile extends Vehicle{

    GoodsVehcile() {
        super(new NormalDriveStrategy());
    }
}
