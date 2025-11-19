class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int countZero = 0;
        boolean seenOne = false;

        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1){
                if(seenOne){
                    if(countZero < k){
                        return false;
                    }
                }

                seenOne = true;
                countZero = 0;
            }
            else{
                if(seenOne){
                    countZero++;
                }
            }

        }

        return true;
        
    }
}