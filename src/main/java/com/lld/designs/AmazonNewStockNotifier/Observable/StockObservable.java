package com.lld.designs.AmazonNewStockNotifier.Observable;

import com.lld.designs.AmazonNewStockNotifier.Observer.NotificationAlertObserver;

public interface StockObservable {
    public void addSubscriber(NotificationAlertObserver notificationAlertObserver);
    public void deleteSubscriber(NotificationAlertObserver notificationAlertObserver);
    public void notifySubscribers();
    public void setStockCount(int newStockCount);
    public int getStockCount();
}
