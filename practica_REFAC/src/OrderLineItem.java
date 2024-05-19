public class OrderLineItem {
    private String productName;
    private int quantity;
    private float price;

    public OrderLineItem(String productName, int quantity, float price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }
    public float getPrice() {
        return price * quantity;
    }
    // Getters for productName, quantity, and price (if needed)
    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getUnitPrice() {
        return price;
    }
}
