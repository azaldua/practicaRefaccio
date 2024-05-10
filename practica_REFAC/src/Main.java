import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Posem el nom de la variable de forma mes intuïtiva
        String proves = "Proves";

        int opcio;
        //Esborrem els prints de 4 i 5 perque no hi ha cap funció que els cridi
        do {
            System.out.println("1. ");
            System.out.println("2. ");
            System.out.println("3. ");
            System.out.println("0. Acabar");

            opcio = scan.nextInt();
            scan.nextLine();
            switch (opcio) {
                case 1:
                    //Posem els prints de forma mes entenedora per l'usuari per demanar els valors
                    System.out.println("Digues el numero 1: ");
                    int num1 = scan.nextInt();
                    System.out.println("Digues el numero 2: ");
                    int num2 = scan.nextInt();
                    //Posem el print de forma mes facil d'entendre
                    if (max(num1,num2)) {
                        System.out.println(num1 + "es mes gran que " + num2);
                    }
                    else System.out.println(num2 + "es mes gran que " + num1);
                    break;
                case 2:
                    // Demanare els valors a b i c a l'usuari amb un print perque faci l'operacio(abans tenien uns valors predeterminats)
                    System.out.println("Introdueix el valor de a: ");
                    double a = scan.nextDouble();
                    System.out.println("Introdueix el valor de b: ");
                    double b = scan.nextDouble();
                    System.out.println("Introdueix el valor de c: ");
                    double c = scan.nextDouble();
                    calcEquacioSegongrau(a, b, c);
                    break;
                case 3:
                    //Afegim el new ArrayList perque estava amb valor null i importem la llibreria
                    //Posem un nom millor a la variable asd
                    List<OrderLineItem> lineItems = new ArrayList<>();
                    Order ordenar = new Order(lineItems, 5.5);

                    break;
                case 0:
                    break;
                //Cambiem els prints perque no es fins a 5 sino fins a 3
                default:
                    System.out.println("ATENCIÓ!!! \nHa de ser un valor entre 0 i 3");
            }
        } while (opcio != 0);
    }
    public static boolean max(int a, int b) {
        if(a > b) {
            return true;
        } else if (a == b) {
            return false;
        } else {
            return false;
        }
    }
    public static void calcEquacioSegongrau(double a, double b, double c) {
        //Posem el nom de la variable de forma mes entenedora(Abans era D i ara poperacio, abans era x ara soperacio
        double poperacio = b * b - 4 * a * c;
        if (poperacio > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(poperacio)) / (2 * a);
            x2 = (-b + Math.sqrt(poperacio)) / (2 * a);
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
        }
        else if (poperacio == 0) {
            double soperacio;
            soperacio = -b / (2 * a);
            System.out.println("x = " + soperacio);
        }
        else {
            System.out.println("Equation has no roots");
        }
    }

    //Aquests metodes no s'utilitzen enlloc, pero els deixem per si en un futur es volen utilitzar
    public static class Human {
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
                    //Afegim els appends de name i age que no estaban afegits
                    .append(name)
                    .append(", ")
                    .append(age)
                    .append(", ")
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

    public static class Order {
        private List<OrderLineItem> lineItems;
        private double taxRate;

        public Order(List<OrderLineItem> lineItems, double taxRate) {
            this.lineItems = lineItems;
            this.taxRate = taxRate;
        }

        public double calculateTotalPrice() {
            double subtotal = 0.0;
            for (OrderLineItem item : lineItems) {
                subtotal += item.getPrice();
            }
            double tax = subtotal * taxRate;
            return subtotal + tax;
        }
    }


     public class OrderLineItem {
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
    }

    public class Customer {
        private String firstName;
        private String lastName;

        public Customer(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFullName() {
            return firstName + " " + lastName;
        }
    }
}