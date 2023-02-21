package com.lld.designPatterns.ObserverDesignPattern.Observable;

import com.lld.designPatterns.ObserverDesignPattern.Observer.NotificationAlertObserver;

public interface StockObservable {
    public void addSubscriber(NotificationAlertObserver notificationAlertObserver);
    public void deleteSubscriber(NotificationAlertObserver notificationAlertObserver);
    public void notifySubscribers();
    public void setStockCount(int newStockCount);
    public int getStockCount();
}
