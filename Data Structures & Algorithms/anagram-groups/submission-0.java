class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> l = new ArrayList<>();
        int arr[] = new int[strs.length];
        for(int i=0;i<strs.length;i++){
            if(arr[i]==1)
                continue;
            List<String> anagrams = new ArrayList<>();
            anagrams.add(strs[i]);
            for(int j=i+1;j<strs.length;j++){
                if(arr[j]!=1 && strs[i].length() == strs[j].length()){
                    int a[] = new int[26];
                    for(int k=0;k<strs[i].length();k++){
                        a[strs[i].charAt(k) - 'a']++;
                        a[strs[j].charAt(k) - 'a']--;
                    }
                    boolean isAnagram = true;
                    for(int k=0;k<26;k++){
                        if(a[k]!=0){
                            isAnagram = false;
                        }
                    }
                    if(isAnagram){
                        arr[j]=1;
                        anagrams.add(strs[j]);
                    }
                }
            }
            arr[i]=1;
            l.add(anagrams);
        }
        return l;
    }
}
