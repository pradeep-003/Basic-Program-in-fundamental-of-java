import java.util.*;
public class RemoveDuplicates {
        public static void main(String[] args) {
            boolean flag = false ;
            Scanner scan = new Scanner(System.in);
            System.out.print("Enter a String : ");
            String s1 = scan.next();
            s1 = s1.toUpperCase();
            s1 = s1.replace(" ","");
            char ch[] = s1.toCharArray();
            int ar[ ] = new int[256];
            for (int i = 0 ; i < s1.length() ; i++){
               ar[ch[i]]++;
          }

            for ( int i = 0 ; i < ar.length; i++){
                if (ar[i] > 1) {
                    System.out.println("String not contain all unique character ");

                  flag = true ;
                  break;
                }
            } if (flag == false ){
                System.out.println("String contain all unique character ");
            }
        }
    }
