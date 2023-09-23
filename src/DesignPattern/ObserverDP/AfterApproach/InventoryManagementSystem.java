package DesignPattern.ObserverDP.AfterApproach;

public class InventoryManagementSystem implements OrderPlacedSubscriber{

    public InventoryManagementSystem(Flipkart flipkart) {
       flipkart.addSubscriber(this);
    }

    void update(Long productId) {
        System.out.println("InventoryManagementSystem: Order is placed. Updating inventory");
    }

    @Override
    public void onOrderPlaced(Order order) {
      update(order.getProductId());
    }
}
