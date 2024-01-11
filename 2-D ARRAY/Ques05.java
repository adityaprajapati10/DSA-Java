// Write a function which accepts a 2D array of integers and its size as arguments and
// displays the elements of middle row and the elements of middle column. Printing can
// be done in any order.
import java.util.*;
public class Ques05 {
    public static void midRowCol(int arr [][]){
        
        int m = arr.length;
        int n = arr[0].length;
        for(int i=0; i<m; i++){
            System.out.print(arr[i][m/2]+" ");   
        }                            
        for(int j=0; j<n; j++){
            if( j != n/2)
            System.out.print(arr[n/2][j]+" ");
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
        System.out.print("The elements of middle row and the elements of middle column : ");
        midRowCol(array);
        sc.close();
    }
    
    
}
