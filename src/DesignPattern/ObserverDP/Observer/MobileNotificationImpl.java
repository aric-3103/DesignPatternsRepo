package DesignPattern.ObserverDP.Observer;

import DesignPattern.ObserverDP.Observable.StocksObservable;

public class MobileNotificationImpl implements NotificationAlertObserver{

     String mobileUser;
     StocksObservable stocksObservable;

    public MobileNotificationImpl(String mobileUser, StocksObservable stocksObservable) {
        this.mobileUser = mobileUser;
        this.stocksObservable = stocksObservable;
    }

    @Override
    public void update() {
        sendMessageOnMobile(mobileUser, "product is in stock, hurry up!!");
    }

    public void sendMessageOnMobile(String mobileUser, String msg) {
        System.out.println("message sent to mobile : " + mobileUser);
    }
}
