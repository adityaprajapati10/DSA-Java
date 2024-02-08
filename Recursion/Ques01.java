// Given an integer, find out the sum of its digits using recursion.
// Input: n= 1234
// Output: 10
// Explanation: 1+2+3+4=10

// Recurrence Relation --> T(n) = 

import java.util.*;
public class Ques01 {
 
    public static int SumOfDigit(int x){
       
        if(x <= 9){
            return x ;
        }

        else{
            return  x%10 + SumOfDigit(x/10);
        }
        
    }

    public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        System.out.println("The sum of given numbers digits: "+SumOfDigit(n));
        sc.close();
    }
    
}
