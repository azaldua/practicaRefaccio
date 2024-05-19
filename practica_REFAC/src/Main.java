import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Fer el menu més entenedor
        selector();
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
        boolean arrelPositiva = calculDeRaiz > 0;
        boolean arrelZero = calculDeRaiz == 0;
        if (arrelPositiva) {
            calculArrelPositiva();
        }
        else if (arrelZero) {
            calculArrelZero();
        }
        else {
            System.out.println("Equation has no roots");
        }
    }
    public static void calculArrelPositiva(){
        double x1, x2;
            //fer una funció per els calculs per poder fer la lectura més entenedora
            x1 = resultatCalc2nGr(b,a,calculDeRaiz,false);
            x2 = resultatCalc2nGr(b,a,calculDeRaiz,true);
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
    }
    public static void calculArrelZero(){
        double x;
            x = resultatCalc2nGr(b,a,calculDeRaiz,false);
            System.out.println("x = " + x);
    }
    public static double resultatCalc2nGr(double b, double a, double calculDeRaiz, boolean positiu)
    {
        if(positiu && calculDeRaiz != 0) return (-b + Math.sqrt(calculDeRaiz)) / (2 * a);
        else if (!positiu && calculDeRaiz != 0) return (-b - Math.sqrt(calculDeRaiz)) / (2 * a);
        else return (-b / (2 * a));
    }
    public static mostrarMenu(){
        System.out.println("1. Comparacio de numeros");
        System.out.println("2. Calcul equació segon grau");
        System.out.println("3. Ordenacio items");
        System.out.println("4. Funció en desenvolupament");
        System.out.println("5. Funció en desenvolupament");
        System.out.println("0. Acabar");
    }
    public static void mostrarMesGran(){
        demanarNumeros();
        //Aclarar la resposta (no era masa entenedor 'aaa' i 'bbb')
        if (max(num1,num2)) {
             System.out.println("El primer numero és més gran");
        }
        else System.out.println("El segon numero és més gran");
    }
    public static void demanarNumeros(){
        System.out.println("intro: ");
        int num1 = scan.nextInt();
        System.out.println("intro: ");
        int num2 = scan.nextInt();
    }
    public static void calculEquacio(){
        double a=2;
        double b=3;
        double c=1;
        calcEquacioSegongrau(a, b, c);
    }
    public static void ordenar(){
        List<OrderLineItem> lineItems = null;
        Order asd = new Order(lineItems, 5.5);
    }
    public static void selector(){
        Scanner scan = new Scanner(System.in);
        String p = "Proves";        
        String opcio;
        do {
            mostrarMenu();
            opcio = scan.nextLine();
            switch (opcio) {
                case "1":
                   mostrarMesGran();
                    break;
                case "2":
                    calculEquacio();
                    break;
                case "3":
                    ordenar();
                    break;
                    //crear la opció dels números 4 i 5
                case "4":
                    System.out.println("Funció en desenvolupament!");
                    break;
                case "5":
                    System.out.println("Funció en desenvolupament!");
                    break;
                case "0":
                    break;
                default:
                    System.out.println("ATENCIÓ!!! \nHa de ser un valor entre 0 i 5");
            }
        } while (opcio != 0);
    }
}
