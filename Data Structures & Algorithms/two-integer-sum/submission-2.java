class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> arrayMap = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            int diff = target - nums[i];
            if(arrayMap.containsKey(diff)){
                return new int[]{ arrayMap.get(diff),i};
            }
            arrayMap.put(nums[i],i);
        }
        return new int[0];
    }
}
