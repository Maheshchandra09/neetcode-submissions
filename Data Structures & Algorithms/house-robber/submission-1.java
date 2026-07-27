class Solution {
    public int rob(int[] nums) {
        int max = 0;
        if(nums.length==0)
            return 0;
        if(nums.length==1){
            return nums[0];
        }
        int first = nums[0], second = Math.max(nums[0],nums[1]);
        for(int i=2;i<nums.length;i++){
            max = Math.max(first+nums[i],second);
            first = second;
            second = max;
        }
        return second;
    }
}
