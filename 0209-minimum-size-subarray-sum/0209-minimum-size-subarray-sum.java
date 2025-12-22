class Solution {
    public int minSubArrayLen(int target, int[] nums) {

        int minLen = Integer.MAX_VALUE;
        int l = 0;
        int r = 0;
        int n = nums.length;

        int sum = 0;
        while(r<n){
            sum += nums[r];
            if(sum < target){
                r++;
            }
            else if(sum >= target){
                minLen = Math.min(minLen, r-l);
                l++;
                r = l;
                sum = 0;
            }
        }

        if(minLen == Integer.MAX_VALUE){
            return 0;
        }

        return minLen+1;
        
    }
}