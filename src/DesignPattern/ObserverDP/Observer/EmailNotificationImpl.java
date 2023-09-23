package DesignPattern.ObserverDP.Observer;

import DesignPattern.ObserverDP.Observable.StocksObservable;

public class EmailNotificationImpl implements NotificationAlertObserver {

    String emailId;
    StocksObservable stocksObservable;

    //Constructor Injection
    public EmailNotificationImpl(String emailId, StocksObservable stocksObservable) {
        this.stocksObservable = stocksObservable;
        this.emailId = emailId;
    }

    @Override
    public void update() {
        sendEmail(emailId, "product is in stock hurry up!!");

    }

    public void sendEmail(String emailId, String msg) {
        System.out.println("mail sent to : " + emailId);
    }
}
