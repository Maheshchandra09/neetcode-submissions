class Solution {
    private int startidx=0;
    private int maxlen = 0;
    public String longestPalindrome(String s) {
        
        for(int i=0;i<s.length();i++){
            validate(s,i,i);
            validate(s,i,i+1);
        }
        return s.substring(startidx,startidx+maxlen);
    }

    public void validate(String s, int l,int r){
        int len=0;

        while(l>=0 && r<s.length() && s.charAt(l)==s.charAt(r)){
            l--;
            r++;
        }

        len = r-l-1;
        if(len>maxlen){
            maxlen = len;
            startidx=l+1;
        }
    }
}
