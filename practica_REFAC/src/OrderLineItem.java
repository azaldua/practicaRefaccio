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
    // Getters for productName, quantity, and price
    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getUnitPrice() {
        return price;
    }

    // Setters for productName, quantity, and price
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    // toString() method
    @Override
    public String toString() {
        return "OrderLineItem{" +
                "productName='" + productName + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                '}';
    }
}
