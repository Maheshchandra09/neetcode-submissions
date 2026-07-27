class TrieNode{
    TrieNode[] children;
    private boolean isEnd;

    public TrieNode(){
        this.isEnd = false;
        this.children = new TrieNode[26];
    } 
}

class PrefixTree {
    
    private TrieNode root;

    public PrefixTree() {
         this.root = new TrieNode();
    }

    public void insert(String word) {
        TrieNode temp = root;
        for(int i=0;i<word.length();i++){
            boolean isEnd = i == word.length()-1;
            int index = word.charAt(i)-'a';
            if(temp.children[index]==null){
                temp.children[index] = new TrieNode();
            }
            temp = temp.children[index];
        }
        temp.isEnd = true;
    }

    public boolean search(String word) {
        TrieNode temp = root;
        for(int i=0;i<word.length();i++){
            int index = word.charAt(i)-'a';
            if(temp.children[index]==null)
                return false;
            else
                temp = temp.children[index];
        }
        return temp.isEnd;
    }

    public boolean startsWith(String prefix) {
        TrieNode temp = root;
        for(int i=0;i<prefix.length();i++){
            int index = prefix.charAt(i)-'a';
            if(temp.children[index]==null)
                return false;
            else
                temp = temp.children[index];
        }
        return true;
    }
}
