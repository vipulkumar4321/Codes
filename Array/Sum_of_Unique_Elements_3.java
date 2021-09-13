//https://leetcode.com/problems/sum-of-unique-elements/
class Solution {
    public int sumOfUnique(int[] nums) {
        int sum = 0;
        int[] ans = new int[101];
        int n = nums.length;
    
        //Test on copy you will uderstand
        for(int i=0; i<n; i++){
            if(ans[nums[i]] == 1) 
                sum -= nums[i];
            ans[nums[i]]++;
            if(ans[nums[i]] == 1) 
                sum += nums[i];
        }
        
        return sum;
    }
}
