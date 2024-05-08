package SolidPrinciples;

public class InvoiceGenerator implements Invoice{

    @Override
    public void generateInvoice(String fileName) {

        System.out.println("Invoice generated: " + fileName);

    }

}
