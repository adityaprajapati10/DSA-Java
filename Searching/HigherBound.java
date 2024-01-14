// Find the last occurrence in the sorted array
// input : -  [1 1 1 2 3 4 4 5 6 6 6 6] , target = 4
// Output : - 6
// Time Complexity = O(log n)
// Space Complexity = O(n)
import java.util.*;
public class HigherBound {
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
    public static void main(String []agrs){
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
        
        int result = LastOccurrence(arr, target);
        if( result == -1 ){
            System.out.println("Searched element is not found in an array ");
        }
        else{
            System.out.println("Searched element Last occurrence is found at the location : "+result);
        }
        sc.close();
    }
}

