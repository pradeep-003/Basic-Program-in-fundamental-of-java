import java.util.Scanner;
public class SortingString {
    public static void main(String[] args) {
        System.out.print("Enter a String : ");
        Scanner scan = new Scanner(System.in);
        String s1 = scan.nextLine();

        char[]  arr = s1.toCharArray();
        char temp ;
        for (int i = 0 ; i < arr.length ; i ++){
            for (int j = i + 1 ; j < arr.length ; j++ ){
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(new String(arr));
    }
}
