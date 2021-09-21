//https://leetcode.com/problems/sort-array-by-parity/submissions/
class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int i=0, j=n-1;

        while(i < j) {
            if((nums[i] % 2 == 1) && (nums[j] % 2 == 0)) {
                nums[i] = nums[i]^nums[j];
                nums[j] = nums[i]^nums[j];
                nums[i] = nums[i]^nums[j];
            }
            
            if(nums[i] % 2 == 0) 
                i++;
            if(nums[j] % 2 == 1) 
                j--;
        }
        
        return nums;
    }
}
