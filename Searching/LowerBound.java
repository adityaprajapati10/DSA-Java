// Find the first Ocurrence of target in the sorted array
// Input 1: arr = [1 1 1 2 2 3 4 5 5 5] , target = 5
// Output 1: 7
// Time Complexity = O(log n)
// Space Complexity = O(n)
import java.util.*;
public class LowerBound {
    public static int FindFirstOccurrence(int array[], int target){
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
        
        int result = FindFirstOccurrence(arr, target);
        if( result == -1 ){
            System.out.println("Searched element is not found in an array ");
        }
        else{
            System.out.println("Searched element first occurrence is found at the location : "+result);
        }
        sc.close();
    }
}

