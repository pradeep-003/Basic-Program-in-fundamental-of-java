import java.util.Scanner;

public class PatternProgramming {
    public static void main(String[] args) {
        /* pattern ****
         ****
         ****
         **** */
        /*  for (int p = 1; p<5 ;p++)   { for (int i = 1 ; i<5 ; i++) {
          System.out.print("*");
      }
         System.out.println();} */


      /* int n = 12;
        for (int p = 0; p<n ;p++)   { for (int i = 0 ; i<n ; i++) {
            System.out.print("* ");
        }
            System.out.println();} */

        /* for this pattern
         * * * * *
         *       *
         *       *
         *       *
         * * * * *

         */


      /*  int n = 5;
        for (int i =0 ; i < n ; i++){
            for (int j = 0 ;j<n;j++ ){
                if(i==0||i==n-1||j==0||j==n-1){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        } */

      /*  int n = 8 ;
          for (int i =0 ; i < n ; i++){
            for (int j = 0 ;j<n;j++ ){
                if(i==0||i==(n-1)/2||j==0){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println(); */
        Scanner scan = new Scanner(System.in);
      int n = scan.nextInt();
        for (int i=1;i<101;i++){
            if (i%n == 0 )
            System.out.println(i);
            }
        }

    }
