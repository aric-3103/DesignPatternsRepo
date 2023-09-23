package DesignPattern.ObserverDP.AfterApproach;

public class InvoiceGenerator implements OrderPlacedSubscriber{

    public InvoiceGenerator(Flipkart flipkart) {
     flipkart.addSubscriber(this);
    }

    void generateBill(Long orderId) {
        System.out.println("generating invoice bill : " + orderId);
    }

    @Override
    public void onOrderPlaced(Order order) {
        generateBill(order.getOrderId());
    }
}
