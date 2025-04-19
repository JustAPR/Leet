class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int area = 0;

        while(left<right){
            int w = right - left;
            int h = Math.min(height[left],height[right]);
            area = Math.max(area,w*h);

            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return area;
    }
}