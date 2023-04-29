// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

import java.util.Scanner;

public class Problem1 {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int []nums = new int[4];
            System.out.println("Enter the value of Array");
            nums[0] = scan.nextInt();
            nums[1] = scan.nextInt();
            nums[2] = scan.nextInt();
            nums[3] = scan.nextInt();

            System.out.println("Enter your Target ");
            int target = scan.nextInt();

            for (int k = 0 ; k < nums.length ; k++){
                for (int j = 0 ; j < nums.length ; j++){
                    if (k != j ){
                        if(nums[k] + nums[j] == target){
                            System.out.println("[" + k + " " + j + "]");
                        }
                    }
                }
            }
        }
}

