package DesignPattern.DecoratorDP;

public class MushroomToppingAdd extends ToppingDecorator{

    BasePizza basePizza;

    public MushroomToppingAdd(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    int cost() {
        return this.basePizza.cost() + 30;
    }
}
