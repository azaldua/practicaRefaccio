//import java.io.File;
// REFACT: Eliminat el import de java.io.File. No utilitzat.
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // REFACT: Afegit funcio del scanner perqué es pugui posar espais a l'hora d'introduir dades.
        scan.useDelimiter("\\n");
        //String p = "Proves";
        // REFACT: Eliminada la variable p que no s'utilitzava en cap part del codi.

        int opcio;
        do {
            //System.out.println("1. ");
            //System.out.println("2. ");
            //System.out.println("3. ");
            //System.out.println("4. ");
            //System.out.println("5. ");
            // REFACT: Canviats els prints. Poc explicatius.
            System.out.println("1. Numero més gran");
            System.out.println("2. Calcul equació de segon grau ");
            System.out.println("3. Preu total de una comanda amb els productes Poma,Clau,Tirita");
            System.out.println("4. Mostar adreça completa d'un humá");
            System.out.println("5. Creacio d'un client");
            System.out.println("0. Acabar");

            opcio = scan.nextInt();
            scan.nextLine();
            switch (opcio) {
                case 1:
                    //System.out.println("intro: ");
                    // REFACT: Canviat el print. Poc explicatiu.
                    System.out.println("Introdueix un numero: ");
                    int num1 = scan.nextInt();
                    //System.out.println("intro: ");
                    // REFACT: Canviat el print. Poc explicatiu.
                    System.out.println("Introdueix altre numero: ");
                    int num2 = scan.nextInt();
                    if (max(num1,num2)) {
                        //System.out.println("aaa");
                        // REFACT: Canviat el print. Poc explicatiu
                        System.out.println("El numero mes gran és: " + num1);
                    }
                    else {
                        //System.out.println("bbb");
                        // REFACT: Canviat el print. Poc explicatiu
                        System.out.println("Son iguals o el numero mes gran és: " + num2);
                    }
                    break;
                case 2:
                    //double a=2;
                    //double b=3;
                    //double c=1;
                    // REFACT: Eliminat l'assignació forçada de les variables perquè l'usuari pugui introduir-les.
                    System.out.println("Introdueix la variable a: ");
                    int a = scan.nextInt();

                    System.out.println("Introdueix la variable b: ");
                    int b = scan.nextInt();

                    System.out.println("Introdueix la variable c: ");
                    int c = scan.nextInt();

                    calcEquacioSegongrau(a, b, c);

                    break;
                case 3:
                    //List<OrderLineItem> lineItems = null;
                    // REFACT: Canviat la variable 'lineItems' de null a ArrayList.
                    List<OrderLineItem> lineItems = new ArrayList<>();

                    // REFACT: Afegit productes d'exemple per poder utilitzar les funcions de les classes OrderLineItem i Order.
                    lineItems.add(new OrderLineItem("Poma", 10, 3));
                    lineItems.add(new OrderLineItem("Clau", 20, 1.5));
                    lineItems.add(new OrderLineItem("Tirita", 50, 0.5));

                    //Order asd = new Order(lineItems, 5.5);
                    // REFACT: Canviat el nom de la variable 'asd'. Poc explicatiu.
                    Order comanda = new Order(lineItems, 5.5);

                    // REFACT: Afegit el print pel preu total de la comanda.
                    System.out.println("Total de la comanda: " + comanda.calculateTotalPrice());

                    break;
                // REFACT: Afegit el case 4 per utilitzar la classe 'Human'.
                case 4:
                    System.out.print("Introdueix nom: ");
                    String nomHuma = scan.next();

                    System.out.print("Introdueix edat: ");
                    int edatHuma = scan.nextInt();

                    System.out.print("Introdueix pais: ");
                    String paisHuma = scan.next();

                    System.out.print("Introdueix ciutat: ");
                    String ciutatHuma = scan.next();

                    System.out.print("Introdueix carrer: ");
                    String carrerHuma = scan.next();

                    System.out.print("Introdueix numero de casa: ");
                    String numCasaHuma = scan.next();

                    System.out.print("Introdueix barri: ");
                    String barriHuma = scan.next();

                    Human huma = new Human(nomHuma,edatHuma,paisHuma,ciutatHuma,carrerHuma,numCasaHuma,barriHuma);

                    System.out.println(huma.obtenirAdrecaCompleta());

                    break;
                //REFACT: Afegit el cas 5 per poder utilitzar la classe 'Customer'.
                case 5:
                    System.out.print("Introdueix nom: ");
                    String nomClient = scan.next();

                    System.out.print("Introdueix cognom: ");
                    String cognomClient = scan.next();

                    Customer client = new Customer(nomClient, cognomClient);

                    System.out.println("Nom complet del client: " + client.getFullName());
                case 0:
                    break;
                default:
                    System.out.println("ATENCIÓ!!! \nHa de ser un valor entre 0 i 5");
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
        double D = b * b - 4 * a * c;
        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
        }
        else if (D == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("x = " + x);
        }
        else {
            System.out.println("Equation has no roots");
        }
    }
    public static class Human {
        private String name;
        //private String age;
        // REFACT: Canviat el tipus de variable de 'age' de String a int.
        private int age;
        private String country;
        private String city;
        private String street;
        private String house;
        private String quarter;

        // REFACT: Afegit constructor de la classe 'Human'.
        public Human(String name, int age, String country, String city, String street, String house, String quarter) {
            this.name = name;
            this.age = age;
            this.country = country;
            this.city = city;
            this.street = street;
            this.house = house;
            this.quarter = quarter;
        }

        public String obtenirAdrecaCompleta() {
            //StringBuilder result = new StringBuilder();
            //return result
            //       .append(country)
            //        .append(", ")
            //        .append(city)
            //        .append(", ")
            //        .append(street)
            //        .append(", ")
            //        .append(house)
            //        .append(" ")
            //        .append(quarter).toString();
            // REFACT: Canviat com retornaba la string el metode 'obtenirAdrecaCompleta'. Per que sigui mes entendible.
            return "L'humá amb nom " + name +
                    " amb " + age +
                    " anys, viu al pais " + country +
                    ", ciutat " + city +
                    ", al carrer " + street +
                    " número " + house +
                    " del barri " + quarter;
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

    //public class OrderLineItem {
    // REFACT: canviat la classe OrderLineItem a static per poder afegir productes d'exemple.
    public static class OrderLineItem {
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

    //public class Customer {
    // REFACT: Canviat la classe 'Customer' a static per poder crear clients.
    public static class Customer {
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