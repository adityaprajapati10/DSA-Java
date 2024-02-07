
import java.util.*;
public class PrintMultiples {
    public static void printMultiplesOfNum(int num , int k){
        
        if(k == 1){
            System.out.print(num);
             return;
        }

        else {
            printMultiplesOfNum(num, k-1);
            System.out.print( " " +num*k + " ");
        }
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of num: ");
        int num = sc.nextInt();

        System.out.print("Enter the value of terms: ");
        int terms = sc.nextInt();

        printMultiplesOfNum(num, terms);
        System.out.print(" ");

        sc.close();
    }
}
