import java.util.Scanner;


public class Ittration {
    public static void main(String[] args) {
     //  int s;
       Scanner scan = new Scanner(System.in);
      /*  System.out.print("Enter the value of n : ");
        int n = scan.nextInt();
        int f = 0 ; int k = 0;

       for ( ; f<=n ;f++){
           int sol = f + k ;
           k = sol ;

             if (f>=n){
           System.out.print("The sum of first n natural no. is : " + sol);
              }

       }
        System.out.println();

        int i = 1; int j = 0;
        while(i<=n){


           int res =  i+j;
           j = res;
            i++;


        if (i>n){
        System.out.print("The sum of first n natural no. is : " + res );}
    }    */
     // int j = 1%5 ;
       // System.out.println(j);
       /*System.out.println("Get the first natural no. which is multiple of n1 & n2 ");
        System.out.println("Enter the value of n1");
        int n1 = scan.nextInt();
        System.out.println("Enter the value of n2");
        int n2 = scan.nextInt();
        for (int i = 1 ;  ;i++){
          if  ( i%n1 ==0 && i % n2 == 0 ){
            System.out.println(i + " is the first natural number which is divisible by both n1 & n2 ");
          break;}
        }*/

      // int n = scan.nextInt();
         for (int n = 1 ; n <= 100 ; n++ )  {
         for( int i = 2 ;i<n;i++)  { while (n%i == 0 ) {
             System.out.println(n + "non prime");
             break;
         }
            if (n%i == 0 )  { break;}
       }
        for( int j = 2 ;j<n;j++)  { while (n%j != 0) {  System.out.println(n + " prime number ");
                 break;      };
                   break;
        }
    }  }

                 }

