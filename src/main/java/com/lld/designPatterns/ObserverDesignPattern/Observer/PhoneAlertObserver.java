package com.lld.designPatterns.ObserverDesignPattern.Observer;

import com.lld.designPatterns.ObserverDesignPattern.Observable.StockObservable;

public class PhoneAlertObserver implements NotificationAlertObserver{
    private StockObservable stockObservable;

    public PhoneAlertObserver(StockObservable stockObservable) {
        System.out.println("PhoneAlertObserver Subscribed");
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        System.out.println("Phone Alert: Stock Count: " + this.stockObservable.getStockCount());
    }
}
