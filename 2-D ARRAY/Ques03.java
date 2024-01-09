//WAP to print the elements of both the diagonals n a useir inputted square matrix in any order.
// 1 2 3
// 4 5 6
// 7 8 9    Output --> 1 3 5 7 9
import java.util.*;
public class Ques03 {
    public static void diagonalElements(int arr[][]){
        int m = arr.length;
        int n = arr[0].length;
        for(int i=0; i<m; i++){                               
            for(int j=0; j<n; j++){
                if(i+j == m-1 || i == j )
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
        System.out.print("The elements of both the diagonals in a square matrix : ");
        diagonalElements(array);
        sc.close();
    }
}
