// Given an array of integers. Find the Inversion Count in the array.  Two array elements arr[i] and arr[j] form an inversion if arr[i] > arr[j] and i < j.

// input : 70,50,60,10,20,30,80,15
// ouput : 17

// Approach:- Merge Sort Like Approach
// Recurrence Reln : - 2T(n/2) + n
// Time Complexity : - O(n log n)
// Space Complexity : - O(n log n)

import java.util.*;  
public class InversionCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size : ");// for ex : 8
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array Elements : ");// for ex:{70,50,60,10,20,30,80,15}
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        int count = inversionsInArray(arr, 0, n-1);
        System.out.println("Total number of inversion in Array: " +count);
        sc.close();
    }
    public static int inversionsInArray(int[] arr , int l , int h){
        int count = 0;
        if(l < h){
            int mid = l+(h-l)/2;                     // 1. Divide the Array in Sub Problem
            count += inversionsInArray(arr,l,mid);   // 2. Conqure the array via recursion T(n/2)
            count += inversionsInArray(arr,mid+1,h); // 2. Conqure the array via recursion T(n/2)
            count += mergeProcedure(arr,l,mid,h);    // 3. Combine  
        }
        return count;
    }
    public static int mergeProcedure(int[] arr , int l , int mid , int h){
        int swap = 0;
        int[] leftSub = Arrays.copyOfRange(arr, l, mid+1); 
        int[] rightSub = Arrays.copyOfRange(arr, mid+1, h+1);

        int i = 0 , j = 0 , k = l;
        while(i < leftSub.length && j < rightSub.length){
            if(leftSub[i] <= rightSub[j]){
                arr[k++] = leftSub[i++];
            }
            else{
                arr[k++] = rightSub[j++];
                swap += leftSub.length - i;
            }
        }
        while(i<leftSub.length){
            arr[k++] = leftSub[i++];
        }
        while(j<rightSub.length){
            arr[k++] = rightSub[j++];
        }
        return swap;
    }
}
