package com.lld.designs.AmazonNewStockNotifier.Observer;

import com.lld.designs.AmazonNewStockNotifier.Observable.StockObservable;

public class PhoneAlertObserver implements NotificationAlertObserver {
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
