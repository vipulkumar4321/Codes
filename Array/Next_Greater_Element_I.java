//https://leetcode.com/problems/next-greater-element-i/
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int[] ans = new int[n];
        // Arrays.fill(ans, -1);
        
        for(int i=0; i<n; i++) {
            ans[i] = nextGreaterNumber(nums2, nums1[i]);
        }
        
        return ans;
    }
    
    public static int nextGreaterNumber(int[] arr, int num) {
        int ngn = -1;
        int idx = 0;
        
        for(int i=0; arr[i]!=num; i++) {
            idx++;
        }
        
        for(int i=idx+1; i<arr.length; i++) {
            if(arr[i] > num) {
                ngn = arr[i];
                break;
            }
        }

        return ngn;        
    }
}
