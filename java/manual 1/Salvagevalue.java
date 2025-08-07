import java.util.Scanner;

public class Salvagevalue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Purchase Price: ");
        double purchasePrice = sc.nextDouble();

        System.out.print("Enter Years of Service: ");
        int years = sc.nextInt();

        System.out.print("Enter Annual Depreciation: ");
        double depreciation = sc.nextDouble();

        double salvageValue = purchasePrice - (depreciation * years);

        System.out.printf("Salvage Value is: %.2f\n", salvageValue);
    }
}