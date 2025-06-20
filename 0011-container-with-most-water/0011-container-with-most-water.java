class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0;
        int l = 0;
        int r = height.length-1;

        while(l<r){
            int area = (r-l)*Math.min(height[l], height[r]);

            if(height[l] > height[r]){
                r--;
            }
            else{
                l++;
            }

            maxWater = Math.max(maxWater, area);
        }
        return maxWater;
    }
}