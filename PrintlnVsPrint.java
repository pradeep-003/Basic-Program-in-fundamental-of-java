import java.util.Scanner;
public class PrintlnVsPrint {
    public static void main(String[] args) {
      /*  Scanner scan = new Scanner(System.in);
        System.out.print("Enter the value of no :");
        int val = scan.nextInt(); */
     /* if ( i%2 == 0 & i%3 == 0 ){
          System.out.println(i);
       }else{
          System.out.println("invalid input");
      } */

      /* String message = ( val % 2 == 1) ? "Value entered is odd": "Value entered is even" ;
        System.out.println(message);  */

     /*   for (int i =1; i<=100;i++ ){
            if(i%3==0&&i%5==0){
                System.out.println("FizzBuzz");
            } else if (i%5==0) {
                System.out.println("Buzz");
            } else if (i%3==0) {
                System.out.println("Fizz");
            }else {
                System.out.println(i);
            }

        }*/

     /*   for (int i = 1; i <= 100; i++) {
            String message = i % 3 == 0 ? (i % 5 == 0 ? "FizzBuzz" : "Fizz") : (i % 5 == 0 ? "Buzz" : Integer.toString(i));
            System.out.println(message);
        }        */

        double base = 2;
        double exponent = 3;
        double result = Math.pow(3,3);
        System.out.println(result); // Output: 8.0


    }
}
