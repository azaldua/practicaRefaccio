public class MathUtils {
    public static boolean isGreater(int firstNumber, int secondNumber) {
        boolean result = firstNumber > secondNumber; // If firstNumber is greater than secondNumber, result will be true.
        return result;
    }
    public static void solveSecondDegreeEquation(double coefficientA, double coefficientB, double coefficientC) {
        double discriminant = coefficientB * coefficientB - 4 * coefficientA * coefficientC; // discriminant = b^2 - 4ac

        if (discriminant > 0) { // discriminant > 0, the equation has two real roots
            double root1, root2; // root1 and root2 are the roots of the equation
            root1 = (-coefficientB - Math.sqrt(discriminant)) / (2 * coefficientA); // root1 = (-b - sqrt(discriminant)) / 2a
            root2 = (-coefficientB + Math.sqrt(discriminant)) / (2 * coefficientA); // root2 = (-b + sqrt(discriminant)) / 2a
            System.out.println("root1 = " + root1);
            System.out.println("root2 = " + root2);
        }

        else if (discriminant == 0) { // discriminant = 0, the equation has one real root
            double root;
            root = -coefficientB / (2 * coefficientA); // root = -b / 2a
            System.out.println("root = " + root);
        }

        else {
            System.out.println("The equation has no real roots");
        }
    }
}
