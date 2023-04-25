 class Hope {
   public int Multiply (int ok[]) {
       int result = 1;
       for (int k : ok) {
           result *= k;

       }
       return result;
   }

}

public class TryIt {
            public static void main(String... args){
        Hope obj = new Hope();
           int result = obj.Multiply(new int[] {5,4,3,2}) ;
                System.out.println(result);
            }

        }

