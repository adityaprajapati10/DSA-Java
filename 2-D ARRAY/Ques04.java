//Write a program to find the largest element of a given 2D array of integers.

import java.util.*;
public class Ques04 {
    public static int maxElement(int arr [][]){
        int max = arr[0][0];
        int m = arr.length;
        int n = arr[0].length;
        for(int i=0; i<m; i++){                               
            for(int j=0; j<n; j++){
                if(arr[i][j] > max)
                    max = arr[i][j];
            }
        }
        return max;
    }
    public static void main(String args[]){
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter the number of Rows : ");
        int m = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        int n = sc.nextInt();

        int array[][] = new int[m][n];

        System.out.println("Enter the matrix elements");    
        for(int i=0; i<m; i++){                               
            for(int j=0; j<n; j++){                          
                array[i][j] = sc.nextInt();                   
            }
        }
        System.out.print("The largest element of a given 2D array of integers : "+maxElement(array));
        
        sc.close();
    }
}
