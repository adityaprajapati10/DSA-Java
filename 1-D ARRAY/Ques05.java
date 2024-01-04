//Given an array. Find the first peak element in the array.
//A peak element is an element that is greater than its just left and just right neighbor.

import java.util.*;
public class Ques05 {
    public static int peakElement(int arr[]){
        int peak = arr[0] ;
        for(int i = 1 ; i < arr.length-1 ; i++){
            if( arr[i] > arr[i+1] && arr[i] > arr[i-1]){
                if(peak<arr[i])
                    peak=arr[i];
            }
        }
        return peak;
}
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter the size of Array :  ");
            int n = sc.nextInt();
            int array [] = new int[n];
            System.out.print("Enter Array elements :  "); //{1,3,2,6,5} {1,4,7,3,2,6,5}
            for(int i =0 ; i < n; i++){
                array[i] = sc.nextInt();
            }
            System.out.println("Peak element of the Array : "+peakElement(array));
            sc.close();
        }
}
