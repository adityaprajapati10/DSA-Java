// Time complexity = O(n)........
// Space complexity = O(1).......
public class ReversalArray {
    public static void main(String [] agrs){
        int array[] ={2,4,8,10,12,14};
        int n = array.length;

        for(int i =0 ;i<n/2 ;i++){
            //Swap the element between array[i] and array[n-i-1]
            int temp = array[i];
            array[i] = array[n-i-1];
            array[n-i-1] = temp;
        }

        System.out.println("Reversal of an Array is");
        for(int i= 0 ; i< array.length ;i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
    }
}
