import java.util.Scanner;
public class MaxOccurringElementInString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a string : ");
        String s1 = scan.nextLine();
            s1 = s1.replace(" ", "");
      char c[] =   s1.toCharArray();
        int arr[] = new int[256];
        for (int i = 0 ; i < s1.length();i++){
            arr[c[i]]++;
        }
        int max = -1 ;
        char ch = ' ' ;
        for (int i = 0 ; i<s1.length() ; i++){
            if(max < arr[c[i]]){
                max = arr[c[i]] ;
                ch = c[i];
            }
        }
        System.out.println("The maximum no. of occurring character is : " + ch);
        System.out.println("Number of maximum no. of occurring character is : " + max);

    }
}
