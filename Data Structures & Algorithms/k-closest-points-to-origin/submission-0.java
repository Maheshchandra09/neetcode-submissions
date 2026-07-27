class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a,b) -> (b[1]*b[1]+b[0]*b[0]) - (a[1]*a[1]+a[0]*a[0])
        );

        for(int[]p:points){
            pq.offer(p);
            if(pq.size()>k){
                pq.poll();
            }
        }

        int[][]pk = new int[k][2];
        while(k>0){
            pk[--k] = pq.poll();
        }
        return pk;

    }
}
