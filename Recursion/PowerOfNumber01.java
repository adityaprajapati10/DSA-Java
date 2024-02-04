// optimize approach 
// time complexity --> O(log b)
// Example = a = 2 , b = 62
// output =  4,611,686,018,427,387,904.

import java.util.*;
public class PowerOfNumber01 {
   public static long powOfNo(long a , long b){
    long result = 0 , finalResult = 0,  mid = 0 ;

     if(b == 1){
        return a ;
    }

    else{
        mid = b/2;
        result = powOfNo(a, mid);
        finalResult = result * result ;

        if(b % 2 == 0){
            return finalResult;
        }

        else{
            
            return a*finalResult;
        }   
    }
   } 

   public static void main(String []args){

    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the vaule of a : ");
    long a = sc.nextLong();
    System.out.print("Enter the vaule of b : ");
    long b = sc.nextLong();

    long result = 0;
    if(b == 0 ){
        result = 1;
    }
    else{
    result = powOfNo(a, b);
    }
    System.out.println("The value of a^b is : "+result);

    sc.close();
   }
}
