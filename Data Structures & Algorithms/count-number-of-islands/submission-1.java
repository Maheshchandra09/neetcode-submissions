class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length, n=grid[0].length, count = 0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1'){
                    dfs(i,j,m,n,grid);
                    count+=1;
                }
            }
        }     

        return count;
    }

    public void dfs(int i, int j,int m,int n, char[][]grid){
        if(i>=m||i<0||j<0||j>=n||grid[i][j]=='0')
            return;
        grid[i][j] = '0';
        dfs(i+1,j,m,n,grid);
        dfs(i-1,j,m,n,grid);
        dfs(i,j+1,m,n,grid);
        dfs(i,j-1,m,n,grid);
    }
}
