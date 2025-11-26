class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int l = 0;
        int r = 0;
        int i=0;

        int [] temp = new int[m+n];
        while(r<m && l<n){
            if(nums1[r] <= nums2[l]){
                temp[i++] = nums1[r++];
            }
            else{
                temp[i++] = nums2[l++];
                
            }
        }

        while (r < m) {
            temp[i++] = nums1[r++];
        }

        while (l < n) {
            temp[i++] = nums2[l++];
        }


        for(int j=0; j<m+n; j++){
            nums1[j] = temp[j];
        }
        
    }
}