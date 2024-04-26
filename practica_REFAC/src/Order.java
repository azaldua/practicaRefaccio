import java.util.List;

/**
 * Representa un pedido con una lista de artículos y una tasa de impuestos.
 */
public class Order {
    private static List<OrderLineItem> lineItems;
    private static double taxRate;

    /**
     * Crea una nueva instancia de la clase Order.
     *
     * @param lineItems Una lista de artículos en el pedido.
     * @param taxRate   La tasa de impuestos que se aplica al pedido.
     */
    public Order(List<OrderLineItem> lineItems, double taxRate) {
        this.lineItems = lineItems;
        this.taxRate = taxRate;
    }

    /**
     * Calcula el precio total del pedido.
     * Este método calcula el precio total del pedido sumando los precios de todos los artículos en el pedido y luego agregando los impuestos.
     * Los impuestos se calculan multiplicando el subtotal (la suma de los precios de los artículos) por la tasa de impuestos.
     *
     * @return Un valor de tipo double que representa el precio total del pedido incluyendo impuestos.
     */
    public static double calculateTotalPrice() {
        double subtotal = 0.0;
        for (OrderLineItem item : lineItems) {
            subtotal += item.getPrice();
        }
        double tax = subtotal * taxRate;
        return subtotal + tax;
    }
}