class Solution {
    public int getCommon(int[] nums1, int[] nums2) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        HashMap<Integer, Integer> seen = new HashMap<>();

        for(int num : nums1){
            seen.put(num, seen.getOrDefault(num, 0)+1);
        }

        for(int num : nums2){
            if(seen.containsKey(num)){
                pq.offer(num);
            }
        }

        if(pq.size() == 0){
            return -1;
        }

        return pq.peek();
        
    }
}