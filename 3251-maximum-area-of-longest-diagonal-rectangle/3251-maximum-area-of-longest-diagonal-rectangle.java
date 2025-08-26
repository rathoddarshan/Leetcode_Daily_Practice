class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        int m = dimensions.length;
        int n = dimensions[0].length;

        int maxDia = 0;
       int maxArea = 0;


        for(int i=0; i<m; i++){
            int dia = dimensions[i][0]*dimensions[i][0] + dimensions[i][1]*dimensions[i][1];
            int area = dimensions[i][0]*dimensions[i][1];
            if(dia > maxDia || dia == maxDia && area > maxArea){
                maxDia = dia;
                maxArea = area;
            }
        }

        return maxArea;
        
    }
}