package DesignPattern.ObserverDP.BeforeApproach;

public class Flipkart {

    private EmailService emailService;
    private SMSService smsService;
    private InvoiceGenerator invoiceGenerator;
    private InventoryManagementSystem inventoryManagementSystem;


    public Flipkart(EmailService emailService,
                    SMSService smsService,
                    InvoiceGenerator invoiceGenerator,
                    InventoryManagementSystem inventoryManagementSystem) {
        this.emailService = emailService;
        this.smsService = smsService;
        this.invoiceGenerator = invoiceGenerator;
        this.inventoryManagementSystem = inventoryManagementSystem;
    }

    void orderPlaced(Order order) {
        emailService.sendEmail(order.getEmailId());
        smsService.sendSms(order.getMobile(), "your order is placed");
        invoiceGenerator.generateBill(order.getOrderId());
        inventoryManagementSystem.update(order.getProductId());
    }


}
