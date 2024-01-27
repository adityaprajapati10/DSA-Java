// given a number, print its binary representation. [easy]
// Input 1: number = 5
// Output 1: 101
// Input 2: number = 10
// Output 2: 1010

// time complexity of this code is --- O(log x)
import java.util.*;
public class Ques01{

    public static String convertToBinary(int x){
        String str = "";
        String str1 = "";
       
        while(x > 0){
            int y = x % 2;
            str += y ;
            y = 0 ;
            if ( x % 2 != 0){
                x = (x-1)/2;
            }
            else{
                x = x/2 ;
            }
        }
        
        for(int i = (str.length()-1) ; i>=0 ; i--){
           str1 += str.charAt(i); 
        }
        return str1;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number you want to convert in Binary: ");
        int x = sc.nextInt();
        String result = convertToBinary(x);
        int i = Integer.valueOf(result); /// Converting String to integer
        System.out.println("The Binary Representation of given number : "+ i);
    
        sc.close();
    }
}