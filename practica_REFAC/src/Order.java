import java.util.List;

public class Order {
    private final List<OrderLineItem> lineItems;
    private final double taxRate;

    public Order(List<OrderLineItem> lineItems, double taxRate) {
        try {
            if (lineItems == null) {
                throw new IllegalArgumentException("lineItems must not be null");
            }
            if (taxRate < 0.0) {
                throw new IllegalArgumentException("taxRate must not be negative");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        this.lineItems = lineItems;
        this.taxRate = taxRate;
    }

    public double calculateTotalPrice() {
        double subtotal = 0.0;
        for (OrderLineItem item : lineItems) {
            subtotal += item.getPrice();
        }
        double tax = subtotal * taxRate;
        double totalPrice = subtotal + tax;
        return totalPrice;
    }
}
