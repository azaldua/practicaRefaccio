import java.util.List;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
//REFACT1: Extracció de mètode
//          Agafar tot el codi del menu i passar-lo al mètode "menu()".
        menu();


/*      Scanner scan = new Scanner(System.in);
        String p = "Proves";

        int opcio;
        do {

            System.out.println("1. ");
            System.out.println("2. ");
            System.out.println("3. ");
            System.out.println("4. ");
            System.out.println("5. ");
            System.out.println("0. Acabar");


            opcio = scan.nextInt();
            scan.nextLine();
            switch (opcio) {
                case 1:
                    //REFACT3: Inline code
                    System.out.println("intro: ");
                    int num1 = scan.nextInt();
                    System.out.println("intro: ");
                    int num2 = scan.nextInt();
                    if (max(num1,num2)) {
                        System.out.println("aaa");
                    }
                    else System.out.println("bbb");
                    break;
                case 2:
                    double a=2;
                    double b=3;
                    double c=1;
                    calcEquacioSegongrau(a, b, c);
                    break;
                case 3:
                    List<OrderLineItem> lineItems = null;
                    Order asd = new Order(lineItems, 5.5);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("ATENCIÓ!!! \nHa de ser un valor entre 0 i 5");
            }
        } while (opcio != 0); */
    }
    public static boolean max(int a, int b) {
//REFACT2:  Inline Code
//          Simplificar mètode max() retornant directament el valor de la comparació entre a > b
        return a > b;

        /*if(a > b) {
            return true;
        } else if (a == b) {
            return false;
        } else {
            return false;
        }*/
    }
    public static void calcEquacioSegongrau(double a, double b, double c) {
        double D = b * b - 4 * a * c;
//REFACT 3 i 4
        final double x1 = (-b - Math.sqrt(D)) / (2 * a);
        final double x2 = (-b + Math.sqrt(D)) / (2 * a);
        double x = -b / (2 * a);

        if (D > 0) {
//REFACT3:  Dividir variable temporal x1 x2
           /* double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);*/
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
        }
        else if (D == 0) {
//REFACT4:  Dividir variable temporal x
          /*  double x;
            x = -b / (2 * a);*/

            System.out.println("x = " + x);
        }
        else {
            System.out.println("Equation has no roots");
        }
    }
    //REFACT 5:  Extracció de classe Human
   /* public static class Human {
        private String name;
        private String age;
        private String country;
        private String city;
        private String street;
        private String house;
        private String quarter;
        public String obtenirAdrecaCompleta() {
            StringBuilder result = new StringBuilder();
            //REFACT 6:  Inline Temp
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
    }*/
    //REFACT7:  Extracció de classe Order i OrderLineItem
/*    public static class Order {
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
    } */

    //REFACT10: Extracció de classe Customer
/*    public class Customer {
        private String firstName;
        private String lastName;

        public Customer(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFullName() {
            return firstName + " " + lastName;
        }
    } */


    //REFACT1
    private static void menu() {
        Scanner scan = new Scanner(System.in);
        String p = "Proves";

        int opcio;
        do {

            System.out.println("1. ");
            System.out.println("2. ");
            System.out.println("3. ");
            System.out.println("4. ");
            System.out.println("5. ");
            System.out.println("0. Acabar");


            opcio = scan.nextInt();
            scan.nextLine();
            switch (opcio) {
                case 1:
                    //REFACT3: Inline code
                    System.out.println("intro1: ");
                    int num1 = scan.nextInt();
                    System.out.println("intro2: ");
                    int num2 = scan.nextInt();
                    if (max(num1, num2)) {
                        System.out.println("aaa");
                    } else System.out.println("bbb");
                    break;
                case 2:
                    double a = 2;
                    double b = 3;
                    double c = 1;
                    calcEquacioSegongrau(a, b, c);
                    break;
                case 3:
                    List<Order.OrderLineItem> lineItems = null;
                    Order asd = new Order(lineItems, 5.5);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("ATENCIÓ!!! \nHa de ser un valor entre 0 i 5");
            }
        } while (opcio != 0);
    }
}
