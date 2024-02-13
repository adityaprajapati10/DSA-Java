// Given a board of size " 2 by n" and tile of size " 2 by 1" , count the number of ways 
// to tile the given board .

import java.util.*;
public class TilingProblem{

    public static int getWays(int n){

        // Base case Condition 
        if(n <= 3){
            return n ;
        }

        // Recursive call 
        else{
            return getWays(n-1) + getWays(n-2);
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Given a board of size '2 by n' ");
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.println("Total number of ways to tile the given board: "+getWays(n));
        sc.close();
    }
}