public class FloydsTriangle {
    public static void main(String[] args) {
        int num = 1;
        for (int i = 1; i <= 13; i++) {
            for (int j = 1; j <= i; j++) {
                if (num > 91) break;
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
            if (num > 91) break;
        }
    }
}