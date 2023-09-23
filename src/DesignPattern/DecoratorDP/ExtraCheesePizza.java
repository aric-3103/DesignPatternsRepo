package DesignPattern.DecoratorDP;

public class ExtraCheesePizza extends ToppingDecorator {

    BasePizza basePizza;

    public ExtraCheesePizza(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return this.basePizza.cost() + 10;

    }
}
