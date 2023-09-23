package DesignPattern.ObserverDP.BeforeApproach;

public class InvoiceGenerator {

    void generateBill(Long orderId) {
        System.out.println("generating invoice bill : " + orderId);
    }
}
