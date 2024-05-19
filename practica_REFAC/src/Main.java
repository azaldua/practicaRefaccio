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
            menu();

            opcio_usuari = scan.nextInt();
            scan.nextLine();
            switch (opcio_usuari) {
                case 1:
                    System.out.println("Give me the first number: ");
                    int firstNumber = scan.nextInt();
                    System.out.println("Give me the second number: ");
                    int secondNumber = scan.nextInt();

                    if (MathUtils.isGreater(firstNumber,secondNumber)) {
                        System.out.println("Correct, "+firstNumber+" is greater than "+secondNumber);
                    }
                    else System.out.println("Wrong, "+firstNumber+" is not greater than "+secondNumber);
                    break;


                case 2:
                    double coefficientA;
                    double coefficientB;
                    double coefficientC;

                    System.out.println("Give me the coefficient A: ");
                    coefficientA = scan.nextInt();
                    System.out.println("Give me the coefficient B: ");
                    coefficientB = scan.nextInt();
                    System.out.println("Give me the coefficient C: ");
                    coefficientC = scan.nextInt();
                    calcEquacioSegongrau(coefficientA, coefficientB, coefficientC);
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

    public static void menu() {
        System.out.println("1. Calculate the maximum between two values");
        System.out.println("2. ");
        System.out.println("3. ");
        System.out.println("4. ");
        System.out.println("5. ");
        System.out.println("0. Acabar");
    }
}