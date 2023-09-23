package DesignPattern.ObserverDP.Store;

import DesignPattern.ObserverDP.Observable.IphoneObservableImpl;
import DesignPattern.ObserverDP.Observable.StocksObservable;
import DesignPattern.ObserverDP.Observer.EmailNotificationImpl;
import DesignPattern.ObserverDP.Observer.MobileNotificationImpl;
import DesignPattern.ObserverDP.Observer.NotificationAlertObserver;

public class Main {
    public static void main(String[] args) {
        StocksObservable iPhoneStockObservable = new IphoneObservableImpl();

        NotificationAlertObserver observer1 = new EmailNotificationImpl("arpitshukla0331@gmail.com", iPhoneStockObservable);
        NotificationAlertObserver observer2 = new EmailNotificationImpl("xyz@gmail.com", iPhoneStockObservable);
        NotificationAlertObserver observer3 = new MobileNotificationImpl("qwe_mobileUser", iPhoneStockObservable);

        iPhoneStockObservable.add(observer1);
        iPhoneStockObservable.add(observer2);
        iPhoneStockObservable.add(observer3);

        iPhoneStockObservable.setStockCount(10);

    }
}
