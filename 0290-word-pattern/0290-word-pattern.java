class Solution {
    public boolean wordPattern(String pattern, String s) {

        int m = pattern.length();
        String [] str = s.split(" ");
        int n = str.length;

        if(n != m){
            return false;
        }

        var map1 = new HashMap<Character, String>();
        var map2 = new HashMap<String, Character>();

        for(int i=0; i<m; i++){
            Character ch = pattern.charAt(i);
            String st = str[i];

            if((map1.containsKey(ch)) && !map1.get(ch).equals(st)){
                return false;
            }
            if(map2.containsKey(st) && !map2.get(st).equals(ch)){
                return false;
            }

            map1.put(ch, st);
            map2.put(st, ch);
            System.out.println(st);
            System.out.println(ch);

            System.out.println(map1 + " " + map2);
        }

        return true;
        
    }
}