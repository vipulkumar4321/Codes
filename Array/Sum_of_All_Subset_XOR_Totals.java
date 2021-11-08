//https://leetcode.com/problems/sum-of-all-subset-xor-totals/
class Solution {
    public int subsetXORSum(int[] nums) {
        int n = nums.length;
        int sum=0, temp=0;
        
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<(1<<n); i++) {
            for(int j=0; j<n; j++) {
                if((i & (1<<j)) > 0) {
                    list.add(nums[j]);
                }
            }
            temp = listXOR(list);
            sum += temp;
            temp = 0;
            list.clear();
        }
        
        return sum;
    }
    
    public static int listXOR(List<Integer> list) {
        int xor = 0;
        for(int x: list) {
            xor ^= x;
        }
        return xor;
    }
}
