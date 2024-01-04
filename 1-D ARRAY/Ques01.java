//WAP to print the sum of all the elements present on even indices in the given array.
import java.util.*;
public class Ques01 {
    public static int sumEven(int array[]){
        int sum = 0;
        for(int i=0 ; i<array.length ; i++){
            if ( i % 2 == 0){
                sum += array[i];
            }
        }
        return sum ;
    }
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array :  ");
        int n = sc.nextInt();
        int array [] = new int[n];
        System.out.print("Enter Array elements :  ");
        for(int i =0 ; i < n; i++){
            array[i] = sc.nextInt();
        }
        // int array [] =  {3,20,4,6,9};
        int result = sumEven(array);
        System.out.println("sum of all elements present on even indices in the array : "+result);
        sc.close();
    }
}
