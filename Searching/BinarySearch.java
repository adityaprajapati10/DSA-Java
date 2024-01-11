//Space Complexity --> O(log n)
//Time complexity --> O(1)
// FOR BINARY SEARCH DATA MUST BE SORTED ( INCREASING / DECREASING )
import java.util.*;
public class BinarySearch {

    public static int binarySearch(int array[], int target){  // for increasing order
        int low = 0; 
        int high = array.length -1;
        int mid ;
        while(low <= high){
            mid = low + (high-low)/2 ; // RECOMMENDED TO USE THIS FOR FINDING MID ELEMENT
                                        // OTHERWISE WE CAN USE MID = (LOW+HIGH) / 2
            if( array[mid] == target){
                return mid ;
            }
            else if ( array[mid] < target){
                low = mid + 1 ;
            }
            else{
                high = mid - 1 ;
            }
        }
        return -1 ;
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
        System.out.print("Enter the Target element : ");
        int target = sc.nextInt();
        
        int result = binarySearch(arr, target);
        if( result == -1 ){
            System.out.println("Searched element is not found in an array ");
        }
        else{
            System.out.println("Searched element is found at the location : "+result);
        }
        sc.close();
    }
}
   
