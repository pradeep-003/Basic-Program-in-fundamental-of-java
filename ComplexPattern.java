import java.util.Scanner;

public class ComplexPattern {
    public static void main(String[] args) {

        // diagonal 1

       /* int n = 10 ;
        for (int i =0 ; i < n ; i++){
            for(int j = 0; j<n ; j++){
                if (i==j){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(" "); }
            */

        // diagonal 2
     /*   int n = 3;
        for (int i =0 ; i < n ; i++){
            for(int j = 0; j<n ; j++){
                if (i+j == n-1){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println(" "); }
             } */
         /*    Scanner scan = new Scanner(System.in);
        System.out.println( " Enter the value of n : ");
              int n = scan.nextInt();

        for (int i =0 ; i < n ; i++){
            for(int j = 0; j<n ; j++){
                if (i==j || i+j == n-1 || i == 0|| i ==n-1 || j==0 || j==n-1 || i+j == (n-1)/2 || i-j ==(n-1)/2 ||
                       i+j== (n-1)+(n-1)/2 || j-i == (n-1)/2){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.print("    " );
            for(int j = 0; j<n ; j++) {
                if (i+j == (n-1)/2 || i-j == (n-1)/2 || i+j == (n-1)+(n-1)/2 || j-i == (n-1)/2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }   System.out.println(" "); }  */


     /*   Scanner scan = new Scanner(System.in);
        System.out.println(" Enter the value of n : ");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j <= (n - 1) / 2 || i - j >= (n - 1) / 2 || i + j >= (n - 1) + (n - 1) / 2 || j - i >= (n - 1) / 2) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println(" ");
        } */

        Scanner scan = new Scanner(System.in);
        System.out.println(" Enter the value of n : ");
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j+i >= (n-1)/2 + (n-1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }

            }
            System.out.println(" ");
        }
    }
}

