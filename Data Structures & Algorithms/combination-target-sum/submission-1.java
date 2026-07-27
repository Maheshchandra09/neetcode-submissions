class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        Set<List<Integer>> res = new HashSet<>();
        List<Integer> l = new ArrayList<>();
        dfs(nums,0,l,res,target);
        return new ArrayList<>(res);
    }

    public void dfs(int []nums, int i, List<Integer> l, Set<List<Integer>>res, int sum){
        if(sum==0){
            res.add(new ArrayList<>(l));
            return;
        }

        if(sum<0 || i>=nums.length){
            return;
        }

        l.add(nums[i]);
        dfs(nums,i,l,res,sum-nums[i]);

        
        // dfs(nums,i+1,l,res,sum-nums[i]);

        l.remove(l.size()-1);
        dfs(nums,i+1,l,res,sum);
    }
}
