class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase();

        int l = 0;
        int r = s.length()-1;
        // System.out.println(str.charAt(r));
        boolean flag = true;
        while(l<r){
            while((l<r) && !Character.isLetterOrDigit(str.charAt(l))){
                l++;
            }
            while((l<r) && !Character.isLetterOrDigit(str.charAt(r))){
                r--;
            }

            if(str.charAt(l) !=str.charAt(r)){
                flag = false;
            }

            l++;
            r--;
        } 
        
        return flag;
    }
}