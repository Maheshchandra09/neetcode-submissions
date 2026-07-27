class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length())
            return "";
        int[] have = new int[128];
        int[] need = new int[128];
        int minLength = s.length()+1;
        int startIdx = 0;
        int required=0,formed=0;
        for(int i=0;i<t.length();i++){
            if(need[t.charAt(i)-0]==0)
                required++;
            need[t.charAt(i)-0]++;
        }
        int left = 0, right = 0;
        while(right<s.length()){
            have[s.charAt(right)-0]++;
            if(need[s.charAt(right)]>0 && have[s.charAt(right)-0]==need[s.charAt(right)-0])
                formed++;
            while(formed==required){
                if(right-left+1<minLength)
                {
                    minLength = right - left+1;
                startIdx = left;
                }
                have[s.charAt(left)-0]--;
                if(need[s.charAt(left)]>0 && have[s.charAt(left)-0]<need[s.charAt(left)-0])
                    formed--;
                left++;
            }
                right++;
            }
    
        if(minLength==s.length()+1)
            return "";
        else
            return s.substring(startIdx,startIdx+minLength);
    }
}
