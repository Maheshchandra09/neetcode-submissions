class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length, n=grid[0].length, count = 0;
        boolean visited[][] = new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1' && !visited[i][j]){
                    bfs(i,j,m,n,grid,visited);
                    count+=1;
                }
            }
        }     

        return count;
    }

    public void bfs(int i, int j,int m,int n, char[][]grid, boolean[][]visited){
        if(i>=m||i<0||j<0||j>=n||grid[i][j]=='0'||visited[i][j])
            return;
        visited[i][j] = true;
        bfs(i+1,j,m,n,grid,visited);
        bfs(i-1,j,m,n,grid,visited);
        bfs(i,j+1,m,n,grid,visited);
        bfs(i,j-1,m,n,grid,visited);
    }
}
