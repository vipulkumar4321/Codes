//https://leetcode.com/problems/find-the-middle-index-in-array/submissions/
class Solution {
    public int findMiddleIndex(int[] nums) {
        int n = nums.length;
        int ans = -1;
        
        for(int i=0; i<n; i++) {
            int center=i, s1=0, s2=0;
            for(int j=0; j<n; j++) {
                if(center == j) {
                    continue;
                }
                if(j<center) {
                    s1 += nums[j];
                }
                else if(j>center) {
                    s2 += nums[j];
                }
            }
            if(s1 == s2) {
                ans = center;
                break;
            }
        }
        
        return ans;
    }
}
