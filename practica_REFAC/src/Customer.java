/**
 * Classe Customer que tiene unas variables de un cliente con un nombre y apellido.
 */
public class Customer {
    private String firstName;
    private String lastName;

    /**
     * Crea una nueva instancia de la clase Customer.
     * @param firstName El nombre del cliente.
     * @param lastName El apellido del cliente.
     */
    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    /**
     * Obtiene el nombre completo del cliente.
     * Este método concatena el nombre y el apellido del cliente.
     * @return Una cadena de texto que representa el nombre completo.
     */
    public String getFullName() {
        return firstName + " " + lastName;
    }
}