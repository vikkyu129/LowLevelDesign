package com.lld.designPatterns.StrategyDesignPattern.withStrategy;

import com.lld.designPatterns.StrategyDesignPattern.withStrategy.Strategy.DriveStrategy;

public class Vehicle {
    private DriveStrategy driveStrategy;

    public Vehicle(DriveStrategy driveStrategy) {
        this.driveStrategy = driveStrategy;
    }

    public void drive(){
        this.driveStrategy.drive();
    }

}
