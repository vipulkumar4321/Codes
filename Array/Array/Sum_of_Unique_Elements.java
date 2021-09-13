//https://leetcode.com/problems/sum-of-unique-elements/
class Solution {
    public int sumOfUnique(int[] nums) {
        int sum = 0;
        int[] ans = new int[101];
        int n = nums.length;
    
        for(int i=0; i<n; i++)
            ans[nums[i]] += 1;
        
        for(int i=0; i<=100; i++)
            if(ans[i] == 1)
                sum += i;
        
        return sum;
    }
}
