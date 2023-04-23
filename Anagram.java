import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

               /* Example 1 */

      //  String s1 = "School Master";
        //  String s2 = "The ClassRoom   ";

               /* Example 2 */

    //    String s1 = "keep";
      //   String s2 = "peek  ";

             /* Example 3 */

        String s1 = "Hyder";
        String s2 = "java";

        s1 = s1.replace(" ","");
        s2 = s2.replace(" ","");

        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        char []ar1=s1.toCharArray();
        char []ar2=s2.toCharArray();

        Arrays.sort(ar1);
        Arrays.sort(ar2);

        if (Arrays.equals(ar1,ar2))
        {
            System.out.println("It's an Anagram");
        }else{
            System.out.println("It's not an Anagram");
        }
    }
}
