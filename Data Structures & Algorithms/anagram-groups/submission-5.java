class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for(int i = 0; i<strs.length;i++){
            int strFreq[] = new int[26];
            for(int j=0;j<strs[i].length();j++){
                strFreq[strs[i].charAt(j) - 'a']++;
            }
            String freqString = Arrays.toString(strFreq);
            map.putIfAbsent(freqString, new ArrayList());
            map.get(freqString).add(strs[i]);
        }
        return new ArrayList(map.values());   
    }
}
