import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

/*
Given a sorted array of distinct integers and a target value,
return the index if the target is found. If not,
return the index where it would be if it were inserted in order.
 */
//Али Хезам 11-013
class Main {

    public static void main(String args[]) {
        int nums[] = {1, 3, 5, 7, 9}, target = 8;
        System.out.println(Arrays.toString(nums));
        System.out.println(searchInsert(nums, target));
        System.out.println(searchInsert(nums, 3));
    }

    public static int searchInsert(int[] nums, int target) {

        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] >= target)
                return i;
        }
        return n;

    }
}

