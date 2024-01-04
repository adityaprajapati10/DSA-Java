// Time complexity ---> O(n)
// Space complexity ---> O(1)

public class Palindrome{
    public static void main(String [] ags){
        int arr[] = {1,2,3,2,1};
        int n = arr.length;
        int flag = 0;

        for(int i = 0 ; i<n/2 ; i++ ){
            if(arr[i] != arr[n-i-1]){
                System.out.println(" NOT A PALINDROMIC ARRAY");
                flag = 1;
                break;
            }
        }
        if( flag == 0){
            System.out.println(" PALINDROMIC ARRAY");
        }
    }
}