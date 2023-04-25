import java.util.Scanner;
public class Scanning {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = Scan.nextInt();

        System.out.println("The age is : " + age);

        System.out.print("Enter the avg : ");
        double avg = Scan.nextDouble();
        System.out.println("the avg is : "+avg);

        System.out.print("Enter the name : ");
        String name = Scan.next();
        System.out.println("The name is : "+ name);
    }

    }

