package DesignPattern.ObserverDP.AfterApproach;

public class SMSService implements OrderPlacedSubscriber {

    public SMSService(Flipkart flipkart) {
        flipkart.addSubscriber(this);
    }

    void sendSms(String to, String body) {
        System.out.println("Sending sms to " + to + " " + body);

    }

    @Override
    public void onOrderPlaced(Order order) {
        sendSms(order.getMobile(), "Order placed");
    }
}
