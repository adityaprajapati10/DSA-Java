//WAP to print the elements above the secondary diagonal in a user inputted square matrix.
//Input -->
// 1 2 3
// 4 5 6
// 7 8 9       Output --> 1 2 4

import java.util.*;
public class Ques02 {
    public static void aboveSecondaryDiag(int arr [][]){
        int m = arr.length;
        int n = arr[0].length;
        for(int i=0; i<m; i++){                               
            for(int j=0; j<n; j++){
                if(i+j < m-1 )
                    System.out.print(arr[i][j] + " ");
            }
        } 
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
        System.out.print("The elements above the secondary diagonal in");
        aboveSecondaryDiag(array);
    sc.close();
   } 
}
