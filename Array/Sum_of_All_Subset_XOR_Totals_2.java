//https://leetcode.com/problems/sum-of-all-subset-xor-totals/
class Solution {
    public int subsetXORSum(int[] nums) {
        int n = nums.length;
        int sum=0, temp=0;
        
        for(int i=0; i<(1<<n); i++) {
            for(int j=0; j<n; j++) {
                if((i & (1<<j)) > 0) {
                    temp ^= nums[j];
                }
            }
            sum += temp;
            temp = 0;
        }
        
        return sum;
    }
}
