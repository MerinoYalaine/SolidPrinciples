package SolidPrinciples;

public class OrderTest {
    public static void main(String[] args) {
        OrderCalculator calculator = new OrderCalculator();
        PlaceOrder placeOrder = new PlaceOrder();
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();
        EmailNotifier emailNotifier = new EmailNotifier();

        OrderProcessor processor = new OrderProcessor(calculator, placeOrder);
        processor.processOrder(10.0, 2, "John Doe", "123 Main St");

        // Use functionalities as needed
        invoiceGenerator.generateInvoice("order_123.pdf");
        emailNotifier.sendEmailNotification("johndoe@example.com");
    }
}
