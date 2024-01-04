public class Duplicate {
    public static void main(String [] args){
        int arr[] = {2,4,4,7,10};
        int n = arr.length;
        for(int i =0 ; i<n ; i++){
            for(int j =i+1 ; j<n ; j++){
                if(arr[i] == arr[j]){
                    System.out.println("The Duplicate number ---> "+ arr[i]);
                }
            }
        }
    }
}
