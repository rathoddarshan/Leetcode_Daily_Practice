class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = 0;
        int r = nums.length-1;

        while(l<=r){

            int m = (r+l)/2;
            
            if(nums[m] == target){
                return m;
            }

            if(nums[m] < target){
                l = m+1;
                System.out.println(l);
            }
            else{
                r = m-1;
                System.out.println(r);
            }
        }

        return l;
    }
}