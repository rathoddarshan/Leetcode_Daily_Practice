class Solution {
    public String[] divideString(String s, int k, char fill) {

        int n = s.length();
        int l = 0;

        List<String> res = new ArrayList<>();

        while(l<n){
            StringBuilder sb = new StringBuilder();

            for(int i=0; i<k; i++){
                if(l<n){
                    sb.append(s.charAt(l));
                    l++;
                }
                else{
                    sb.append(fill);
                }
            }
            res.add(sb.toString());
        }
        return res.toArray(new String[0]);
        
    }
}