//https://leetcode.com/problems/rotate-array/
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int point = n - k%n;
        reverse(nums, 0, point-1);
        reverse(nums, point, n-1);
        reverse(nums, 0, n-1);
    }
    
    public static void reverse(int[] nums, int l, int h) {
        while(l < h) {
            int temp = nums[l];
            nums[l] = nums[h];
            nums[h] = temp;
            l++;
            h--;
        }
    }
}
