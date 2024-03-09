import java.util.Scanner;

public class randomizedQuickSort {
    // Function of the quick Sort algo
    public static void quickSort(int[] arr , int l , int h){
        if(l<h){
            // 1. Divide the Array into two subproblem 
            int m = partition(arr, l ,h);
            // 2. Conqure the subproblem via the recurssion
            quickSort(arr , l , m-1);
            quickSort(arr, m+1, h);
        }
    }


    // Function to do the partition of an Array
    public static int partition(int[] arr , int l , int h){

        int randomIndex = l + (int)Math.random() % (h-l+1);
        
        arr[l] = arr[randomIndex];

        int pivot = arr[l];
        int i = l ;
        for(int j = l+1 ; j<=h ; j++){
            if(arr[j] <= pivot){
                i++;
                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[l] and arr[i] 
        // to get the correct position of the pivot element 
        int temp = arr[l];
        arr[l] = arr[i];
        arr[i] = temp;

        return i;
    }
    // Function to display the array
    public static void printArray(int[] arr , int n){
        for(int i : arr){
            System.out.print(i + " ");
        }
        System.out.println(" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Array Size : ");
        int s = sc.nextInt();
        int arr[] = new int[s];
        System.out.println("Enter Array Elements : ");
        for(int i = 0 ; i < s ; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Array before Sorting : ");
        printArray(arr,s);

        quickSort(arr , 0 , s-1);

        System.out.println("Array after Sorting : ");
        printArray(arr,s);

        sc.close();
    }
}

