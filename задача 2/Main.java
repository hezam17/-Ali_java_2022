import java.util.Arrays;

//Given an array, rotate the array to the right by k steps, where k is non-negative.
//Али Хезам 11-013

public class Main {
    public static void main(String[] args) {

       int[] nums = {1,2,3,4,5,6,7};
       int k = 3;

        rotate(nums, k);
    }
    public static void rotate(int[] nums, int k) {

        if (k<=0) {
            System.out.println(" k is negative");
            return;
        };
        if (nums == null || nums.length == 0) return;

        int[] res = new int[nums.length];
        for (int i=0; i<nums.length; i++) {
            int newIndex = (i + k) % nums.length;
            res[newIndex] = nums[i];
        }
        System.out.println("before");
        System.out.println(Arrays.toString(nums));

        //assign back to original array
        System.arraycopy(res, 0, nums, 0, nums.length);
        System.out.println("after");
        System.out.println(Arrays.toString(nums));
    }
}
