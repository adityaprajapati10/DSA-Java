import java.util.*;
public class SquareRoot {
     public static int GetSquareRoot(int num){
        int low = 0 , high = num/2 , result = -1 ;
        if(num == 1){
            return 1 ;
        }
        while(low <= high){
            int mid = low + (high - low)/2;
            int val = mid * mid ;

            if(val == num){
                return mid;
            }

            else if (val < num){
                // store the floor value, incase the number is not perfect square root, 
                //we can print the floor value
                result = mid ;
                low = mid +1 ;
            }

            else {
                high = mid -1 ;
            }
        }
        return result ;
     }
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of which you want the square root: ");
        int num = sc.nextInt();

        int result = GetSquareRoot(num);
        System.out.println("Square root of the given number is: "+result);
        sc.close();
    }
}
