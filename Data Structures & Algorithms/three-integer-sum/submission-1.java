class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> triplets = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int j=i+1,k=nums.length-1;
            while(j<k){
                int x = nums[i]+nums[j]+nums[k];
                if(x<0){
                    j++;
                }
                else if(x>0){
                    k--;
                }
                else if (x==0){
                    triplets.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    k--;
                    j++;
                    while(j<k && nums[j]==nums[j-1]){
                        j++;

                    }
                }
            }
        }
        return triplets;
    }
}
