public class Human {
    // separar la clase del main
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
    public String toString() {
        return "Human{" +
                "country='" + country + ''' +
                ", city='" + city + ''' +
                ", street='" + street + ''' +
                ", house='" + house + ''' +
                ", quarter='" + quarter + ''' +
                '}';
    }
}
