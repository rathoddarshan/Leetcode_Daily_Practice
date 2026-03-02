class Solution {
    public int longestConsecutive(int[] nums) {

        if(nums.length == 0 || nums.length == 1){
            return nums.length;
        }

        int maxLen = 0;

        // PriorityQueqe<Integer> pq = new PriorityQueqe<>();
        // for(int num : nums){
        //     pq.offer(num);
        // }

        // int count = 0;
        // while(!pq.isEmpty()){

        // }

        Arrays.sort(nums);
        int count = 0;
        for(int i=1; i<nums.length; i++){
            if(nums[i] == nums[i-1]+1){
                count++;
                maxLen = Math.max(maxLen, count);
            }
            else if(nums[i] == nums[i-1]){
                continue;
            }
            else{
                count = 0;
            }
        }

        return maxLen+1;
        
        
    }
}