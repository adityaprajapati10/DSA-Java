import java.math.*;
import java.util.*;
public class PowerOfBigNum{

    public static BigInteger powOfBigNum(BigInteger a , int  b)
    {
        BigInteger Result , finalResult ;
        if( b == 1 ){
            return a ;
        }

        else {
            Result = powOfBigNum(a, b/2);
            finalResult = Result.multiply(Result) ;

            if( b % 2 == 0 ){
                return finalResult ;
            }

            else{
                return a.multiply(finalResult) ;
            }
        }
    }
    public static void main(String [] args){
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the value of a : ");
        BigInteger a = sc.nextBigInteger();
        System.out.print("Enter the value of b : ");
        int b = sc.nextInt();
        BigInteger result = powOfBigNum(a,b);
        System.out.println("The value of a^b is : "+result);
        sc.close();

    }
}