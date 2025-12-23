class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        var seen = new HashMap<Character, Integer>();
        for(char ch : magazine.toCharArray()){
            seen.put(ch, seen.getOrDefault(ch, 0)+1);
        }

        var noteSet = new HashMap<Character, Integer>();
        for(char ch : ransomNote.toCharArray()){
            noteSet.put(ch, noteSet.getOrDefault(ch, 0)+1);
        }
        for(char ch : noteSet.keySet()){
            if(!seen.containsKey(ch) || seen.get(ch) < noteSet.get(ch)){
                return false;
            }            
        }

        return true;
        
    }
}