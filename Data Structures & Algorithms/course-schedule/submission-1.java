class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer,List<Integer>> m = new HashMap<>();
        for(int i=0;i<numCourses;i++)
            m.put(i,new ArrayList<>());
            
        for(int[]c:prerequisites){
            if(!m.containsKey(c[0])){
                List<Integer> l =new ArrayList<>();
                l.add(c[1]);
                m.put(c[0],new ArrayList<>());
            }
            else{
                List<Integer> l = m.get(c[0]); 
                l.add(c[1]);
                m.put(c[0],l);
            }
        }
        Set<Integer>s = new HashSet<>();
        for(int i=0;i<numCourses;i++){
            if(!dfs(i,s,m)){
                return false;
            }
        }
        return true;
    }

    public boolean dfs(int c,Set<Integer>s,Map<Integer,List<Integer>>m){
        if(s.contains(c))
            return false;

        if(m.get(c).isEmpty())
            return true;

        s.add(c);
        for(int i: m.get(c)){
            if(!dfs(i,s,m)){
                return false;
            }
        }
        s.remove(c);
        m.put(c,new ArrayList<>());
        return true;
    }
}
