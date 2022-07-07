import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result
 * must appear as many times as it shows in both arrays, and you may return the result in any order.
 *
 */
//Али Хезам 11-013

public class Main {
    public static void main(String[] args) {

       int[] nums = {4,9,5};
       int[] num2 = {9,4,9,8,4};
       
        System.out.println( Arrays.toString(intersect(nums, num2)));
    }
    public static  int[] intersect(int[] nums1, int[] nums2)
    {
        if(nums1.length>nums2.length){
            return intersect(nums2,nums1);
        }
        Map<Integer,Integer> m= new HashMap<Integer,Integer>();
        for(int val:nums1){
            m.put(val,m.getOrDefault(val,0)+1);
        }
        int k=0;
        for(int val:nums2){
            if(m.getOrDefault(val,0)>0){
                nums1[k++]=val;
                m.put(val,m.get(val)-1);
            }
        }
        int[] ans =new int[k];
        System.arraycopy(nums1, 0, ans, 0, k);
        return ans;
    }
}
