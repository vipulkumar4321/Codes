//https://leetcode.com/problems/missing-number
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = 0, temp = 0;
        int i;
        
        for(i=0; i<n; i++) {
            sum += nums[i];
            temp += i;
        }
        temp += i;
        
        return temp - sum;
    }
}
