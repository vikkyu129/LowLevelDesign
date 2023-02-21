package com.lld.designs.AmazonNewStockNotifier;

import com.lld.designs.AmazonNewStockNotifier.Observable.IphoneStockObservable;
import com.lld.designs.AmazonNewStockNotifier.Observer.EmailAlertObserver;
import com.lld.designs.AmazonNewStockNotifier.Observer.PhoneAlertObserver;

public class AmazonLauncher {
    public static void main(String[] args) {
        var IphoneItem = new IphoneStockObservable();
        var emailSub1 = new EmailAlertObserver(IphoneItem);
        var emailSub2 = new EmailAlertObserver(IphoneItem);
        var phoneSub1 = new PhoneAlertObserver(IphoneItem);
        IphoneItem.addSubscriber(emailSub1);
        IphoneItem.addSubscriber(emailSub2);
        IphoneItem.addSubscriber(phoneSub1);
        IphoneItem.setStockCount(10);
        IphoneItem.setStockCount(10);
    }
}
