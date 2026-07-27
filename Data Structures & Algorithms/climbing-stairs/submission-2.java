class Solution {
    public int climbStairs(int n) {
        if(n<=2){
            return n;
        }
        int first = 1, second=2, cur=0;
        for(int i=3;i<=n;i++){
            cur = first+second;
            first=second;
            second=cur;
        }
        return cur;
    }
}
