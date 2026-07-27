class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<int[]> rotten = new LinkedList<>();
        int m = grid.length, n=grid[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==2)
                    rotten.offer(new int[]{i,j});
            }
        }
        int [][]dirs = {{0,1},{0,-1},{1,0},{-1,0}};
        int time=0;
        while(!rotten.isEmpty()){
            int s = rotten.size();
            boolean convert = false;
            for(int i=0;i<s;i++){
                int[] c = rotten.poll();
                for(int d[]:dirs){
                    int x = c[0]+d[0];
                    int y = c[1]+d[1];
                    if(x>=0 && y>=0 && x<m && y<n && grid[x][y]==1){
                        rotten.offer(new int[]{x,y});
                        grid[x][y]=2;
                        convert = true;
                    }
                }
            }
            if(convert) time++;
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1)
                    return -1;
            }
        }
        return time;
    }
}
