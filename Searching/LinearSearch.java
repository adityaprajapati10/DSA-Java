//Time Complexity --> O(n)
//Space Complexity --> O(1)

import java.util.*;
public class LinearSearch{

    public static void Search(int array[] , int target){
        int index = -1 ;
        int n = array.length;
        for(int i = 0 ; i<n ; i++){
            if(array[i] == target){
                index = i ;
                break ;
            }    
        }
        if(index == -1){
            System.out.println("Searched element is not found in an array ");
        }
        else {
            System.out.println("Searched element is found at the location : "+index);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array : ");
        int n = sc.nextInt();
        int arr [] = new int [n];
        System.out.print("Enter the element of Array : ");
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("enter the target element : ");
        int target = sc.nextInt();
        Search(arr, target);
        sc.close();
    }
}