public class LargestFromArgs {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No input given.");
            return;
        }
int max = Integer.parseInt(args[0]);
        for (int i = 1; i < args.length; i++) {
            int num = Integer.parseInt(args[i]);
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Largest number is: " + max);
    }
}