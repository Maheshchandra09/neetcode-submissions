class Solution {
    public int trap(int[] height) {
        if(height.length==0)
            return 0;
        int l=0,r=height.length-1,leftMax=height[l],rightMax=height[r],totalWater=0;
        while(l<r){
            if(leftMax<rightMax){
                l++;
                leftMax = Math.max(height[l],leftMax);
                totalWater+=leftMax-height[l];
            }
            else{
                r--;
                rightMax=Math.max(height[r],rightMax);
                totalWater+=rightMax-height[r];
            }
        }
        return totalWater;
    }
}
