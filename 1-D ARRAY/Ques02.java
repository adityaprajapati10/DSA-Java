//WAP to traverse elements of the array using for each loop and print all even elements.
import java.util.*;
public class Ques02 {
    public static void evenElement(int array[]){
        for(int m : array){
            if (m%2 == 0){
                System.out.print(m+" ");
            }
        }
    }
   public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array :  ");
        int n = sc.nextInt();
        int array [] = new int[n];
        System.out.print("Enter Array elements :  "); //{34,21,54,65,43} {4,3,6,7,1}
        for(int i =0 ; i < n; i++){
            array[i] = sc.nextInt();
        }
        System.out.print("all even elements present in array : ");
        evenElement(array);
        sc.close();
   }
}
