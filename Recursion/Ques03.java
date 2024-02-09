// Print the max value of the array [ 13, 1, -3, 22, 5].
import java.util.*;
public class Ques03 {
    public static int getMaxElement(int arr[] , int i,int max){
        if(i == arr.length-1){
            return max;
        }

        else{
            if(arr[i]>max)
                return getMaxElement(arr,i+1,arr[i]);

            else
                return getMaxElement(arr,i+1,max);
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
        int result = getMaxElement(arr, 0,arr[0]);
        System.out.println("the max value of the array: "+result);
        sc.close();
    }
}
