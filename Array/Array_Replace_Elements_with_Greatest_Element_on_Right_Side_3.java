//https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/submissions/
class Solution {
    public int[] replaceElements(int[] arr) {
        int m = -1;
        int i=arr.length-1;
      
        while(i>=0) {
            int t = arr[i];
            arr[i] = m;
            m = Math.max(t, m);
            i--;
        }
      
        return arr;
    }
}
