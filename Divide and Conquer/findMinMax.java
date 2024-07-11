// Given an array of integers. Find the minimum and maximum in the array without sorting the array.

// input : 50,15,11,19,15,75,89,97
// ouput : min:- 9 , max:- 97

// Approach -- mergeSort like Approach
// Time Coplexity :- O(n);
// Space Complexity :- O(log n) bcoz of stack space

import java.util.Scanner;
public class findMinMax {
    static class Pair{
        int min;
        int max;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size : "); // for ex : 8
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter Array Elements : "); // for ex :{50,15,11,19,15,75,89,97}
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        Pair minMax = getMinMax(arr, 0, n-1); // calling getMinMax function
        System.out.println("Minimum elements : "+ minMax.min); // min : 9
        System.out.println("Maximum elements : "+ minMax.max); // max : 97
        sc.close();
    }
    public static Pair getMinMax(int[] arr , int i , int j){
        Pair minMax = new Pair();
        Pair minMaxLeft = new Pair();
        Pair minMaxRight = new Pair();
        // 1. small problem
        // if Arrays length equals to 1;
        if(i == j){
            minMax.min = arr[i];
            minMax.max = arr[i];
        }
        // if Arrays length equals to 2;
        else if(i == j-1){
            if(arr[i] > arr[j]){
                minMax.min = arr[j];
                minMax.max = arr[i];
            }
            else{
                minMax.min = arr[i];
                minMax.max = arr[j];
            }
        }
        // 2. Big Problem (Array length > 2)
        else{
            int mid = i + (j - i)/2;                // i)Divide the problem in to small problem (c)
            minMaxLeft = getMinMax(arr, i, mid);    // ii)Conqure - left Side Subtree - (T(n/2))
            minMaxRight = getMinMax(arr, mid+1, j); // ii)Conqure - right Side Subtree - (T(n/2))
            // iii) combine(c)
            // Compare the minimum value of left and right
            if(minMaxLeft.min < minMaxRight.min){
                minMax.min = minMaxLeft.min;
            }
            else{
                minMax.min = minMaxRight.min;
            }
            // Compare the maximum value of left and right
            if(minMaxLeft.max < minMaxRight.max){
                minMax.max = minMaxRight.max;
            }
            else{
                minMax.max = minMaxLeft.max;
            }
        }
        return minMax;
    }
}

// Recurrence Relation:-
//                 -------------------------
//                 |   C             n<= 2 |
// T(n)   ---------{                       |
//                 |   2T(n/2) + C   n > 2 |  // a = 2 , b = 2
//                 -------------------------

