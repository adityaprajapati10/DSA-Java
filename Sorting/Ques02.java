// WAP to sort an array in descending order using selection sort
// Input Array {3,5,1,6,0}
// Output Array: {6, 5, 3, 1, 0}

import java.util.*;
public class Ques02 {

    public static void selectionSort(int arr[]){

        for(int i = 0 ; i < arr.length ; i++ ){
            int max_idx = i ;
            for(int j = i+1 ; j < arr.length ; j++){
                if(arr[max_idx] < arr[j]){
                    max_idx = j ;
                }
            }
            if(max_idx != i){
                int temp = arr[i];
                arr[i] = arr[max_idx];
                arr[max_idx] = temp;
            }
        }
    }
   public static void main(String args[]){
    Scanner sc = new Scanner (System.in);

    System.out.print("Enter size of an Array : ");
    int m = sc.nextInt();
    int ar[] = new int [m];
    System.out.print("Enter elements of an array : ");
    for(int i=0 ; i<m ;i++){
       ar[i] = sc.nextInt();
    }

    selectionSort(ar);
    System.out.print("The Sorted Array is : ");
    for(int i : ar){
        System.out.print(i + " ");
    }
    sc.close();
   } 
}
