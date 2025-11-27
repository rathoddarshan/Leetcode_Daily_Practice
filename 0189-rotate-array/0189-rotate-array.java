class Solution {
    public void rotate(int[] nums, int k) {

        // List<Integer> res = new ArrayList<>();
        int [] temp = new int[nums.length];
        int l=0;
        int n = nums.length;
        k = k%n;
        for(int i=n-k; i<nums.length; i++){
            temp[l++] = nums[i];
        }

        for(int i=0; i<n-k; i++){
            temp[l++] = nums[i];
        }

        for(int i=0; i<temp.length; i++){
            nums[i] = temp[i];
        }
        
    }
}