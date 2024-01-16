// Given a sorted binary array, efficiently count the total number of 1’s in it.
// Input 1: arr = [0 0 0 0 1 1 1 1 1 1]
// Output 1: 6

import java.util.*;
public class Ques01 {

    public static int totalOne(int arr[]){
        int count = 0; 
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == 1){
                count++;
            }
        }
        return count ;
    }
    public static void main (String args []){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the size of binary Array : ");
        int n = sc.nextInt();
        int arr [] = new int [n];
        System.out.print("Enter the element of Array(only 0 & 1) : ");
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        int result = totalOne(arr);
        System.out.println("In a given a sorted binary array the total number of 1 is : "+result);
        sc.close();
    }
}
