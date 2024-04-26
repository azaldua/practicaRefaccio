import java.io.File;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //REFACT: La variable p no se utiliza. Se puede eliminar
//        String p = "Proves";


        // MENÚ CON SELECCIÓN MULTIPLE PARA REALIZAR DIFERENTES OPERACIONES
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
                        System.out.println("El primer número es más grande.");
                    }
                    else System.out.println("El segundo número es más grande.");
                    break;
                case 2:
                    System.out.print("Introduce el coeficiente A: ");
                    double coeficienteA= scan.nextDouble();
                    System.out.print("Introduce el coeficiente B: ");
                    double coeficienteB= scan.nextDouble();
                    System.out.print("Introduce el coeficiente C: ");
                    double coeficienteC= scan.nextDouble();
                    calcEquacioSegongrau(coeficienteA, coeficienteB, coeficienteC);
                    break;
                case 3:
                    List<OrderLineItem> lineItems = null;
                    //REFACT: El objeto asd no se utiliza. Por lo que se puede eliminar/comentar.
//                    Order asd = new Order(lineItems, 5.5);
                    break;
                case 4:
                    System.out.println("Método en mantenimiento.");
                    break;
                case 5:
                    Order.calculateTotalPrice();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("ATENCIÓ!!! \nHa de ser un valor entre 0 i 5");
            }
        } while (opcio != 0);
    }
    /**
     * Esta función la podemos usar para comprobar si un parámetro es mayor a otro para que nos devuelva true o false.
     * Refact. El uso de if else es inecesario.
     * @return Dependiendo de los parámetros de entrada, devuelve true o false.
     */
    public static boolean max(int a, int b) {
        return a > b;

    }

    /**
     * Esta función se puede usar par calcular raíces de una equación cuadrática.
     * REFACT Cambiar el nombre de las variables por nombres más descriptivos.
     *
     */
    public static void calcEquacioSegongrau(double coeficienteA, double coeficienteB, double coeficienteC) {
        double discriminant = coeficienteB * coeficienteB - 4 * coeficienteA * coeficienteC;
        if (discriminant > 0) {
            double x1, x2;
            x1 = getResultat(discriminant,coeficienteA,coeficienteB,'+' );
            x2 = getResultat(discriminant,coeficienteA,coeficienteB,'-' );
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
        }
        else if (discriminant == 0) {
            double x;
            x = getResultat(discriminant,coeficienteA,coeficienteB,'*' );
            System.out.println("x = " + x);
        }
        else {
            System.out.println("Equation has no roots");
        }
    }
    public static double getResultat(double discriminant, double coeficienteA, double coeficienteB, char signo){
        if (signo=='+'){
            return  (-coeficienteB - Math.sqrt(discriminant)) / (2 * coeficienteA);
        }
        if (signo=='-'){
            return  (-coeficienteB + Math.sqrt(discriminant)) / (2 * coeficienteA);
        }
        if (signo=='*'){
            return -coeficienteB / (2 * coeficienteA);
        }
        return -1;
    }
}