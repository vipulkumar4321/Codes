//https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/
class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        
        for(int i=0; i<n-1; i++) {
            int max = maxNum(Arrays.copyOfRange(arr, i+1, n));
            ans[i] = max;
        }
        
        ans[n-1] = -1;
        
        return ans;
    }
    
    public static int maxNum(int[] arr) {
        int max=Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        
        return max;
    }
}
