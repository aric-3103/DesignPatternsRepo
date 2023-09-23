package DesignPattern.FactoryDP;

public class FactoryMain {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        Shape shapeObj = factory.getShape("Circle");
        shapeObj.draw();

    }
}
