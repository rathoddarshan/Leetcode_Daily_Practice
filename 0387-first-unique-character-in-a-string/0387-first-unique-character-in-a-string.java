class Solution {
    public int firstUniqChar(String s) {

        var map = new HashMap<Character, Integer>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            int freq = map.getOrDefault(ch, 0)+1;
            map.put(ch, freq);
        }
        for(int i=0; i<s.length(); i++){
            if(map.get(s.charAt(i)) == 1){
                return i;
            }
        }

        return -1;
        
    }
}