class Solution {
    public int minOperations(int[] nums) {
        int n = nums.length;
        int o = 0;
        for(int i = 0;i<=n-3;i++){
            if(nums[i] == 0){
                nums[i] ^= 1;
                nums[i+1] ^= 1;
                nums[i+2] ^=1;
                o++;
            }
        }
        for(int num: nums){
            if (num == 0){
                return -1;
            }
        }
        return o;
    }
}