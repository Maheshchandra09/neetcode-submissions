class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int oc = image[sr][sc];
        if (oc == color) {
            return image;
        }
        
        int i=sr,j=sc,m=image.length, n=image[0].length;
        
        Queue<int[]>q = new LinkedList<>();
        q.offer(new int[]{sr,sc});
        image[sr][sc] = color;
        int[][] dirs = {{0,1},{1,0},{-1,0},{0,-1}};
        while(!q.isEmpty()){
            int [] p = q.remove();
            int x = p[0], y = p[1]; 
            for(int[] d:dirs){
                int nx = x+d[0];
                int ny = y+d[1];
                if(isValidPixel(oc,nx,ny,m,n,image)){
                    image[nx][ny] = color;
                    q.add(new int[]{nx,ny});
                }
            }    
        }
        return image;
    }
    public boolean isValidPixel(int oc, int i, int j, int m,int n, int[][]image){
        if(i>=0 && j>=0 && i<m && j<n && image[i][j]==oc){
            return true;
        }
        return false;
    }
}