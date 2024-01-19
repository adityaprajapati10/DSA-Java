// time complexity: O(n ^ 2)
// space complexity: O(1)

import java.util.*;
public class BubbleSort {

    public static void bubbleSort(int array[]){
       
        for(int i = 0 ; i< array.length ; i++){
            boolean Swapped = false;
             // for every iteration, we get the biggest element in an array in the end
            for(int j = 0 ; j < array.length-i-1 ; j++){
                if(array[j] > array[j+1]){
                    // int temp = array[j];
                    // array[j] = array[j+1];
                    // array[j+1] = temp ;
                    // Swapped = true ;
                    array[j] = array[j] + array[j+1];
                    array[j+1] = array[j] - array[j+1];
                    array[j] = array[j] - array[j+1];
                    Swapped = true;
                }
            }
            
            if(!Swapped){
                break;
            }
        }
        

    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an Array: ");
        int n = sc.nextInt();

        int arr []= new int [n];
        System.out.print("Enter the element of Array : ");
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        bubbleSort(arr);
        System.out.print("The sorted Array : ");
        for(int i : arr){
            System.out.print(i + " ");
        }
        sc.close();
    }
}
