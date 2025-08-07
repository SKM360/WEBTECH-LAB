import java.util.Scanner;

public class harmonic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        double sum = 0.0;

        for (int i = 1; i <= n; i++) {
            sum += 1.0 / i;
        }

        System.out.printf("Sum of Harmonic Series up to %d terms is: %.4f\n", n, sum);
    }
}