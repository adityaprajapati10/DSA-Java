// Find out how many pass would be required to sort the following array in decreasing order
// using bubble sort
// Input Array {3,5,1,6,0}
import java.util.*;
public class Ques04 {
    public static int bubbleSort(int arr[]){
        int n = arr.length;
        boolean swapped ;
        int passes = 0;
        for(int i = 0 ; i < n ; i++){
            swapped = false;
            for(int j = 0 ; j < n-i-1 ; j++){
                if(arr[j] < arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swapped = true;
                    
                }
            }
            
            if(!swapped){
                break;
            }
            passes++;
        }
        return passes;
    } 

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of an Array : ");
        int m = sc.nextInt();

        int arr [] = new int[m];

        System.out.print("Enter the element of an Array : ");
        for(int i=0 ; i < m ; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("pass would be required to sort the array in decreasing order : "+bubbleSort(arr));

        System.out.print("The Sorted Array is : ");
        for(int i : arr){
            System.out.print(i + " ");
        }
        sc.close();
    }
}
