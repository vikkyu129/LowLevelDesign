package com.lld.designPatterns.FactoryPattern;

public class ShapeLauncher {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape = shapeFactory.getShape("Circle");
        shape.draw();
    }
}
