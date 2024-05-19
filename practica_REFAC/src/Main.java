import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String p = "Proves";
        //Fer el menu més entenedor
        int opcio;
        do {
            System.out.println("1. Comparacio de numeros");
            System.out.println("2. Calcul equació segon grau");
            System.out.println("3. Ordenacio items");
            System.out.println("4. Funció en desenvolupament");
            System.out.println("5. Funció en desenvolupament");
            System.out.println("0. Acabar");

            opcio = scan.nextInt();
            scan.nextLine();
            switch (opcio) {
                case 1:
                    System.out.println("intro: ");
                    int num1 = scan.nextInt();
                    System.out.println("intro: ");
                    int num2 = scan.nextInt();
                    //Aclarar la resposta (no era masa entenedor 'aaa' i 'bbb')
                    if (max(num1,num2)) {
                        System.out.println("El primer numero és més gran");
                    }
                    else System.out.println("El segon numero és més gran");
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
                    //crear la opció dels números 4 i 5
                case 4:
                    System.out.println("Funció en desenvolupament!");
                    break;
                case 5:
                    System.out.println("Funció en desenvolupament!");
                    break;
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
        double calculDeRaiz = b * b - 4 * a * c;
        if (calculDeRaiz > 0) {
            double x1, x2;
            //fer una funció per els calculs per poder fer la lectura més entenedora
            x1 = resultatCalc2nGr(b,a,calculDeRaiz,false);
            x2 = resultatCalc2nGr(b,a,calculDeRaiz,true);
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
        }
        else if (calculDeRaiz == 0) {
            double x;
            x = resultatCalc2nGr(b,a,calculDeRaiz,false);
            System.out.println("x = " + x);
        }
        else {
            System.out.println("Equation has no roots");
        }
    }
    public static double resultatCalc2nGr(double b, double a, double calculDeRaiz, boolean positiu)
    {
        if(positiu && calculDeRaiz != 0) return (-b + Math.sqrt(calculDeRaiz)) / (2 * a);
        else if (!positiu && calculDeRaiz != 0) return (-b - Math.sqrt(calculDeRaiz)) / (2 * a);
        else return (-b / (2 * a));
    }
}