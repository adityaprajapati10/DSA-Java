// Write a Java program that generates all permutations of a given string.
// Examlpe: Input: abc
//          Output: abc acb bac bca cab cba
import java.util.*;
public class permuteString {

    public static String Swap(String str , int i , int j){
        char chararray [] = str.toCharArray();
        char temp = chararray[i];
        chararray[i] = chararray[j];
        chararray[j] = temp ;
        return String.valueOf(chararray);
    }

    public static void permute(String str , int l , int r){

        if(l == r){
            System.out.print(str + " ");
        }

        else{
            for(int i = l ; i<=r ; i++){
                str = Swap(str, l, i);
                permute(str, l+1, r);  // Recursion

                // Backtracking 
                str = Swap(str, l, i);
            }
        }
    }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter a String: ");
    String str = sc.nextLine();
    int l = 0 ;
    int r = str.length()-1;
    permute(str, l, r);
    System.out.println();
    sc.close();
  }  
}
