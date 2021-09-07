//https://leetcode.com/problems/maximum-product-difference-between-two-pairs/
class Solution {
    public int maxProductDifference(int[] nums) {
        int max1, max2;
        max1 = max2 = Integer.MIN_VALUE;
        int min1, min2;
        min1 = min2 = Integer.MAX_VALUE;
        int n = nums.length;
        
        for(int i: nums) {
            if(i > max1) {
                max2 = max1;
                max1 = i;
            } else if(i == max1) {
                max2 = i;
                max1 = i;
            } else if(i < max1 && i > max2) {
                max2 = i;
            }
            
            if(i < min1) {
                min2 = min1;
                min1 = i;
            } else if(i == min1) {
                min1 = i;
                min2 = i;
            } else if(i > min1 && i < min2) {
                min2 = i;
            }
        }
        
        System.out.println(max1 + " " + max2);
        System.out.println(min1 + " " + min2);
        
        return (max1*max2)-(min1*min2);
    }
}
