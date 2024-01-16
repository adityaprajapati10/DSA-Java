// Given a sorted integer array containing duplicates, count occurrences of a given number.
//  If the element is not found in the array, report that as well.
// Input: nums[] = [2, 5, 5, 5, 6, 6, 8, 9, 9, 9]
// target = 5

import java.util.*;
public class Ques02 {

    // Creating a method which is finding the last Occurance of the target element
    public static int LastOccurrence(int array[], int target){
        int low = 0; 
        int high = array.length -1;
        int mid ;
        int result = -1;
        while(low <= high){
            mid = low + (high-low)/2 ;

            if( array[mid] == target){
                result = mid ;
                low = mid + 1 ;
            }
            else if ( array[mid] < target){
                low = mid + 1 ;
            }
            else{
                high = mid - 1 ;
               
               
            }
        }
        return result;
    }

    // Creating a method which is finding the First Occurance of the target element
    public static int FirstOccurrence(int array[], int target){
        int low = 0; 
        int high = array.length -1;
        int mid ;
        int result = -1;
        while(low <= high){
            mid = low + (high-low)/2 ;

            if( array[mid] == target){
                result = mid ;
                high = mid -1 ;
            }
            else if ( array[mid] < target){
                low = mid + 1 ;
            }
            else{
                high = mid - 1 ;
            }
        }
        return result;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Sorted Array : ");
        int n = sc.nextInt();
        int arr [] = new int [n];
        System.out.print("Enter the element of Array : ");
        for(int i = 0 ; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the Target element : ");
        int target = sc.nextInt();

        int lastOcc  = LastOccurrence(arr, target);
        int firstOcc = FirstOccurrence(arr, target);
    
        int totalDup = (lastOcc - firstOcc)+1;
        if(firstOcc == lastOcc && firstOcc == -1){
        System.out.println("The target does not exist in the array.");
        }
        else{
        System.out.println("In given a sorted array No. of duplicates of target element is : "+totalDup);
        }
        sc.close();
    }
}
