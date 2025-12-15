class Solution {
    public boolean isSubsequence(String s, String t) {
        int lenS = 0;
        int lenT = 0;

        while(lenS < s.length() && lenT < t.length()){
            if(s.charAt(lenS) == t.charAt(lenT)){
                lenS++;
            }

            lenT++;
        }

        return lenS == s.length();
        
    }
}