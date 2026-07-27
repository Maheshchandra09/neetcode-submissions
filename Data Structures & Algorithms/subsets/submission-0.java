class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> subsets = new ArrayList<>();
        List<Integer> s = new ArrayList<>();
        dfs(nums,0,s,subsets);
        return subsets;
    }

    public void dfs(int []nums, int index, List<Integer> s,List<List<Integer>> subsets){
        if(index>=nums.length){
            subsets.add(new ArrayList<>(s));
            return;
        }
        s.add(nums[index]);
        dfs(nums,index+1,s,subsets);
        s.remove(s.size()-1);
        dfs(nums,index+1,s,subsets);

    }
}
