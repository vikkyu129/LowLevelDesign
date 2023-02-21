package com.lld.designPatterns.StrategyDesignPattern.withStrategy;

public class VehicleLauncher {
    public static void main(String[] args) {
        var sportsVehicle = new SportsVehicle();
        sportsVehicle.drive();
    }
}
