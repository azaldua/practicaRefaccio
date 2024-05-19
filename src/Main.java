import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<OrderLineItem> lineItems = new ArrayList<>();
    //REFACT: Es definex aquesta lista fora per utilitzar-la a totes les funcions

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //REFACT: eliminat el string "p" ja que no s'utilitzaba a cap lloc.


        int opcio;
        do { //REFACT: S'ha afegit l'enunciat de cada case, es a dir, que fa cada part.
            System.out.println("1. Quin nombre és més gran. ");
            System.out.println("2. Calcular equacio de segon grau.");
            System.out.println("3. Crear comanda");
            System.out.println("4. Calcular preu total de la comanda");
            System.out.println("5. Dades comprador");
            System.out.println("0. Acabar");
            System.out.println("Que vols fer?"); //REFACT: He agregat aquest print.

            opcio = scan.nextInt();
            scan.nextLine();
            switch (opcio) {
                case 1: //REFACT: S'ha millorat la pregunta de l'introducció de dades. També he modificat el codi ja que
                    //abants no hi habia la posibilitat de que et digues si els dos nombres son iguals.
                    System.out.print("Introudeix el primer nombre: ");
                    int num1 = scan.nextInt();
                    System.out.print("Introdueix el segon nombre: " );
                    int num2 = scan.nextInt();

                    max(num1,num2); //REFACT: ara es crida la funcio per comparar els nombres.

                    break;

                case 2:
                    Scanner scanner = new Scanner(System.in);
                    System.out.print("Introdueix el coeficient a: ");
                    double a = scanner.nextDouble();
                    System.out.print("Introdueix el coeficient b: ");
                    double b = scanner.nextDouble();
                    System.out.print("Introdueix el coeficient c: ");
                    double c = scanner.nextDouble();
                    calcEquacioSegongrau(a, b, c);
                    break;

                case 3: //REFACT: ja que l'anterior codi no feia res he decidit fer un codi per crear una comanda.
                    System.out.print("Introdueix el nom del producte: ");
                    String productName = scan.nextLine();
                    System.out.print("Introdueix la quantitat del producte: ");
                    int quantity = scan.nextInt();
                    System.out.print("Introdueix el preu del producte: ");
                    double price = scan.nextDouble();

                    OrderLineItem newOrderLineItem = new Main().new OrderLineItem(productName, quantity, price);
                    newOrderLineItem.addToOrder(lineItems);
                    System.out.println("Producte afegit a la comanda.");
                    break;

                case 4: //REFACT: codi per calcular el preu total de la comanda i afegirla a l'ordre.
                    double taxRate = 0;
                    Order order = new Order(lineItems, taxRate);
                    double totalPrice = order.calculateTotalPrice();
                    System.out.println("Preu total de la comanda: " + totalPrice);
                    break;

                case 5: //REFACT: codi per crear i guardar les dades del comprador.
                    System.out.print("Introdueix el teu nom: ");
                    String firstName = scan.nextLine();

                    System.out.print("Introdueix el teu cognom: ");
                    String lastName = scan.nextLine();

                    Customer customer = new Customer(firstName, lastName);

                    System.out.println("Nom complet: " + customer.getFullName());
                    break;
                case 0:
                    break;
                default:
                    System.out.println("ATENCIÓ!!! \nHa de ser un valor entre 0 i 5");
            }
        } while (opcio != 0);
    }

    public static boolean max(int a, int b) { //REFACT: s'han afegit comentaris a cada cas per mostrar que es el que passa.
        if(a > b) {
            System.out.println(a + " és major que " + b);
            return true;
        } else if (a == b) {
            System.out.println(a + " és igual a " + b);
            return false;
        } else {
            System.out.println(b + " és major que " + a);
            return false;
        }
    }

    public static void calcEquacioSegongrau(double a, double b, double c) {
        double D = b * b - 4 * a * c;
        if (D > 0) {
            double x1 = (-b - Math.sqrt(D)) / (2 * a); //REFACT: Es defineixen els doubles "x1" i "x2" directament per ocupar menys.
            double x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
        } else if (D == 0) {
            double x = -b / (2 * a); //REFACT: Es defineix el double "x" directament per ocupar menys.
            System.out.println("x = " + x);
        } else {
            System.out.println("L'equació no té arrels"); //REFACT: S'ha traduit al català la resposta.
        }
    }

    //REFACT: funció de "Human" eliminada ja que no aporta al codi.

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

        public void addToOrder(List<OrderLineItem> lineItems) {

        }
    }

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