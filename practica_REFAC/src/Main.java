import java.io.File;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String proves = "Proves";

        //#Refactor
        int opcio_usuari;
        do {
            System.out.println("1. Calcular el maixim entre dos valors");
            System.out.println("2. ");
            System.out.println("3. ");
            System.out.println("4. ");
            System.out.println("5. ");
            System.out.println("0. Acabar");

            opcio_usuari = scan.nextInt();
            scan.nextLine();
            switch (opcio_usuari) {
                case 1:
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
        } while (opcio_usuari != 0);
    }
}