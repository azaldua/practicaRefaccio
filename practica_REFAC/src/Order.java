//REFACT 5
import java.util.List;
//REFACT7
class Order {
    private List<OrderLineItem> lineItems;
    private double taxRate;

    public Order(List<OrderLineItem> lineItems, double taxRate) {
        this.lineItems = lineItems;
        this.taxRate = taxRate;
    }

    public double calculateTotalPrice() {
        double subtotal = 0.0;
        for (OrderLineItem item : lineItems) {
            subtotal += item.getPrice();
        }
//REFACT8:  Inline Temp
//          Eliminar la variable temporal "tax" per simplificar el càlcul del preu total
        return subtotal + (subtotal * taxRate);

/*      double tax = subtotal * taxRate;
        return subtotal + tax; */


    }
    public class OrderLineItem {
        private String productName;
        private int quantity;
        private double price;

        public OrderLineItem(String productName, int quantity, double price) {
            this.productName = productName;
            this.quantity = quantity;
            this.price = price;
        }
        public double getPrice() {
            return price * quantity;
        }
    }
}
