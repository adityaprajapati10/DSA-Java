// Time Complexity --> O(n^2)
// Space Complexity -> O(1)

import java.util.*;
public class InsertionSort {

    public static void insertionSort(int arr[]){
        for(int i = 1 ; i < arr.length ; i++){
            int j = i ;
            while(j>0 && arr[j] < arr[j-1]){
                //Swap btwn arr[j] and arr[j-1]
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j-- ;
            }
        }
    }
   public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the size of an Array: ");
        int n = sc.nextInt();

        int arr []= new int [n];
        System.out.print("Enter the element of Array : ");
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        insertionSort(arr);
        System.out.print("The Sorted Array is : ");
        for(int i : arr){
            System.out.print(i + " ");
        }
        sc.close();
   } 
}
