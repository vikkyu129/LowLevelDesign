package com.lld.designPatterns.AbstractFactoryPattern;

public class LuxuryCarFactory implements FactoryInterface{
    public Car getCar(String name){
        switch (name){
            case "luxury1":
                return new LuxuryCar1();
            case "luxury2":
                return new LuxuryCar2();
            default:
                return null;
        }

    }
}
