// Write a program to sort an array in descending order using bubble sort.
// Input Array {3,5,1,6,0}
// Output Array: {6, 5, 3, 1, 0}

import java.util.*;
public class Ques01 {

    public static void bubbleSort(int arr[]){
        int n = arr.length;
        boolean swapped = false;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n-i-1 ; j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an Array : ");
        int m = sc.nextInt();

        int arr [] = new int[m];

        System.out.print("Enter the element of an Array : ");
        for(int i=0 ; i < m ; i++){
            arr[i] = sc.nextInt();
        }

        bubbleSort(arr);

        System.out.print("The Sorted Array is : ");
        for(int i : arr){
            System.out.print(i + " ");
        }
        sc.close();
    }
}
