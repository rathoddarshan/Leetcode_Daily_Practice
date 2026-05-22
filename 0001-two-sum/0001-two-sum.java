class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for(int i=0; i<n; i++){
            map.put(nums[i], i);
        }

        for(int i=0; i<n; i++){
            int num = nums[i];
            int res = target - num;
            if(map.containsKey(res) && map.get(res)>i){
                System.out.println(i + " " + map.get(res));
                return new int[]{i, map.get(res)};
            }

        }


        return new int[]{};
        
    }
}