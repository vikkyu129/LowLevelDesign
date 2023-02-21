package com.lld.designPatterns.StrategyDesignPattern.withoutStrategy;

public class GoodsVehicle extends Vehicle{
    @Override
    public void drive() {
        System.out.println("Special Drive");
    }
}
