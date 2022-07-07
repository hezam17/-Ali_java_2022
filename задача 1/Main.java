import java.util.Arrays;

//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
//Али Хезам 11-013

public class Main {
    public static void main(String[] args) {

       int[] nums = {2,2,8,1,8};

        System.out.println(singleNumber(nums));
    }
    public static int singleNumber(int[] nums) {

        int numsLength = nums.length;
        if(numsLength==1) return nums[0];
        Arrays.sort(nums);
        if(nums[1]!=nums[0]) {
            return nums[0];
        }
        if (nums[numsLength-1]!=nums[numsLength-2]){
            return nums[numsLength-1];
        }
        for(int i=1; i<numsLength-1; i++){
            if(nums[i]!=nums[i-1] && nums[i]!= nums[i+1]){
                return nums[i];
            }
        }
        return -1;
    }
}
