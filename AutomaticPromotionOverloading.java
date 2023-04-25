class Calc{
  //  public void box(byte n1){
  //  System.out.println("byte"+n1);
   //     }
  //  public void box(long n1){
  //      System.out.println("long"+n1);
   // }
   // public void box(short n1){
    //    System.out.println("short"+n1);
   // }
  //  public void box(char n1){
  //      System.out.println("char"+n1);
   // }
  //  public void box(int n1){
                                                        
    //     System.out.println("int"+n1);                            public void box(double n1){
        System.out.println("double"+n1);
    }
    public void box(float n1){
        System.out.println("float"+n1);
    }
}
public class AutomaticPromotionOverloading {
    public static void main(String[] args) {
        Calc obj = new Calc();

        obj.box('A') ;   }
}
