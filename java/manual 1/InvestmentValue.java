import java.util.Scanner;
public class InvestmentValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal (P): ");
        double P = sc.nextDouble();
        System.out.print("Enter rate (r): ");
        double r = sc.nextDouble();
        double V = P * Math.pow((1 + r), r);
        System.out.printf("Investment Value (V) = %.2f\n", V);
    }
}