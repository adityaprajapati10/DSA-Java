//WAP to find out the second largest element in a given array.
import java.util.*;
public class Ques04 {
    public static int SecondMax(int arr[]){
        Arrays.sort(arr);
        return arr[arr.length-2];
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
            System.out.print("Enter the size of Array :  ");
            int n = sc.nextInt();
            int array [] = new int[n];
            System.out.print("Enter Array elements :  "); //{34,21,54,65,43} {4,3,6,7,1}
            for(int i =0 ; i < n; i++){
                array[i] = sc.nextInt();
            }
            System.out.println("The maximum element in the array : "+SecondMax(array));
            sc.close();
        }
}
