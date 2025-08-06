import java.util.Scanner;
public class metrice{
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int rows=3, cols=4;

        int[][] A = new int[rows][cols];
         int[][] B = new int[rows][cols];
          int[][] C = new int[rows][cols];
           int[][] sum = new int[rows][cols];

           System.out.println("enter elements of matrix A: ");
           for(int i=0 ; i<rows; i++){
            for(int j=0; i<cols; j++){
                A [i][j]=sc.nextInt();
            }
           }


            System.out.println("enter elements of matrix B: ");
           for(int i=0 ; i<rows; i++){
            for(int j=0; i<cols; j++){
                B [i][j]=sc.nextInt();
            }
           }

            System.out.println("enter elements of matrix C: ");
           for(int i=0 ; i<rows; i++){
            for(int j=0; i<cols; j++){
                C [i][j]=sc.nextInt();
            }
           }
 
          for(int i=0 ; i<rows; i++){
            for(int j=0; i<cols; j++){
                sum [i][j]=A [i][j]+B [i][j]+C [i][j];
            }
           } 
 System.out.println("sum is : ");
           for(int i=0 ; i<rows; i++){
            for(int j=0; i<cols; j++){
               System.out.println(sum[i][j]+ "\t");
            }
            System.out.println();
           }
    }
}