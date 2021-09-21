//https://leetcode.com/problems/sort-array-by-parity/
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int k=0, j=n-1;
        int[] ans = new int[n];
        
        for(int i=0; i<n; i++) {
            if(nums[i]%2 == 0) {
                ans[k] = nums[i];
                k++;
            } else {
                ans[j] = nums[i];
                j--;
            }
        }
        
        return ans;
    }
}
