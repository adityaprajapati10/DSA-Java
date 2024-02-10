// Find the sum of the values of the array [92, 23, 15, -20, 10].
import java.util.*;
public class Ques04 {
    public static int sumOfElement(int arr [] , int i ){
        if(i == arr.length){
            return 0 ;
        }

        else{
            return arr[i]+sumOfElement(arr, i+1);
        }

    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int l = sc.nextInt();
        int arr [] = new int[l];
        System.out.print("Enter the elements of an array: ");
        for(int i = 0 ; i< l ; i++){
            arr[i] = sc.nextInt();
        }
        int result = sumOfElement(arr, 0);
        System.out.println("The sum of the values of the array: "+result);
        sc.close();
    }    

}
