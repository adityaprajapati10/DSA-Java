// Write a Java program to solve a Sudoku puzzle using backtracking algorithm. The program should be able to determine if a solution exists for the given puzzle and print the solved Sudoku grid if a solution is found.


public class Sudoko {
    public static void printSol(int[][]grid , int n){
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static boolean isSafe(int[][]grid , int row , int column , int num , int n){
        //row clash check - row has unique value
        for(int i = 0 ; i<n ; i++){
            if(grid[row][i]==num)
            return false;
        }

        //column clash check - column has unique value
        for(int j = 0 ; j<n ; j++){
            if(grid[j][column]==num)
            return false;
        }

        //sub grid clash check 
        int subRow = row - (row % 3);
        int subColumn = column - (column % 3);
        for(int i = subRow ; i < subRow+3 ; i++){
            for(int j = subColumn ; j < subColumn+3 ; j++){
                if(grid[i][j] == num)
                return false;
            }
        }
        return true;
    }
    public static boolean sudokuSoln(int[][]grid , int n){

        int row = -1 , column = -1 ;
        boolean isEmpty = true;
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n ; j++ ){
                if(grid[i][j] == 0){
                row = i;
                column = j ;

                isEmpty = false;
                break;
                }
            }

            if(!isEmpty)
                break;
        }
        if(isEmpty){
            return true;
        }

        for(int num = 1 ; num <= 9 ; num++){
            if(isSafe(grid, row, column, num, n)  == true){
                grid[row][column] = num ;

                if(sudokuSoln(grid, n)  == true){
                    return true;
                }
                else{
                    grid[row][column] = 0 ;
                }
            }
        }

        return false;
    }

     public static void main(String[] args) {
        int[][] grid = {{3, 0, 6, 5, 0, 8, 4, 0, 0},
                {5, 2, 0, 0, 0, 0, 0, 0, 0},
                {0, 8, 7, 0, 0, 0, 0, 3, 1},
                {0, 0, 3, 0, 1, 0, 0, 8, 0},
                {9, 0, 0, 8, 6, 3, 0, 0, 5},
                {0, 5, 0, 0, 9, 0, 6, 0, 0},
                {1, 3, 0, 0, 0, 0, 2, 5, 0},
                {0, 0, 0, 0, 0, 0, 0, 7, 4},
                {0, 0, 5, 2, 0, 6, 3, 0, 0}};

        if(sudokuSoln(grid, grid.length) == true)
        {
            printSol(grid, grid.length);
        }
        else
        {
            System.out.println("Solution does not exist.");
        }
    }
}
