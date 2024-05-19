public class Human {
    private String name;
    private int age;
    private String country;
    private String city;
    private String street;
    private String house;
    private String quarter;

    public Human(String name, int age, String country, String city, String street, String house, String quarter) {
        this.name = name;
        this.age = age;
        this.country = country;
        this.city = city;
        this.street = street;
        this.house = house;
        this.quarter = quarter;
    }

    // Getters y Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getQuarter() {
        return quarter;
    }

    public void setQuarter(String quarter) {
        this.quarter = quarter;
    }

    public String obtainTheCompletAddress() {
        return String.join(", ", country, city, street, house + " " + quarter);
    }


    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", house='" + house + '\'' +
                ", quarter='" + quarter + '\'' +
                '}';
    }
}

