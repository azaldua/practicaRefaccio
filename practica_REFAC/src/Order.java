import java.util.List;

public class Order {
    // separar la clase del main
    private List<OrderLineItem> lineItems;
    private double taxRate;

    public Order(List<OrderLineItem> lineItems, double taxRate) {
        this.lineItems = lineItems;
        this.taxRate = taxRate;
    }


}
