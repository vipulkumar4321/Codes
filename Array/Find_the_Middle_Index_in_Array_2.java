//https://leetcode.com/problems/find-the-middle-index-in-array/
class Solution {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length;
        int sum=0, left=0, right=0;
        
        for(int i=0; i<n; i++) {
            sum += nums[i];
        }
        right = sum - nums[0];
        for(int i=0; i<n; i++) {
            if(i > 0) {
                left += nums[i-1];
                right -= nums[i];
            }
            if(left == right) {
                return i;
            }
        }
        
        return -1;
    }
}
