package SolidPrinciples;

public class PlaceOrder implements Order {

    @Override
    public void placeOrder(String customerName, String address) {

        System.out.println("Order placed for " + customerName + " at " + address);

    }

}
