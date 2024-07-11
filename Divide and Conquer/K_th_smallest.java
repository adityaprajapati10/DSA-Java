// Given an integer array nums and an integer k, return the kth smallest element in the array.
// Note that it is the kth smallest element in the sorted order, not the kth distinct element.
// Can you solve it without sorting?

// Input: nums = {7, 10, 4, 3, 20, 15}, K = 3
// Output: 7

// Recurrence Reln : - below the code ...
// Time Complexity : Best Case - O(n) || Worst Case - O(n^2)
// Space Complexity : O(1) -- no extra space but using stack so O(n);

import java.util.*;
public class K_th_smallest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size : "); // for ex : 6
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array Elements : "); // for ex :{7, 10, 4, 3, 20, 15}, 
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter K value : "); // for ex : 3
        int k = sc.nextInt();
        int ans = SelectionProcedure(arr , 0 , n-1 , k);
        System.out.println("The kth smallest element in array : "+ans);
        sc.close();
    }
    public static int SelectionProcedure(int[] arr , int l , int h , int k){
        if(l<=h){
            int mid = partition(arr ,  l ,  h);
            if(mid == k-1){
                return arr[mid];
            }
            else if(mid < k-1){
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
//                 |   n+T(m-l)            |  // may left side
//                 -------------------------

