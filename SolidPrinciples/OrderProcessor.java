package SolidPrinciples;

public class OrderProcessor {
    private final OrderCalculator calculator;
    private final Order orderPlacer;

    public OrderProcessor(OrderCalculator calculator, Order orderPlacer) {

        this.calculator = calculator;
        this.orderPlacer = orderPlacer;

    }

    public void processOrder(double price, int quantity, String customerName, String address) {

        double total = calculator.calculateTotal(price, quantity);

        System.out.println("Order total: $" + total);

        orderPlacer.placeOrder(customerName, address);

    }

}
