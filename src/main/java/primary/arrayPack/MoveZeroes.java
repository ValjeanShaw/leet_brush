package primary.arrayPack;

/**
 * @author xiaoran
 * @date 2020/01/29
 */
public class MoveZeroes {

    public static void main(String[] args) {
        int[] array = {0,1,0,3,12};
        MoveZeroes moveZeroes = new MoveZeroes();
        moveZeroes.moveZeroes(array);

        for(int a:array){
            System.out.println(a);
        }
    }

    public void moveZeroes(int[] nums) {
        if(nums==null || nums.length ==0){
            return;
        }
        int low = 0;
        int high = 0;
        while(high < nums.length){
            if(nums[high] != 0){
                nums[low] = nums[high];
                low++;
            }
            high++;
        }
        while(low<nums.length){
            nums[low++] = 0;
        }
    }
}
