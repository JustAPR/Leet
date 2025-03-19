class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE;
        int left = 0;
        int right;
        int sum = 0;
        for(right = 0;right<nums.length;right++){
            sum += nums[right];
            while(sum>=target){
                min = Math.min(min,right-left + 1);
                sum -= nums[left];
                left++;
            }
        }
        return min != Integer.MAX_VALUE ? min : 0;

    }
}