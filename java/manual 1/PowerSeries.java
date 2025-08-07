import java.util.Scanner;

public class PowerSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("Enter r: ");
        int r = sc.nextInt();

        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += Math.pow(i, r);
        }

        System.out.println("Sum of the series is: " + sum);
    }
}