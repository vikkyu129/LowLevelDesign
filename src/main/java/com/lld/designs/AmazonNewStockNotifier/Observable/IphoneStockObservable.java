package com.lld.designs.AmazonNewStockNotifier.Observable;

import com.lld.designs.AmazonNewStockNotifier.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneStockObservable implements StockObservable {
    private int stockCount;
    private List<NotificationAlertObserver> notificationAlertObserverList = new ArrayList<NotificationAlertObserver>();

    @Override
    public void addSubscriber(NotificationAlertObserver notificationAlertObserver) {
        this.notificationAlertObserverList.add(notificationAlertObserver);
    }

    @Override
    public void deleteSubscriber(NotificationAlertObserver notificationAlertObserver) {
        this.notificationAlertObserverList.remove(notificationAlertObserver);
    }

    @Override
    public void notifySubscribers() {
        for(var notificationAlertSubscriber: notificationAlertObserverList){
            notificationAlertSubscriber.update();
        }
    }

    @Override
    public void setStockCount(int stockCount) {
        this.stockCount = stockCount;
        this.notifySubscribers();
    }

    @Override
    public int getStockCount() {
        return this.stockCount;
    }
}
