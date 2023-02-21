package com.lld.designPatterns.AbstractFactoryPattern;

public class NormalCarFactory implements FactoryInterface{
    public Car getCar(String name){
        switch (name){
            case "normal1":
                return new NormalCar1();
            case "normal2":
                return new NormalCar2();
            default:
                return null;
        }

    }
}
