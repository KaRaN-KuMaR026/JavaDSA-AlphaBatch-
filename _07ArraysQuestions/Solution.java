package _07ArraysQuestions;

class Solution {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums) {
        int ms = 0;
        int cs = 0;
        for (int i = 0; i < nums.length; i++) {
            cs = cs + nums[i];
            if(cs < 0)
                cs = 0;
            ms = Math.max(cs,ms);
        }
        return ms;
    }
}