class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod = 1;
        int countZero = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                prod *= nums[i];
            }
            else{
                countZero++;
            }
        }

        
        for(int i=0; i<nums.length; i++){
            if(countZero == 0){
                // nums[i] = Math.abs(nums[i]);
                nums[i] = prod / nums[i];
            }
            if(countZero == 1){
                if(nums[i] == 0){
                    nums[i] = prod;
                }
                else{
                    nums[i] = 0;
                }
            }
            if(countZero > 1){
                nums[i] = 0;
            }
        }

        return nums;

    }
}