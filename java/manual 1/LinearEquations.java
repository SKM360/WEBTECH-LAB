import java.util.Scanner;

public class LinearEquations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter coefficients a, b, m: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double m = sc.nextDouble();

        System.out.print("Enter coefficients c, d, n: ");
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        double n = sc.nextDouble();

        double determinant = a * d - b * c;

        if (determinant == 0) {
            System.out.println("The system has no unique solution.");
        } else {
            double x1 = (m * d - b * n) / determinant;
            double x2 = (a * n - m * c) / determinant;
            System.out.printf("Solution: x1 = %.2f, x2 = %.2f\n", x1, x2);
        }
    }
}