class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> freq = new HashMap<>();
        for(int i : nums){
            if(!freq.containsKey(i)){
                freq.put(i,1);
            }
            else{
                freq.put(i,freq.get(i)+1);
            }
        }
        int topk[] = new int[k];
        List<Integer> keys = new ArrayList<>(freq.keySet());
        Collections.sort(keys, (k1,k2)->freq.get(k2)-freq.get(k1));
        for(int i=0;i<k;i++){
            topk[i]=keys.get(i);
        }
        return topk;
    }
}
