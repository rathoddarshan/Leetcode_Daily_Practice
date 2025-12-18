class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        Set<List<Integer>> res= new HashSet<>();

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i], i);
        }

        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                int num = -(nums[i] + nums[j]);
                if(map.containsKey(num) && map.get(num)>j){
                    List<Integer> temp = Arrays.asList(nums[i], nums[j], num);
                    Collections.sort(temp);
                    res.add(temp);
                }
            }
        }

        return new ArrayList<>(res);
        
    }
}