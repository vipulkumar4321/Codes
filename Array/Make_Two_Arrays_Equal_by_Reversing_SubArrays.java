//https://leetcode.com/problems/make-two-arrays-equal-by-reversing-sub-arrays/
class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        Arrays.sort(target);
        Arrays.sort(arr);
        
        boolean ans = true;
        
        if(target.length != arr.length) {
            return false;
        }
        
        for(int i=0; i<target.length; i++) {
            if(target[i] != arr[i]) {
                ans = false;
                break;
            }
        }
        
        return ans;
    }
}
