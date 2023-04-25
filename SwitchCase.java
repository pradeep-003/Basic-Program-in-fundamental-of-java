import java.util.Scanner;
public class SwitchCase {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
      /*  System.out.println("Enter the value of dayOfWeek : ");
        int dayOfWeek = scan.nextInt();
        String dayName;

        switch (dayOfWeek) {
            case 1:
                dayName = "Sunday";
                break;
            case 2:
                dayName = "Monday";
                break;
            case 3:
                dayName = "Tuesday";
                break;
            case 4:
                dayName = "Wednesday";
                break;
            case 5:
                dayName = "Thursday";
                break;
            case 6:
                dayName = "Friday";
                break;
            case 7:
                dayName = "Saturday";
                break;
            default:
                dayName = "Invalid day";
                break;
        }

        System.out.println(dayName); // Output: "Tuesday"  */

   /*   String vw = "vowel" ;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = input.next().charAt(0);


      switch (ch){
          case 'a':
              System.out.println(vw);
              break;
          case 'e':
              System.out.println(vw);
              break;
          case 'i':
              System.out.println(vw);
              break;
          case 'o':
              System.out.println(vw);
              break;
          case 'u':
              System.out.println(vw);
              break;
          default:
              System.out.println("consonant");
      }   */

       /* System.out.print("Enter first no: " );
        int a = scan.nextInt();
        System.out.print("Enter second no: " );
        int b = scan.nextInt();
        System.out.print("choose what you want to do from +,-,*,/.% :  ");
        char ch = scan.next().charAt(0);
        switch (ch){
            case '+' :
                System.out.println(a+b);
                break;
            case '-' :
                System.out.println(a-b);
                break;
            case '*' :
                System.out.println(a*b);
                break;
            case '/' :
                System.out.println(a/b);
                break;
            case '%' :
                System.out.println(a%b);
                break;
            default :
                System.out.println("invalid character");
        } */

           /*     Scanner input = new Scanner(System.in);
                System.out.print("Enter a character: ");
                char ch = input.next().charAt(0);
                input.close();

                switch(ch) {
                    case 'a':
                    case 'b':
                    case 'c':
                    case 'd':
                    case 'e':
                    case 'f':
                    case 'g':
                    case 'h':
                    case 'i':
                    case 'j':
                    case 'k':
                    case 'l':
                    case 'm':
                    case 'n':
                    case 'o':
                    case 'p':
                    case 'q':
                    case 'r':
                    case 's':
                    case 't':
                    case 'u':
                    case 'v':
                    case 'w':
                    case 'x':
                    case 'y':
                    case 'z':
                        System.out.println("The character is a lowercase letter.");
                        break;
                    case 'A':
                    case 'B':
                    case 'C':
                    case 'D':
                    case 'E':
                    case 'F':
                    case 'G':
                    case 'H':
                    case 'I':
                    case 'J':
                    case 'K':
                    case 'L':
                    case 'M':
                    case 'N':
                    case 'O':
                    case 'P':
                    case 'Q':
                    case 'R':
                    case 'S':
                    case 'T':
                    case 'U':
                    case 'V':
                    case 'W':
                    case 'X':
                    case 'Y':
                    case 'Z':
                        System.out.println("The character is an uppercase letter.");
                        break;
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                        System.out.println("The character is a digit.");
                        break;
                    default:
                        System.out.println("The character is not a letter or a digit.");
                }     */

                                  // WRONG

    /*    System.out.println("Enter the value of i : ");
        int i = scan.nextInt();

        switch (i%4){
            case 0 :
                System.out.println("Leapyear");
                break;
            default:
                System.out.println("not a leap year");
        }  */

                                    // WRONG

                Scanner input = new Scanner(System.in);
                System.out.print("Enter a year: ");
                int year = input.nextInt();
                input.close();

                boolean isLeap = false;

                switch(year % 4) {
                    case 0:
                        if (year % 100 == 0) {
                            if (year % 400 == 0) {
                                isLeap = true;
                            }
                        } else {
                            isLeap = true;
                        }
                        break;
                    default:
                        isLeap = false;
                }

                if (isLeap) {
                    System.out.println(year + " is a leap year.");
                } else {
                    System.out.println(year + " is not a leap year.");
                }
            }
        }





