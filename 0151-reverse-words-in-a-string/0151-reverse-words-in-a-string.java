class Solution {
    public String reverseWords(String s) {

        String [] str = s.trim().split("\\s+");
        String [] temp = new String[str.length];
        int n = str.length;

        for(int i=0; i<n; i++){
            temp[n-i-1] = str[i];
        }

        StringBuilder res = new StringBuilder();
        for(int i=0; i<n; i++){
            res.append(temp[i]);
            if(i != n-1){
                res.append(" ");
            }
        }


        return res.toString();
        
    }
}