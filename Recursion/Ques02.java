// Given a number n. Find the sum of natural numbers till n but with alternate signs.
// That means if n = 5 then you have to return 1-2+3-4+5 = 3 as your answer.
// Constraints : 0<=n<=1e6
// Input1 : n = 10
// Output 1 : -5
// Explanation : 1-2+3-4+5-6+7-8+9-10 = -5
// Input 2 : n = 5
// Output 2 : 3

import java.util.*;
public class Ques02 {

    public static int SumAlternateSign(int n){
        if(n <= 1){
            return n;
        }

        else{
            if(n%2 == 0){
                return -n+SumAlternateSign(n-1);
            }
            else{
                return n+SumAlternateSign(n-1);
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int result = SumAlternateSign(n);
        System.out.println("Sum of natural numbers till given no. with alternate signs: "+result);
        sc.close();
    }
}
