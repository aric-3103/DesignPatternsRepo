package DesignPattern.DecoratorDP;

public class PizzaDecoratorMain {

    public static void main(String[] args) {
        BasePizza farmHousePizza = new FarmhousePizza();
        farmHousePizza.cost();
        System.out.println("***************");

        BasePizza extraCheese = new MushroomToppingAdd(new ExtraCheesePizza(new FarmhousePizza()));
        extraCheese.cost();

    }
}
