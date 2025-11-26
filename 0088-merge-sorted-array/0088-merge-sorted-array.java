class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int l = 0;
        while(l<n){
            nums1[l+m] = nums2[l];
            l++;
        }
        Arrays.sort(nums1);

        
    }
}