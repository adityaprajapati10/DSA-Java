// Given a number, count the number of set bits in that number without using an extra space.
// Note : bit ‘1’ is also known as set bit.

import java.util.*;
public class Ques04 {
    public static int countSetBits(int x){
        int count = 0 ;
        while(x > 0){
            int y = x % 2;
            if(y == 1){
                count++;
            }
            if ( x % 2 != 0){
                x = (x-1)/2;
            }
            else{
                x = x/2 ;
            }
        }
        return count ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        int result = countSetBits(n);
        System.out.println("The number of set bits in number: "+result);
        sc.close();
    }
}
