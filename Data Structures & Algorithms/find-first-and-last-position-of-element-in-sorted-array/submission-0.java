class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = binarysearch(nums,target,true);
        int right = binarysearch(nums,target,false);
        return new int[]{left,right};
    }
    public int binarysearch(int []nums, int t,boolean leftsearch){
        int l=0,r=nums.length-1,found=-1;
        while(l<=r){
            int m = l+(r-l)/2;
            int x = nums[m];
            if(t<x){
                r=m-1;
            }
            else if(t>x){
                l=m+1;
            }
            else{
                found = m;
                if(leftsearch){
                    r=m-1;
                }
                else{
                    l=m+1;
                }
            }
        }
        return found;
    }
}