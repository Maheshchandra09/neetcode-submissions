class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer> m = new HashMap<>();
        int len=0;
        for(int i=0;i<s.length();i++){
            m.put(s.charAt(i),m.getOrDefault(s.charAt(i),0)+1);
            if(m.get(s.charAt(i))%2==0)
                len+=2;
        }
        for(int x: m.values()){
            if(x%2==1){
                len+=1;
                break;
            }
        }
        return len;
    }
}