package com.lld.designPatterns.StrategyDesignPattern.withStrategy;

import com.lld.designPatterns.StrategyDesignPattern.withStrategy.Strategy.SpecialDriveStrategy;

public class SportsVehicle extends Vehicle {

    public SportsVehicle() {
        super(new SpecialDriveStrategy());
    }
}
