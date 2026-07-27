class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s : strs){
            sb.append(s.length());
            sb.append("#");
            sb.append(s);
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> res = new ArrayList<>();
int i = 0;
while (i < str.length()) {
    String num = "";
    while (Character.isDigit(str.charAt(i))) {
        num += str.charAt(i);
        i++;
    }
    if (str.charAt(i) == '#') {
        int n = Integer.parseInt(num);
        i += 1; // Move past the '#' to the start of the string data
        
        // Extract the string. Java's substring end index is exclusive, 
        // so we use (i + n) to get exactly 'n' characters.
        res.add(str.substring(i, i + n));
        
        // Move 'i' forward by 'n' to point exactly to the start 
        // of the next encoded string's length.
        i += n;
    }
}
return res;
    }
}
