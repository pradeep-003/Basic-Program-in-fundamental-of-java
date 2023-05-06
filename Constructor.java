class Semo{
    private int a ;
    private int b ;
    void disp()
    {
        System.out.println(a);
        System.out.println(b);
    }
   
     Semo(int i){
        this();
        System.out.println(i);
        System.out.println("control in parametrized constructor ");
        disp();
    }
    Semo(){
        System.out.println("control in DeParametrized constructor ");
    }
}
public class Constructor {
    public static void main(String[] args) {
        Semo d = new Semo(5);
    }
}
