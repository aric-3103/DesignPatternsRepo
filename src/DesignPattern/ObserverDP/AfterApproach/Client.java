package DesignPattern.ObserverDP.AfterApproach;



public class Client {

    public static void main(String[] args) {
        Flipkart flipkart = new Flipkart();
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator(flipkart);
        EmailService emailService = new EmailService(flipkart);
        SMSService smsService = new SMSService(flipkart);
        InventoryManagementSystem inventoryManagementSystem = new InventoryManagementSystem(flipkart);

    }
}
