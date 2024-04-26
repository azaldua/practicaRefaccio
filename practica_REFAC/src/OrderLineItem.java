/**
 * Representa un artículo con unas variables para el nombre de producto, la cantidad y el precio.
 */
public class OrderLineItem {

    private String productName;
    private int quantity;
    private double price;

    /**
     * Crea una nueva instancia de la clase OrderLineItem.
     *
     * @param productName El nombre del producto en el artículo del pedido.
     * @param quantity    La cantidad del producto en el artículo del pedido.
     * @param price       El precio unitario del producto en el artículo del pedido.
     */
    public OrderLineItem(String productName, int quantity, double price) {
        this.productName = productName;
        this.quantity = quantity;
        this.price = price;
    }

    //Hemos añadido los getters siguientes:
    public String getProductName() {
        return productName;
    }

    public int getQuantity() {
        return quantity;
    }

    /**
     * Obtiene el precio total del artículo del pedido.
     * Este método calcula el precio total multiplicando el precio del producto por la cantidad.
     *
     * @return Un valor de tipo double que representa el precio total del pedido.
     */
    public double getPrice() {
        return price * quantity;
    }
}