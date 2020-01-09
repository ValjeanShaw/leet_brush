package primary.arrayPack;

/**
 *  从排序数组中删除重复项
 * @author xiaoran
 * @date 2020/01/09
 */
public class RemoveDuplicates {

    public static void main(String[] args) {

    }

    public int removeDuplicates(int[] nums) {
        if(nums==null){
            return 0;
        }
        if(nums.length<=1){
            return nums.length;
        }
        int low=0;
        int high=1;
        while(high < nums.length){
            if(nums[low]!=nums[high]){
                nums[++low] = nums[high];
            }
            high++;
        }
        return low+1;
    }


}
