/**
 * Obtiene la dirección completa de una persona.
 * Este método construye y devuelve una cadena con información personal de una persona incluyendo país, ciudad, calle, número de casa y barrio.
 * @return Una cadena con la dirección de la persona en cuestión.
 */
//No se puede crear ningun Human por qué hay constructor. Debido a eso la funcion 'obtenirAdrecaCompleta' esta obsoleta
public class Human {
    private String name;
    private String age;
    private String country;
    private String city;
    private String street;
    private String house;
    private String quarter;



    public String obtenirAdrecaCompleta() {
        StringBuilder result = new StringBuilder();
        return result
                .append(country)
                .append(", ")
                .append(city)
                .append(", ")
                .append(street)
                .append(", ")
                .append(house)
                .append(" ")
                .append(quarter).toString();
    }
}