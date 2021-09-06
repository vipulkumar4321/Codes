//https://leetcode.com/problems/find-greatest-common-divisor-of-array/
class Solution {
    public int findGCD(int[] nums) {
        int max=Short.MIN_VALUE, min=Short.MAX_VALUE;

        for(int i=0; i<nums.length; i++) {
            if(nums[i] > max) {
                max = nums[i];
            }    
            
            if(nums[i] < min) {
                min = nums[i];
            }
        }
        
        int ans = gcd(min, max);
        
        return ans;
    }
    
    public static int gcd(int a, int b) {
        if(b == 0) 
            return a;
        return gcd(b, a%b);
    }
}
