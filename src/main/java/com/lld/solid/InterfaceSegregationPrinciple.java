package com.lld.solid;

// Interfaces should be such that the Client should not implement unnecessary functions they do not need
interface RestaurantEmployee{
    public void washDishes();
    public void serveCustomers();
    public void cookFood();
}

class Waiter1 implements RestaurantEmployee{
    @Override
    public void washDishes() {
        // not his job, no need to implement
    }

    @Override
    public void serveCustomers() {

    }

    @Override
    public void cookFood() {
        // not his job
    }
}

// Solution: Segregate the interfaces so the respective methods can be implemented, No need to implement unnecessary functions
interface WaiterInterface{
    public void takeOrders();
    public void serveCustomers();
}

interface ChefInterface{
    public void cookFood();
    public void decideMenu();
}

class Waiter implements WaiterInterface{
    @Override
    public void takeOrders() {

    }

    @Override
    public void serveCustomers() {

    }
}

class Chef implements ChefInterface{
    @Override
    public void cookFood() {

    }

    @Override
    public void decideMenu() {

    }
}


public class InterfaceSegregationPrinciple {

}
