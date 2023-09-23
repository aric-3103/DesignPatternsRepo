package DesignPattern.ObserverDP.Observable;

import DesignPattern.ObserverDP.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StocksObservable {

    List<NotificationAlertObserver> observerList = new ArrayList<>();
    int stockCount = 0;

    @Override
    public void add(NotificationAlertObserver observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        observerList.remove(observer);
    }

    @Override
    public void notifyUsers() {
         for(NotificationAlertObserver alertObserver : observerList){
             alertObserver.update();
         }
    }

    @Override
    public void setStockCount(int newStockAdded) {
       if(stockCount == 0) {
           notifyUsers();
       }
       stockCount = stockCount + newStockAdded;
    }

    @Override
    public int getCount() {
        return stockCount;
    }
}
