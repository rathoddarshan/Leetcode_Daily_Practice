class Solution {
    public int lengthOfLongestSubstring(String s) {

        int longLen = 0;

        HashSet<Character> seen = new HashSet<>();
        int l = 0;
        int r = 0;

        int n = s.length();
        while(r<n){
            if(!seen.contains(s.charAt(r))){
                seen.add(s.charAt(r));
                longLen = Math.max(longLen, r-l+1);
                r++;
            }
            else{
                seen.remove(s.charAt(l));
                l++;
            }
        }
        return longLen;
        
    }

}