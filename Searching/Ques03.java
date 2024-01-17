// Given a positive integer num, return true if num is a perfect square or false otherwise.
// Example 1:
// Input: num = 16
// Output: true
// Explanation: We return true because 4 * 4 = 16 and 4 is an integer.
// Example 2:
// Input: num = 14
// Output: false

import java.util.*;
public class Ques03 {
    public static boolean isPerfectSquare(int num){
        int low = 0 , high = num/2 ;
        while(low <= high){
            int mid = low + (high - low)/2;
            int val = mid * mid ;

            if(val == num){
                return true;
            }
            else if (val < num){
                low = mid +1 ;
            }
            else {
                high = mid -1 ;
            }
        }
        return false; 
    }

    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of which you want the square root: ");
        int num = sc.nextInt();

        System.out.println("Entered Number is perfect Square : "+isPerfectSquare(num));
        
        sc.close();
    }
}
