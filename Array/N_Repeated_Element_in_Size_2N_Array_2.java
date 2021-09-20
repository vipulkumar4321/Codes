//https://leetcode.com/problems/n-repeated-element-in-size-2n-array/
//Pigeon Hole Principle
class Solution {
    public int repeatedNTimes(int[] nums) {
        for(int k = 1 ; k <= 2 ; ++k){
            for(int i = 0 ; i < nums.length - k ; ++i){
                if(nums[i] == nums[i+k]) return nums[i]; 
            }
        }
        return nums[0]; 
    }
}
