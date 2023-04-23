import java.util.Scanner;
public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter a string : ");
        String s1 = scan.next();

        String s2 = "";
    //    s1 = s1.replace(" ","");
        for (int i = s1.length()-1;i>=0;i--){
            s2 = s2 + s1.charAt(i);
        }
        if(s1.equals(s2)){
            System.out.println("The String you've entered is a palindrome");
        }else{
            System.out.println("The String you've entered is not a palindrome");
        }
    }
}
