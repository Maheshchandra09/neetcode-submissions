class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        Map<Character,Integer> sf = new HashMap<>();
        Map<Character, Integer> tf = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char x = s.charAt(i);
            if(sf.containsKey(x)){
                sf.put(x,sf.get(x)+1);
            }
            else{
                sf.put(x,1);
            }
            char y = t.charAt(i);
            if(tf.containsKey(y)){
                tf.put(y,tf.get(y)+1);
            }
            else{
                tf.put(y,1);
            }
        }
        for(int i = 0 ; i<s.length();i++){
            if(!sf.get(s.charAt(i)).equals(tf.get(s.charAt(i)))){
                return false;
            }
        }
        return true;
    }
}
