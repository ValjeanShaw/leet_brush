package primary.arrayPack;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xiaoran
 * @date 2020/02/13
 */
public class TwoSum {

    public static void main(String[] args) {

    }

    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int diff = target-nums[i];
            if(map.containsKey(diff)){
                return new int[]{map.get(diff),i};
            }else{
                map.put(nums[i],i);
            }
        }
        return null;
    }
}
