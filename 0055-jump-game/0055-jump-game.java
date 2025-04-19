class Solution {
    public boolean jump(int[] nums) {
        int r = 0;
        for(int i = 0;i<nums.length -1;i++){
            if(i>r){
                return false;
            }
            r = Math.max(r,nums[i] + i);

            if(r >= nums.length - 1){
                return true;
            }
        }
        return true;
    }
}