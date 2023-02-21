package com.lld.designs.AmazonNewStockNotifier.Observer;

import com.lld.designs.AmazonNewStockNotifier.Observable.StockObservable;

public class EmailAlertObserver implements NotificationAlertObserver {
    private StockObservable stockObservable;

    public EmailAlertObserver(StockObservable stockObservable) {
        System.out.println("EmailAlertObserver Subscribed");
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        System.out.println("Email Alert: Stock Count: " + this.stockObservable.getStockCount());
    }
}
