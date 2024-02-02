// time complexity --> O(2^n)
// space complexity --> O(n)

import java.util.Scanner;
public class FibonacciNo {
    
    public static int fibonacci(int n){
        int result = 0 ;
        if( n == 0 || n == 1){ //Base Case Condition
            return n ;
        }

        else{                   // Recursive call
            result = fibonacci(n-1) + fibonacci(n-2);
        }

        return result;
    }
    public static void main(String args []){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the nth number in fibonacci series: ");
        int n = sc.nextInt();
        int result = fibonacci(n);
        System.out.println("The result of nth fibonacci number is: "+result);
        sc.close();
    }
}
