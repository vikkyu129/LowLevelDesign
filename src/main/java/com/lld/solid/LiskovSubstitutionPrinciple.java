package com.lld.solid;
// If class B is a subtype of Class A, then we should be able to replace object A with B without breaking the behaviour of the program
// Subclass should extend the capability of Parent Class not narrow it down

class Bike{
    public void turnOnEngine(){

    }

    public void accelerate(){

    }
}

class Motorcycle extends Bike{
    private boolean engineOn;
    private int speed;

    @Override
    public void turnOnEngine() {
        engineOn = true;
    }

    @Override
    public void accelerate() {
        speed += 10;
    }
}

// here bicycle is changing the behaviour of the parent class, hence braking the behaviour when the parent object
// is replaced with the subclass object
class Bicycle extends Bike{
    @Override
    public void turnOnEngine() {
        throw new AssertionError("Bicyle has no engine");
    }

    @Override
    public void accelerate() {

    }
}

public class LiskovSubstitutionPrinciple {

}
