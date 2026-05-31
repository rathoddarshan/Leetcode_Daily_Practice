class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {

        int i = 0;
        long resMass = mass;
        Arrays.sort(asteroids);

        if(asteroids[0] > mass){
            return false;
        }
        while(i<asteroids.length){
            if(asteroids[i] > resMass){
                return false;
            }
            else{
                resMass += asteroids[i];
            }

            i++;
        }

        return true;
        
    }
}