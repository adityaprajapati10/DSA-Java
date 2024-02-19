import java.util.*;
public class CountWayNQueen {
    public static void PrintSoln(int[][] board , int n){
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(int[][] board , int row , int column , int n){
        int i , j ;

        // Check this row on left side
        for(i=0 ; i < column ; i++){
            if(board[row][i] == 1)
            return false;
        }

        //  Check upper diagonal on left side
        for(i = row , j =column ; i>=0 && j>=0 ; i--,j--){
            if(board [i][j] == 1 ){
                return false;
            }
        }

        // Check lower diagonal on left side
        for(i = row , j = column ; i<n && j>=0 ; i++,j--){
            if(board [i][j] == 1){
                return false;
            }
        }
        return true;
    }

    //function to solve n Queen problem
    public static int solveNQueen(int[][] board , int column , int n ){
        

        // base case :- if all the queens have got placed then return true
        if(column >= n ){
            PrintSoln(board, n);
            System.out.println();
            return 1;
        }

        else{
            int count = 0;
            //consider this column and try placing all the queens one by one in all the rows
            for(int i = 0 ; i<n ; i++){
                //check if it is safe to place the queen or not
                if(isSafe(board, i, column, n) == true){
                    board[i][column] = 1 ;

                    //recursive call for remaining queens
                    if(solveNQueen(board, column+1, n)>0){
                        count++;
                        
                    }

                //if placing the queen does not lead to solution then backtrack
                    board[i][column] = 0;

                }
            }
        //if it is not possible to place the queen in any row of the given column then return false
        return count;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Queens: ");
        int n = sc.nextInt();

        int[][] board = new int[n][n];
        
        int result = solveNQueen(board, 0, n);
            System.out.println("Number of Way to solve "+n+" Queen problem: "+result);
        sc.close();
    }
}
