class Solution {
    private String[] letters = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    private List<String>res= new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        if(digits.length()==0){
            return res;
        }
        StringBuilder sb = new StringBuilder();
        combs(sb,digits,0);
        return res;
    }
    public void combs(StringBuilder sb,String digits,int idx){
        if(sb.length()==digits.length()){
            res.add(sb.toString());
            return;
        }
        String word = letters[digits.charAt(idx)-'0'];
        for(int i=0;i<word.length();i++){
            sb.append(word.charAt(i));
            combs(sb,digits,idx+1);
            sb.deleteCharAt(idx);
        }
    }
}
