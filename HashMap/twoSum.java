// Ques: Given an array of integers and an integer target, return indices of the two numbers such that they add up to target. Assume only 1 valid answer exists.
// Eg. Input = [2,7,11,15]. target =9
// Output = [0,1]
// Input = [3,2,4]. target = 6
// Output = [1,2] 
import java.util.*;

public class twoSum {
    public static int[] twoSumMethode(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            map.put(nums[i], i);
        }
        int result[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i] && map.containsKey(0)) {
                result[0] = i;
                result[1] = map.get(0);
                return result;
            } else if (map.containsKey(target - nums[i]) && map.get(target - nums[i]) != i) {
                // if (map.get(target - nums[i]) > i)
                    result[0] = i;
                result[1] = map.get(target - nums[i]);
                return result;
            }
        }
        result[0] = -1;
        result[1] = -1;
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the array elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the target element in an array");
        int target = sc.nextInt();
        int result [] = twoSumMethode(arr , target);
        for(int i : result){
            System.out.println(i);
        }
        sc.close();
    }
}
