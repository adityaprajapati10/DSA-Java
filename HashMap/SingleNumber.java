import java.util.*;
public class SingleNumber {
        public int singleNumber(int[] nums) {
            HashMap<Integer , Integer> map = new HashMap<>();
            for(int i : nums){
                if(map.containsKey(nums[i])){
                    map.put(nums[i] , map.get(nums[i])+1);
                }
                else{
                    map.put(nums[i] , 1);
                }
            }
            int result = -1 ;
            for(int i = 0 ; i<nums.length ; i++){
                if(map.get(nums[i]) == 1){
                    result = nums[i];
                    break;
                }
            }
            return result;
        }
    }

