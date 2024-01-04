//Write a program to calculate the maximum element in the array.

import java.util.*;
public class Ques03 {
    public static int calMax(int arr[]){
        int max = arr[0];
        for(int i = 0 ; i<arr.length ; i++){
                if(arr[i] > max){
                max = arr[i];}
            }
        
        return max;
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
            System.out.println("The maximum element in the array : "+calMax(array));
            sc.close();
        } 

}
