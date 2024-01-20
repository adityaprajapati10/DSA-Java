// Time Complexity --> O(n^2)
// Space Complexity -> O(1)

import java.util.*;
public class SelectionSort {

    public static void selectionSort(int arr []){
        for(int i = 0 ; i < arr.length ; i++){
            // mid_idx is taking the index of minimum element at every iteration..
            int min_idx = i ;
            for(int j = i+1 ; j < arr.length ; j++){
                if(arr[j] < arr[min_idx]){
                    min_idx  = j;
                }
            


                if(min_idx != i){
                    // Swap between arr[i] & arr[mid_idx]
                    // int  temp = arr[i];
                    // arr[i] = arr[min_idx];
                    // arr[min_idx] = temp;
                    arr[j] = arr[j] + arr[j+1];
                    arr[j+1] = arr[j] - arr[j+1];
                    arr[j] = arr[j] - arr[j+1];
                }
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

            selectionSort(arr);
            System.out.print("The Sorted Array is : ");
            for(int i : arr){
                System.out.print(i + " ");
            }

        sc.close();
    }
}
