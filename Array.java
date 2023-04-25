import java.util.Scanner;

class Calc {
    public int add(int ok[]){
      int result = 0 ;
      for ( int n:ok){
          result = result + n ;
      }
      return result;
    }
}
public class Array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
       // int nums[] = {5,7,3,6};
       // int a = 8;
      //  System.out.println(nums[0]);
      //  System.out.println(nums[1]);
       //  System.out.println(nums[2]);
       // System.out.println(nums[3]);

      /*  int nums[] = new int[4];
        nums[0] = 5;
        nums[1] = 7;
        System.out.println("Enter the value of num[2]: ");
        nums[2] = scan.nextInt();
      //  nums[3] = 6;
       for(int i =0 ; i < 4 ; i++){
           System.out.println(nums[i]);
         } */
    /*    int nums[][]= new int[3][4];
        System.out.print("Enter The value of num[2][3]: ");
        nums[2][3]= scan.nextInt();
        nums[1][1]=2;
        nums[0][1]=4;
       for(int i=0;i<3;i++){
           for (int j=0;j<4;j++){
               System.out.print(nums[i][j] + " ");
           }
           System.out.println();
       }          */

      /*  int nums[][] =
                {
                        {5,2},
                        {4,3},
                        {9,4}
                 };
        for(int i=0;i<3;i++){
            for (int j=0;j<2;j++){
                System.out.print(nums[i][j] + " ");
            }
                System.out.println();
        }     */

      /*  int nums[][] =
                {
                        {5,2,4,7},
                        {4,3},
                        {9,4,6}
                };
        for(int i=0;i<3;i++){
            for (int j=0;j<nums[i].length;j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }          */

     /*   int nums[][] = new int[3][];
        nums[0]=new int[4];
        nums[1]=new int[2];
        nums[2]=new int[3];
        nums[2][2]=3;
        nums[1][1]=3;
        nums[0][3]=3;
        for(int i=0;i<3;i++){
            for (int j=0;j< nums[i].length;j++){
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
        }       */

     /*   int nums[] = {5,7,3,6};
        for(int n:nums){
            System.out.println(n);
        } */
    /*    int nums[][] =
                {
                        {5,4,5},
                        {4,3,4,6},
                        {9,4,5,3,7}
                };
        for(int a[]:nums){
           for (int b : a){
               System.out.print(b + " ");
           }
            System.out.println();
        } */
      /*  int cash[] = {5,4,3,7};
        System.out.println(cash[0]);
        System.out.println(cash[1]);
        System.out.println(cash[2]);
        System.out.println(cash[3]); */
       /*  String names = "Navin";
        System.out.println(names.length()); */
           Calc obj = new Calc();
          // int nums[] = {5,4,3,2,1,0,9,8,7,6};
         int result =  obj.add(new int[]{5,4,3,2,1,0,9,8,7,6});
        System.out.println(result);

    }
}
