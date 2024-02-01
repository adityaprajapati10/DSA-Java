// Time Complexity --> O(n)
// Space Complexity --> O(n)

import java.util.Scanner;
public class FactorialNum{

    public static int factorial(int n){
        int result = 0 ;
        if( n == 0 || n == 1){ //Base Case Condition
            return 1 ;
        }

        else{
            result = n * factorial(n-1); //recursive call
        }
        return result;
    }

    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println("The Factorial of a entered number is: "+factorial(n));
        sc.close();
    }
}