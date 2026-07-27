class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0) return new int[0];
        Deque<Integer> q = new LinkedList<>();
 int left = 0, right = 1;
        q.add(left);
        
        int[] res = new int[nums.length - k + 1]; 
        
        while (right < k) {
            while (!q.isEmpty() && nums[q.peekLast()] < nums[right]) {
                q.removeLast(); 
            }
            q.add(right);
            right++;
        }
        
        int x = 0;
        while (right < nums.length) {
            res[x++] = nums[q.peekFirst()]; 
            if (q.peekFirst() < right - k + 1) {
                q.removeFirst();
            }
            
            while (!q.isEmpty() && nums[q.peekLast()] < nums[right]) {
                q.removeLast();
            }
            
            q.add(right);
            right++;    
            left++;
        }
                res[x] = nums[q.peekFirst()];
        
        return res;
    }
}
