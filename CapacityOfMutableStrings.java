public class CapacityOfMutableStrings {
    public static void main(String[] args) {

     /*          Example 1 

        StringBuilder sb = new StringBuilder();
        System.out.println(sb.capacity()); // default capacity 16
        sb.append("abcdefghijklmnop");
        System.out.println(sb.capacity()); //16
        sb.append("q");
        System.out.println(sb.capacity()); //34
        sb.append("r");
        System.out.println(sb.capacity()); // How many character you can add (34)
        System.out.println(sb.length()); // How many character is present (18)

      */  

        /*          Example 2


        StringBuffer sb2 = new StringBuffer("sachin");
        System.out.println(sb2.capacity()); // 16+6 = 22
        System.out.println(sb2.charAt(1));
        sb2.setCharAt(1,'A'); //sAchin
        System.out.println(sb2);

       */
                  
       /*         Example 3

        StringBuilder sb = new StringBuilder(150);
        System.out.println(sb.capacity()); //150
        sb.append("Hello");
        System.out.println(sb); // Hello
        sb.trimToSize();
        System.out.println(sb.capacity()); // 5
        System.out.println(sb.reverse());  //olleH

        */
    }
}
