//https://leetcode.com/problems/find-xor-sum-of-all-pairs-bitwise-and/
class Solution {
    public int getXORSum(int[] arr1, int[] arr2) {
        int arr1Xor = 0;
        int arr2Xor = 0;
        
        for(int i: arr1) 
            arr1Xor ^= i;
        for(int i: arr2)
            arr2Xor ^= i;
        
        return arr1Xor & arr2Xor;
    }
}
