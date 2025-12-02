class Solution {
    public int hIndex(int[] citations) {

        Arrays.sort(citations);

        int n = citations.length;
        int h = 0;

        for(int i=n-1; i>=0; i--){
            int paper = n-i;
            if(citations[i] >= paper){
                h = paper;
            }
            else break;
        }

        return h;
        
    }
}