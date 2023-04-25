public class Spring {
    public static void main(String[] args) {

        // case 1
       /* String str1 = "pwjava";
        String str2 = "";
        for(int i= str1.length()-1 ; i>=0;i--){
            str2 = str2 + str1.charAt(i) ;
        }
        System.out.println(str2); */

        //case 2
      /*  String str1 = "pwskill java";
        String str2 = "";
        String sarr[] = str1.split(" ");
        for(int i = sarr.length-1 ;i>=0 ; i-- ){
            str2 += sarr[i] + " ";
        }
        System.out.println(str2);   */

                     //case 3
     /*   String s1 = "pwskill java";
        String s2 = "";
      for (int i = s1.length()-1 ; i>=0 ; i-- ){
          s2 += s1.charAt(i);
      }
        System.out.println(s2); */

        // case 4

        String str1 = "PWskill java";
        String str2 = "";
        String arr[] = str1.split(" ");
      for( String elem:arr){
          for(int i = elem.length()-1;i>=0 ; i--){
              str2 = str2 + elem.charAt(i);
          }
              str2 = str2 + " ";
      }
        System.out.println("before reversing : "+ str1);
        System.out.println("After reversing : "+str2);
    }
}
