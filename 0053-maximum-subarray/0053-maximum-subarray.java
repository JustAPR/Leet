class Solution {
    public int maxSubArray(int[] nums) {
        int total = nums[0];
        int sum = nums[0];
        for(int i = 1; i<nums.length ; i++){
            sum = Math.max(nums[i],sum + nums[i]);
            total = Math.max(total,sum);
        }
        return total;
    }
}