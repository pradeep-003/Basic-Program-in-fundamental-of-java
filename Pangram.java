public class Pangram {
    public static void main(String[] args) {
        boolean flag = false ;
        String str = "the quick brown fox jumps over lazy dog";
            str = str.toUpperCase();
        System.out.println(str);
      str = str.replace(" ","");
        char ch[] = str.toCharArray();
        int ar[] = new int[26];

        for(int i = 0;i<ch.length;i++)
        {
            ar[ch[i]-65]++;
        }
        for(int i = 0 ; i < ar.length ; i++)
        {
            if (ar[i] == 0)
            {
                System.out.println("it's not pangram");
                flag = true;
            }
        }
        if(flag == false)
        {
            System.out.println("it's pangram");
        }
    }
}
