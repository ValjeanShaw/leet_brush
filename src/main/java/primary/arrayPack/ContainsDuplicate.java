package primary.arrayPack;

import java.util.HashSet;
import java.util.Set;

/**
 * 存在重复元素
 *
 * @author xiaoran
 * @date 2020/01/15
 */
public class ContainsDuplicate {

    public static void main(String[] args) {

    }

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for(int i=0;i<nums.length;i++){
            if(set.contains(nums[i])){
                return true;
            }else{
                set.add(nums[i]);
            }
        }
        return false;
    }
}
