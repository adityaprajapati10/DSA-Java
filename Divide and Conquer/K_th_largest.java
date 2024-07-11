// Given an integer array nums and an integer k, return the kth largest element in the array.
// Note that it is the kth largest element in the sorted order, not the kth distinct element.
// Can you solve it without sorting?

// Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
// Output: 4

// Recurrence Reln : - below the code ...
// Time Complexity : Best Case - O(n) || Worst Case - O(n^2)
// Space Complexity : O(1) -- no extra space but using stack so O(n);

import java.util.*;
public class K_th_largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size : "); // for ex : 9
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array Elements : "); // for ex :[3,2,3,1,2,4,5,5,6]
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter K value : "); // for ex : 4
        int k = sc.nextInt();
        int ans = SelectionProcedure(arr , 0 , n-1 , n-k);
        System.out.println("The kth largest element in array : "+ans);
        sc.close();
    }
    public static int SelectionProcedure(int[] arr , int l , int h , int k){
        if(l<=h){
            int mid = partition(arr ,  l ,  h);
            if(mid == k){
                return arr[mid];
            }
            else if(mid < k){
                return SelectionProcedure(arr , mid+1 , h , k);
            }
            else{
                return SelectionProcedure(arr , l , mid-1 , k);
            }
        }
        return -1;
    }
    public static int partition(int[] arr , int l ,int h){
        int pivot = arr[l];
        int i = l;
        for(int j = i+1 ; j<=h ; j++){
            if(arr[j] <= pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[l];
        arr[l] = arr[i];
        arr[i] = temp;
        return i;
    }
}

// Recurrence Relation:-
//                 -------------------------
//                 |   1             n = 1 |
// T(n)   ---------{                       |
//                 |   n+T(h-m)      n > 1 |  // may right side
//                 |       OR              |
//                 |   n+T(n-l)            |  // may left side
//                 -------------------------

