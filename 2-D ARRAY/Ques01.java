//Take m and n input from the user and m * n integer inputs from user & print the following:
// number of positive numbers
// number of negative numbers
// number of odd numbers
// number of even numbers
// number of 0.

import java.util.*;
public class Ques01 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of Rows : ");
        int m = sc.nextInt();
        System.out.print("Enter the number of columns : ");
        int n = sc.nextInt();

        int arr[][] = new int[m][n];

        System.out.println("Enter the matrix elements");     //1  2  -3  4
        for(int i=0; i<m; i++){                               //0  0  -4  2
            for(int j=0; j<n; j++){                           //1  -1  2  3 
                arr[i][j] = sc.nextInt();                    //-4  -5 -7  0 
            }
        }
        int countP =0 ;
        int countN =0 ;
        int countO =0 ;
        int countE =0 ;
        int countZ =0 ; 

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(arr[i][j] > 0)
                    countP++;
                
                if(arr[i][j] < 0)
                    countN++;

                if(arr[i][j] % 2 == 0) 
                    countE++;  
                    
                if(arr[i][j] % 2  != 0)
                    countO++;

                if(arr[i][j] == 0)
                    countZ++;
            }
        }  
        System.out.println(" number of positive numbers : "+countP);
        System.out.println(" number of Negative numbers : "+countN);
        System.out.println(" number of Even numbers : "+countE);
        System.out.println(" number of Odd numbers : "+countO);
        System.out.println(" number of Zero numbers : "+countZ);
        sc.close();          
    }
}
