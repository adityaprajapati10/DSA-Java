// Write a Java program to solve the N-Queens problem using backtracking. Given an integer n, the program should place n queens on an n x n chessboard such that no two queens attack each other. Implement the necessary methods to check the safety of queen placement and solve the problem recursively. If a solution exists, print the board configuration; otherwise, indicate that no solution exists.

// Input : Enter the Number of Queens: 4
// Output : 0 0 1 0 
        //  1 0 0 0 
        //  0 0 0 1 
        //  0 1 0 0 

import java.util.*;
public class nQueenProblem {

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
    public static boolean solveNQueen(int[][] board , int column , int n ){

        // base case :- if all the queens have got placed then return true

        if(column >= n ){
            return true;
        }

        else{
            //consider this column and try placing all the queens one by one in all the rows
            for(int i = 0 ; i<n ; i++){
                //check if it is safe to place the queen or not
                if(isSafe(board, i, column, n) == true){
                    board[i][column] = 1 ;

                    //recursive call for remaining queens
                    if(solveNQueen(board, column+1, n) == true){
                        return true;
                    }

                //if placing the queen does not lead to solution then backtrack
                    else{
                        board[i][column] = 0;
                    }
               

                }
            }
        //if it is not possible to place the queen in any row of the given column then return 
        //false
        return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Queens: ");
        int n = sc.nextInt();

        int[][] board = new int[n][n];
        
        boolean result = solveNQueen(board, 0, n);
        if(result == true){
            PrintSoln(board, n);
        }
        else{
            System.out.println("Solution does not exist");
        }
        sc.close();
    }
}
