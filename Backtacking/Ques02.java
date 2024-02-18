
// Given an integer array arr, print all the possible permutations of the given array.
// The array will only contain non repeating elements.
// input : arr = [1, 2, 3]
// Output : [[1,2,3] , [1,3,2] , [2,1,3] , [2,3,1] , [3,1,2] , [3,2,1]]
import java.util.*;

public class Ques02 {
    public static int[] elementSwap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        return arr;
    }

    public static void arraypermutation(int arr[], int s, int e) {

        if (s == e) { // Base case Condition
            System.out.print("[");
          for(int i : arr){
            System.out.print(i + " ");
          }
          System.out.print("]"+ "  ");
        //   System.out.println();
        }

        else {
            for (int i = s; i <= e; i++) {
                arr = elementSwap(arr, s, i);
                arraypermutation(arr, s + 1, e); // Recursive call
                arr = elementSwap(arr, s, i); // Backtrack

            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.print("Enter the elements of an array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int s = 0;
        int e = arr.length-1;
         
        arraypermutation(arr,  s,  e);

        sc.close();
    }
}
