// Recurrence Relation : 2T(n/2) + n 
// Time Complexity : O(n log n)
// Space Complexity : O(n)

import java.util.*;
public class merge{
    // function to do mergesort
    public static void mergeSort(int arr[], int L , int R){
        if(L<R){
            // 1. Divide the array into various subproblems
            int mid = L+(R-L)/2;

            // 2. Conquer the subproblems via the recursion
            // left subarray - recursive call
            mergeSort(arr, L, mid);
            // right subarray - recursive call
            mergeSort(arr, mid+1, R);

            // 3. Combine - mergeProcedure
            mergeProcedure(arr, L, mid, R);

        }
    }

    // function to do the combine task by mergeProcedure
    public static void mergeProcedure(int[] arr, int L, int mid, int R){  // L - left || R - right
        int i,j,k;

        // size of the subarrays 
        int n1 = mid - L + 1 ;
        int n2 = R - mid ;

        // create left and right subarray
        int LSubarray[] = new int[n1];
        int RSubarray[] = new int[n2];
        
        // copy the data into the left and right subarrays
        for(i = 0 ; i<n1 ; i++){
            LSubarray[i] = arr[L+i];
        }

        for(j = 0 ; j<n2 ; j++){
            RSubarray[j] = arr[mid + 1 + j];
        }

        // comparison between the elements in left and right subarray
        i=0;
        j=0;
        k=L;

        while(i < n1 && j < n2){
            if(LSubarray[i] <= RSubarray[j]){
                arr[k] = LSubarray[i];
                i = i+1;
            }
            else{
                arr[k] = RSubarray[j];
                j = j + 1;
            }
            k = k + 1;
        }

        // copy the remaining elements from left subarray
        while(i < n1){
            arr[k] = LSubarray[i];
            i = i+1;
            k = k+1;
        }

        // copy the remaining elements from right subarray
        while(j < n2){
            arr[k] = RSubarray[j];
            j = j + 1;
            k = k +1;
        }
    }

    // to display array
    public static void printArray(int[] arr , int n){
        for(int i = 0 ; i<n ; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
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
        mergeSort(arr,0, s-1);

        System.out.println("Array after Sorting : ");
        printArray(arr,s);
        sc.close();
    }
}