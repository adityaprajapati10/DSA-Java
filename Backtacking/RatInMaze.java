// Write a Java program that computes the number of ways a rat can navigate through a maze from the top-left corner to the bottom-right corner. The maze is represented as a square matrix of size 'n x n', where '-1' indicates blocked paths and '0' indicates open paths. The rat can only move rightwards or downwards. Implement the CountWays method to compute the number of possible paths and the main method to take input for the maze matrix and display the result.

// Example: maze = {{0, 0, 0, 0},
//                 {0, -1, 0, 0},
//                 {-1, 0, 0, 0},
//                 {0, 0, 0, 0}};  Output : 4

import java.util.*;
public class RatInMaze {
    public static int CountWays(int maze[][] , int n){

        // if source or destination are blocked then return 0 .
        if(maze[0][0] == -1 || maze[n-1][n-1] == -1){
            return 0;
        }

        // initialize the topmost column
        for(int i = 0 ; i< n ; i++){
            if(maze[i][0] == 0){
                maze[i][0] = 1 ;
            }
            else
                break;
        }

        // initialize the topmost row 
        for(int i = 1 ; i<n ; i++){
            if(maze[0][i] == 0){
                maze[0][i] = 1 ;
            }
            else
                break ;
        }

        // if maze[i][j] = -1 then ignore otherwise compute the value of count recursively
        for(int i = 1 ; i<n ; i++){
            for(int j = 1 ; j<n ; j++){
                
                //check for blockage
                if(maze[i][j] == -1){
                    continue;
                }

                // if we can reach maze[i][j] from maze[i-1][j] then increment the count
                if(maze[i-1][j] > 0){
                    maze[i][j] = maze[i][j] + maze[i-1][j];
                }

                // if we can reach maze[i][j] from maze[i][j-1] then increment the count
                if(maze[i][j-1] > 0 ){
                    maze[i][j] = maze[i][j] + maze[i][j-1];
                }            
            }
        }
        return maze[n-1][n-1];

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Row & Column value to depict Maze(n): ");
        int n = sc.nextInt();

        System.out.println("Enter Maze matrix element : ");
        int maze[][] = new int[n][n];
        
        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j<n ; j++){
                maze[i][j] = sc.nextInt();
            }
        }

        System.out.print("The Number of Ways to reach destination = ");
        System.out.println(CountWays(maze, n));
        sc.close();

    }
}
