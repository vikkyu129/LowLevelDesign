package com.lld.designPatterns.StrategyDesignPattern.withStrategy;

import com.lld.designPatterns.StrategyDesignPattern.withStrategy.Strategy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle{
    public PassengerVehicle() {
        super(new NormalDriveStrategy());
    }
}
