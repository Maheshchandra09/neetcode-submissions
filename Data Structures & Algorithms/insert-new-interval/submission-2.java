class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        int i=0;
        List<int[]>intvs = new ArrayList<>();
        while(i<intervals.length && intervals[i][1]<newInterval[0]){
            intvs.add(intervals[i]);
            i++;
        }
        
        while(i<intervals.length && intervals[i][0]<=newInterval[1]){
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }
        intvs.add(newInterval);
        while(i<intervals.length)
            intvs.add(intervals[i++]);
        return intvs.toArray(new int[intvs.size()][]);
                            
    }
}
