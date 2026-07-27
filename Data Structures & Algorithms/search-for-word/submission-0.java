class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    if(dfs(board,word,i,j,0)){
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public boolean dfs(char[][]board,String word, int i,int j,int idx){
        if(idx==word.length()){
            return true;
        }
        if(idx>word.length()){
            return false;
        }
        if(i<0||i>=board.length||j<0||j>=board[0].length
        ||board[i][j]=='#'||board[i][j]!=word.charAt(idx)){
            return false;
        }
        board[i][j]='#';
        boolean res = dfs(board,word,i+1,j,idx+1) ||
        dfs(board,word,i,j+1,idx+1) ||
        dfs(board,word,i-1,j,idx+1) ||
        dfs(board,word,i,j-1,idx+1);
        board[i][j]=word.charAt(idx);
        return res;
    }
}
