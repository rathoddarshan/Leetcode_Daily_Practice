class Solution {
    public int mostFrequentEven(int[] nums) {

        int res = -1;
        int maxFreq = 0;

        var map = new HashMap<Integer, Integer>();
        for(int n : nums){
            if(n%2 == 0){
                int freq = map.getOrDefault(n, 0)+1;
                map.put(n, freq);
                if(freq > maxFreq || freq == maxFreq && n < res || res == -1){
                    maxFreq = freq;
                    res = n;
                }
            }
        }
        return res;
        
    }
}