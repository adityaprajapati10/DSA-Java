// Time complexity ---> O(n)
// Space complexity ---> O(1)

public class MissingNo {
    public static void main (String [] args){
        int array [] = { 1,2,4,7,6,5};
        int n = array.length;
         
        //Sum of Natural number in an array n*(n+1)/2 --->  O(1)
        int sum_NaturalNo = (n+1)*(n+2)/2;

        //Sum of all current elements present in array ---> O(n)
        int sum = 0 ;
        for (int i =0 ; i< array.length ; i++){
            sum += array[i];
        }

        int missing_no = (sum_NaturalNo - sum) ;
        System.out.println("Missing number is --> " + missing_no);
    }
}
