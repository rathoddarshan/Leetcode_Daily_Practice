class Solution {
    public boolean isValid(String word) {

        if(word.length() < 3){
            return false;
        }
        HashSet<Character> vowel = new HashSet<>(Set.of('a', 'e', 'i', 'o', 'u'));
        
        boolean number = false;
        boolean vow = false;
        boolean  cons = false;

        for(char ch : word.toCharArray()){
            if(!Character.isLetterOrDigit(ch)){
                return false;
            }

            if(Character.isDigit(ch)){
                number = true;
            }
            else{
                char lower = Character.toLowerCase(ch);

                if(vowel.contains(lower)){
                    vow = true;
                }
                else{
                    cons = true;    
                }
            }
        }

        return vow && cons;


        
    }
}