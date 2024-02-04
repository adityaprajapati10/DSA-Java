// Brute force Approach 
// Time Complexity -- O(b)

import java.util.*;
public class PowerOfNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();
        int result = a;
        if(b == 0){
            result = 1;
        }
        else{
        for(int i = 1 ; i<b ; i++){
            result *= a;
            }
        }
        System.out.println(result);
        sc.close();
        
    }
}
