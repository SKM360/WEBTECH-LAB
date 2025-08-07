public class SumAverageArgs {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No input given.");
            return;
        }
int sum = 0;
        for (String arg : args) {
            sum += Integer.parseInt(arg);
        }
        double average = (double) sum / args.length;
        System.out.println("Sum = " + sum);
        System.out.println("Average = " + average);
    }
}