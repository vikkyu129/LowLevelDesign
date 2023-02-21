package com.lld.designPatterns.DecoratorDesignPattern;

public class OrderPizza {

    public static void main(String[] args) {
        var pizza = new ExtraMushroom(new ChickenTikka());
        System.out.println("Total Cost: " + pizza.cost());
    }

}
