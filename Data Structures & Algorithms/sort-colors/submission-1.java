class Solution {
    public void sortColors(int[] nums) {
        int low=0,mid=0,high=nums.length-1,tmp;
        while(mid<=high){
            if(nums[mid]==0){
                tmp = nums[mid];
                nums[mid]=nums[low];
                nums[low] = tmp;
                mid++;
                low++;
            }
            else if(nums[mid]==1){
                mid++;
            }
            else{
                tmp = nums[mid];
                nums[mid]=nums[high];
                nums[high]=tmp;
                high--;
            }
        }
    }
}