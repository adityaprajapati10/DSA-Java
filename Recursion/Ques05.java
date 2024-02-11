//  if the sum of every digit in that number raised to the power of total digits 
//  in that number is equal to the number.Given a number n. Print if it is an armstrong number or not. An armstrong number
//  is a number
// Example : 153 = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153 hence 153 is an armstrong number. (Easy)
// Input1 : 153
// Output1 : Yes
// Input 2 : 134
// Output2 : No
import java.util.*;
public class Ques05 {
    public static int armstrongNumber(int n , int d){
        if(n <= 9){
            return n ;
        }

        else{
           return (int)Math.pow((n%10),3) + armstrongNumber(n/10, d);
        }
    }

    public static void main (String[] args){
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int n = sc.nextInt();
        System.out.print("Enter the number of Digit the number you entered : ");
        int d = sc.nextInt();
        int Result = armstrongNumber(n, d);
        boolean flag ;
        if(n == Result){
            flag = true;
        }
        else{
            flag = false;
        }

        System.out.println(flag);
        sc.close();
    }
}
