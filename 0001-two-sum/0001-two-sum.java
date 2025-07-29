class Solution {
    public int[] twoSum(int[] nums, int target) {

        return result(nums, target, 0);
        
    }
    private int[] result(int []nums, int target, int i){
        if(i >= nums.length){
            return new int[]{};
        }

        for(int j=i+1; j<nums.length; j++){
            if(nums[i] + nums[j] == target){
                return new int []{i, j};
            }
        }
        return result(nums, target, i+1);
    }
}