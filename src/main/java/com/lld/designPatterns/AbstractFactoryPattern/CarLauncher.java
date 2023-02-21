package com.lld.designPatterns.AbstractFactoryPattern;

public class CarLauncher {
    public static void main(String[] args) {
        var Factory = new CarFactory();
        var luxuryFactory = Factory.getCar("luxury");
        var luxuryCar1 = luxuryFactory.getCar("luxury1");
        System.out.println(luxuryCar1.cost());
    }
}
