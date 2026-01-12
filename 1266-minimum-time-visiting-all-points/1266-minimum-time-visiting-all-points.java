class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {

        int total = 0;
        int max = 0;

        int m = points.length;
        int n = points[0].length;

        for(int i=0; i<m-1; i++){
            max = Math.max(Math.abs(points[i][0] - points[i+1][0]), Math.abs(points[i][1] - points[i+1][1]));
            System.out.println(max);
            total += max;
        }

        return total;
        
    }
}