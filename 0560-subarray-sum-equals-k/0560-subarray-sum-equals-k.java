class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int preFix = 0;
        int count = 0;
        for(int i=0; i<nums.length; i++){
            preFix += nums[i];
            int remSum = preFix - k;

            if(map.containsKey(remSum)){
                count += map.get(remSum);
            }

            map.put(preFix, map.getOrDefault(preFix, 0)+1);
        }


        return count;
    }
}