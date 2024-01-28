// given a number ‘n’, predict whether it is a power of two or not. [medium]
// Input 1: n = 15
// Output 1: False
// Input 2: n = 32
// Output 2: True

import java.util.*;
public class Ques02 {

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

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int x = sc.nextInt();
        String s = convertToBinary(x);

        boolean result= true;
        for(int i = 1 ; i <=  s.length()-1 ; i++){
            if(s.charAt(i) == '0'){
                continue;
            }
            else{
                result = false ;
                break;
            }
        }
        System.out.println(result);
        sc.close();
    }
}
