// There are n stairs, a person standing at the bottom wants to reach the top. The person can 
// climb either 1 or 2 stairs at a time. Count the number of ways the person can reach the top.
// Input: n = 4
// Output: 5
// (1, 1, 1, 1), (1, 1, 2), (2, 1, 1), (1, 2, 1), (2, 2)

import java.util.*;
public class CountWays {

    public static int CountNum(int n){
   
        if(n <= 1){
            return n;
        }

        else{
            return  CountNum(n-1) + CountNum(n-2);
        }
        
    }
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Stairs: ");
        int n = sc.nextInt();
        int result = CountNum(n+1);
        System.out.println("The Number of Ways is : "+result);
        sc.close();
    }
}
