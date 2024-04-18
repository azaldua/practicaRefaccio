import java.io.File;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
                    //REFACT: El objeto asd no se utiliza. Por lo que se puede eliminar/comentar.
//                    Order asd = new Order(lineItems, 5.5);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("ATENCIÓ!!! \nHa de ser un valor entre 0 i 5");
            }
        } while (opcio != 0);
    }
    /**
     * Refact. El uso de if else es inecesario.
     * @return Dependiendo de los parámetros de entrada, devuelve true o false.
     */
    public static boolean max(int a, int b) {
        return a > b;

    }

    /**
     * REFACT Cambiar el nombre de las variables por nombres más descriptivos.
     * @param coeficienteA p
     * @param coeficienteB
     * @param coeficienteC
     */
    public static void calcEquacioSegongrau(double coeficienteA, double coeficienteB, double coeficienteC) {
        double D = coeficienteB * coeficienteB - 4 * coeficienteA * coeficienteC;
        if (D > 0) {
            double x1, x2;
            x1 = (-coeficienteB - Math.sqrt(D)) / (2 * coeficienteA);
            x2 = (-coeficienteB + Math.sqrt(D)) / (2 * coeficienteA);
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
        }
        else if (D == 0) {
            double x;
            x = -coeficienteB / (2 * coeficienteA);
            System.out.println("x = " + x);
        }
        else {
            System.out.println("Equation has no roots");
        }
    }


}