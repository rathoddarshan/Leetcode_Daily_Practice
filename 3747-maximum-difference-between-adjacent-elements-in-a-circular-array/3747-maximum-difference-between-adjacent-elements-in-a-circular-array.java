class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int maxDiff = 0;
        int n = nums.length;
        for(int i=1; i<n; i++){
            int diff = Math.abs(nums[i] - nums[i-1]);
            maxDiff = Math.max(maxDiff, diff);
        }
        return Math.max(maxDiff, Math.abs(nums[n-1]-nums[0]));
        
    }
}