import java.util.*;
public class quick {
    // Function of the quick Sort algo
    public static void quickSort(int[] arr , int l , int h){
        if(l<h){
            // 1. Divide the Array into two subproblem 
            int m = partition(arr, l ,h);
            // 2. Conqure the subproblem via the recurssion
            quickSort(arr , l , m-1);
            quickSort(arr, m+1, h);
        }
    }


    // Function to do the partition of an Array
    public static int partition(int[] arr , int l , int h){
        int pivot = arr[l];
        int i = l ;
        for(int j = l+1 ; j<=h ; j++){
            if(arr[j] <= pivot){
                i++;
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[l] and arr[i] 
        // to get the correct position of the pivot element 
        int temp = arr[l];
        arr[l] = arr[i];
        arr[i] = temp;

        return i;
    }
    // Function to display the array
    public static void printArray(int[] arr , int n){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size : ");
        int s = sc.nextInt();
        int arr[] = new int[s];
        System.out.println("Enter Array Elements : ");
        for(int i = 0 ; i < s ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Array before Sorting : ");
        printArray(arr,s);

        quickSort(arr , 0 , s-1);

        System.out.println("Array after Sorting : ");
        printArray(arr,s);

        sc.close();
    }
}
// Recurrence Relation : T(m - l) + T(h - m) + n
//                   left Sub Array + Right Sub Array + partition algo

// Best case Complexity : In a best case after first iteration the pivot element become mid 
//                        elemet of an array that divide array into two parts
//          Recurrence Relation : T(n) = T(n/2) + T(n/2) + n
//          Time Complexity : O(n log n)
//          Space Complexity : O(n)

// Worst case Complexity : In worst case array is partially sorted
//          Recurrence Relation : T(n) = T(n-1) + n  
//          Time Complexity : O(n^2)
//          Space Complexity : O(n)

// NOTE : USE THIS ALGO WHEN THE ARRAY IS HIGHLY UNSORTED 
