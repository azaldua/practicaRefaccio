public class OrderLineItem {
    // separar la clase del main
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
    public String toString() {
        return "OrderLineItem{" +
                "productName='" + productName + " \' " +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
