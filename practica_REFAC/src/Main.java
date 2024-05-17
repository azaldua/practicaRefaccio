// Alberto
import java.io.File;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String p = "Proves";

        int opcio;
        do {
            System.out.println("1. Comparar dos números");
            System.out.println("2. Calcular equació de segon grau");
            System.out.println("3. Crear una comanda");
            System.out.println("0. Acabar");

            opcio = scan.nextInt();
            scan.nextLine();
            switch (opcio) {
                case 1:
                    System.out.println("Introdueix el primer número: ");
                    int primerNumero = scan.nextInt();
                    System.out.println("Introdueix el segon número: ");
                    int segonNumero = scan.nextInt();
                    if (PrimerNumeroMesGran(primerNumero,segonNumero)) {
                        System.out.println("El primer número és més gran.");
                    }
                    else System.out.println("El segon número és més gran.");
                    break;
                case 2:
                    double a=2;
                    double b=3;
                    double c=1;
                    calcarEquacioSegongrau(a, b, c);
                    break;
                case 3:
                    List<OrderLineItem> lineItems = null;
                    Comanda comanda = new Comanda(liniesComanda, 5.5);
                    break;
                case 0:
                    break;
                default:
                    System.out.println("ATENCIÓ!!! \nHa de ser un valor entre 0 i 3");
            }
        } while (opcio != 0);
    }
    
    public static boolean PrimerNumeroMesGran(int primerNumero, int segonNumero) {
        return primerNumero > segonNumero;
    }
    
    //Millora funció cacularEquacioSegonGrau
    public static void calcularEquacioSegonGrau(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        if (discriminant > 0) {
            double x1 = (-b - Math.sqrt(discriminant)) / (2 * a);
            double x2 = (-b + Math.sqrt(discriminant)) / (2 * a);
            System.out.println("x1 = " + x1 + ", x2 = " + x2);
        } else if (discriminant == 0) {
            double x = -b / (2 * a);
            System.out.println("x = " + x);
        } else {
            System.out.println("L'equació no té arrels reals");
        }
    }
    
    public static class Persona {
        private String nom;
        private String edat;
        private String pais;
        private String ciutat;
        private String carrer;
        private String casa;
        private String barri;

        public String obtenirAdrecaCompleta() {
            StringBuilder adreca = new StringBuilder();
            return adreca
                    .append(pais)
                    .append(", ")
                    .append(ciutat)
                    .append(", ")
                    .append(carrer)
                    .append(", ")
                    .append(casa)
                    .append(" ")
                    .append(barri).toString();
        }
    }

    public static class Comanda {
        private List<LiniaComanda> liniesComanda;
        private double taxa;

        public Comanda(List<LiniaComanda> liniesComanda, double taxa) {
            this.liniesComanda = liniesComanda;
            this.taxa = taxa;
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

    public static class LiniaComanda {
        private String nomProducte;
        private int quantitat;
        private double preu;

        public LiniaComanda(String nomProducte, int quantitat, double preu) {
            this.nomProducte = nomProducte;
            this.quantitat = quantitat;
            this.preu = preu;
        }

        public double getPreu() {
            return preu * quantitat;
        }
    }
    public static class Client {
        private String primerNom;
        private String cognom;

        public Client(String primerNom, String cognom) {
            this.primerNom = primerNom;
            this.cognom = cognom;
        }

        public String obtenirNomComplet() {
            return primerNom + " " + cognom;
        }
    }
}
