class Solution {
    public List<String> summaryRanges(int[] nums) {

        List<String> res = new ArrayList<>();
        int n = nums.length;
        if(n==0){
            return res;
        }

        int a = 0;

        for(int b=1; b<=n; b++){
            if(b<n && nums[b] == nums[b-1]+1){
                continue;
            }
            if(a == b-1){
                res.add(String.valueOf(nums[a]));
            }
            else{
                res.add(String.valueOf(nums[a] + "->" + String.valueOf(nums[b-1])));
            }

            a = b;
        }

        return res;


        
    }
}