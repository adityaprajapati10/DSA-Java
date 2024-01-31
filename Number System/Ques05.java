// Given an integer array, duplicates are present in it in a way that all duplicates appear an
// even number of times except one which appears an odd number of times. Find that odd appearing
// element in linear time and without using any extra memory.
// For example,
// Input : arr[] = [4, 3, 6, 2, 6, 4, 2, 3, 4, 3, 3]
// Output : The odd occurring element is 4.

import java.util.*;
public class Ques05 {
    public static int findOddAppearence(int [] arr,int i){

        if(i==arr.length ){
            return 0;
        }

        else{
            return arr[i]^findOddAppearence(arr,i+1);
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lenght of array: ");
        int l = sc.nextInt();
        int arr [] = new int[l];
        System.out.print("Enter the elements of an array: ");
        for(int i = 0 ; i< l ; i++){
            arr[i] = sc.nextInt();
        }
        int result = findOddAppearence(arr, 0);
        System.out.println("Odd appearing element in given Array: "+result);
        sc.close();
    }
}
