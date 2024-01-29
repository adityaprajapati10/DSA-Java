// Approach 
// We know that any odd number in its binary representation has the last digit (from right) as 1
// We used that concept and simply used the AND operator and operated the given number with 1
// We know the binary representation of 1 is also 1 and if the result of AND operator is 1,we
// can be sure that the given number is also odd since AND only returns 1 when both the operating
// bits are 1.

// Time Complexity --> O(1)

import java.util.*;
public class Ques03Optimize {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n ;
        System.out.print("Enter a number:- ");
        n = sc.nextInt();
        
        if((n & 1)==1){
            System.out.println("Given number is odd.");
        }
        else{
            System.out.println("Given number is Even.");
        }
        sc.close();
    }
}
