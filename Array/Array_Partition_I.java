//https://leetcode.com/problems/array-partition-i/
class Solution {
    public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum = 0;
        
        for(int i=0; i<nums.length; i+=2) {
            sum += nums[i];
        }
        
        return sum;
    }

    public static void main(String[] args) {
      int[] arr = {1,2,3,4};
      int x = arrayPairSum(arr);
      System.out.println(x);
    }
}
