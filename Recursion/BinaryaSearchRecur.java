// Recurrence relation -->T(n) = T(n/2) + c

// Time Complexity -- > O(log n)
// Space Complexity --> O()

import java.util.*;
public class BinaryaSearchRecur {
    public static int binarySearchByRecursion(int arr[] , int low , int high , int target){
        int mid , result = -1 ;
        while(low <= high){
            mid = low + (high - low)/2 ;

            if( arr[mid] == target){  // Base case condition
                return mid ;
            }

            if (arr[mid] < target){  // condition 2 - right 
                return binarySearchByRecursion(arr, mid+1, high, target);
            }

            else {                  // condition 3 - left 
                return binarySearchByRecursion(arr, low, mid-1, target);
            }
        }
        return result;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array: ");
        int n = sc.nextInt();
        int low =0 ;
        int high = n-1 ;

        int arr[] = new int[n];

        System.out.print("Enter the element of an array: ");
        for(int i = 0 ;  i<n ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target element: ");
        int target = sc.nextInt();

        int result = binarySearchByRecursion(arr, low, high, target);

        if( result == -1){
            System.out.println("Target element not found ..");
        }

        else {
            System.out.println("Target element found at index no: "+result);
        }

        sc.close();
    }
}
