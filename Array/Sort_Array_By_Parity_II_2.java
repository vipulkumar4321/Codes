//https://leetcode.com/problems/sort-array-by-parity-ii/
class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int o = 1;
        int e = 0;
        int n = nums.length;
        
        while(e<n && o<n) {
            if(nums[e]%2 > nums[o]%2) {
                int temp = nums[e];
                nums[e] = nums[o];
                nums[o] = temp;
            }
            
            if(nums[e] % 2 == 0)
                e += 2;
            if(nums[o] % 2 != 0) 
                o += 2;
        }
        
        return nums;
    }
}
