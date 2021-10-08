//https://leetcode.com/problems/sort-array-by-parity-ii/
class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int p = 0;
        int q = 1;
        
        for(int i=0; i<n; i++) {
            if(nums[i]%2 == 0) {
                ans[p] = nums[i];
                p += 2;
            } else {
                ans[q] = nums[i];
                q += 2;
            }
        }
        
        return ans;
    }
}
