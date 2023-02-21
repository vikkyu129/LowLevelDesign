package com.lld.designPatterns.AbstractFactoryPattern;

public class CarFactory {
    FactoryInterface  getCar(String name){
        switch (name){
            case "normal":
                return new NormalCarFactory();
            case "luxury":
                return new LuxuryCarFactory();
            default:
                return null;
        }

    }
}
