// WAP to sort an array in decreasing order using insertion sort
// Input Array {3,5,1,6,0}
// Output Array: {6, 5, 3, 1, 0}
import java.util.*;
public class Ques03 {

    public static void insertionSort(int ar[]){
        for(int i = 1 ; i < ar.length ; i++){
            int j = i ;
            while(j>0 && ar[j] > ar[j-1]){
                int temp = ar[j];
                ar[j] = ar[j-1];
                ar[j-1] = temp ;
                j--;
            }
        }
    }
    public static void main (String args []){
        Scanner sc = new Scanner (System.in);

    System.out.print("Enter size of an Array : ");
    int m = sc.nextInt();
    int ar[] = new int [m];
    System.out.print("Enter elements of an array : ");
    for(int i=0 ; i<m ;i++){
       ar[i] = sc.nextInt();
    }
    insertionSort(ar);
    System.out.print("The Sorted Array is : ");
    for(int i : ar){
        System.out.print(i + " ");
    }
    sc.close();
    }
    
}

