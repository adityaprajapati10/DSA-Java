// Find out the number of iterations to sort the array in descending order using selection sort.
import java.util.*;
public class Ques05 {

    public static int selectionSort(int arr[]){
        int pass = 0; int n = arr.length;
        
        for(int i = 0 ; i < n ; i++ ){
            int max_ind = i ; 
            for(int j = i+1 ; j < n ; j++){
                if(arr[max_ind] < arr[j]){
                    max_ind = j ;
                 
                }
               
            }
            if(max_ind != i){ 
                int temp = arr[i];
                arr[i] = arr[max_ind] ;
                arr[max_ind] = temp ;
                
            }
            
            
        }
        return pass ;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Size of an Array : ");
        int m = sc.nextInt();
        int ar[] = new int[m];

        System.out.print("Enter the elements of an array : ");
        for(int i = 0 ; i < m ; i++){
            ar[i] = sc.nextInt();
        }
        int result = selectionSort(ar);
        System.out.println("The number of iterations to sort the array in descending order is: "+result);

        System.out.print("The Sorted Array is : ");
        for(int i : ar){
            System.out.print(i + " ");
        }
        sc.close();

    }
}
