package primary.arrayPack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author xiaoran
 * @date 2020/01/20
 *
 * 两个数组的交集 II
 */
public class Intersect {

    public static void main(String[] args) {

    }

    public int[] intersect(int[] nums1, int[] nums2) {
        if(nums1 ==null || nums1.length ==0 ||nums2 ==null || nums2.length ==0 ){
            return new int[]{};
        }
        int len = nums1.length <= nums2.length ? nums1.length : nums2.length;
        int[] shortArr = nums1.length <= nums2.length ? nums1 : nums2;
        int[] longArr = nums1.length > nums2.length ? nums1 : nums2;
        Map<Integer,Integer> map = new HashMap<Integer, Integer>(len);
        for(int i:shortArr){
            if(map.containsKey(i)){
                map.put(i,map.get(i)+1);
            }else{
                map.put(i,1);
            }
        }
        List<Integer> list = new ArrayList<Integer>();
        for(int j:longArr){
            if(map.get(j) != null && map.get(j) != 0 ){
                list.add(j);
                int index = map.get(j);
                map.put(j,--index);
            }
        }
        int[] result = new int[list.size()];
        for(int i=0;i<list.size();i++){
            result[i] = list.get(i);
        }
        return result;

    }
}
