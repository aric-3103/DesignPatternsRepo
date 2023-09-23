package DesignPattern.ObserverDP.Observable;

import DesignPattern.ObserverDP.Observer.NotificationAlertObserver;

public interface StocksObservable {

    public void add(NotificationAlertObserver observer);
    public void remove(NotificationAlertObserver observer);
    public void notifyUsers();
    public void setStockCount(int newStockAdded);
    public int getCount();
}
