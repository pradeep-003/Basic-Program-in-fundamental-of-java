class CalculateAreaOfCircle{
    public static void Calc(int r){
        double area = 3.14 * r * r ;
        System.out.println(area);
    }
}
public class Static {
    public static void main(String[] args) {
        CalculateAreaOfCircle.Calc(4);
    }
}
