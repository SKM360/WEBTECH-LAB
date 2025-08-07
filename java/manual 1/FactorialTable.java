import java.util.Scanner;
public class FactorialTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of N: ");
        int n = sc.nextInt();
        System.out.println("Number\tFactorial");
        for (int i = 1; i <= n; i++) {
            long fact = 1;
            for (int j = 1; j <= i; j++) {
                fact *= j;
            }
            System.out.println(i + "\t" + fact);
        }
    }
}