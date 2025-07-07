class Solution {
    public int findLucky(int[] arr) {

        var map = new HashMap<Integer, Integer>();
        int luckyNum = -1;

        for(int num : arr){
            int freq = map.getOrDefault(num, 0)+1;
            map.put(num, freq);
        }

        for(Map.Entry<Integer, Integer> e : map.entrySet()){
            if(e.getValue() == e.getKey() && e.getKey() > luckyNum){
                luckyNum = e.getKey();
            }
        }

        return luckyNum;
        
    }
}