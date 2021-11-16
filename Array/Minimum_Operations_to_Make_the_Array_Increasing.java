//https://leetcode.com/problems/minimum-operations-to-make-the-array-increasing/
class Solution {
    public int minOperations(int[] nums) {
        int move=0, prev=nums[0];
        
        for(int i=1; i<nums.length; i++) {
            if(prev >= nums[i]) {
                int diff = prev - nums[i];
                move += (diff + 1);
                prev += 1;
            } else {
                prev = nums[i];
            }
        }
        return move;
    }
}
