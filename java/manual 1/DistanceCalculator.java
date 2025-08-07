import java.util.Scanner;

public class DistanceCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter initial velocity (u): ");
        double u = sc.nextDouble();

        System.out.print("Enter acceleration (a): ");
        double a = sc.nextDouble();

        System.out.print("Enter total time (t): ");
        int t = sc.nextInt();

        System.out.println("Time\tDistance");
        for (int i = 1; i <= t; i++) {
            double distance = u * i + (a * i * i) / 2;
            System.out.printf("%d\t%.2f\n", i, distance);
        }
    }
}