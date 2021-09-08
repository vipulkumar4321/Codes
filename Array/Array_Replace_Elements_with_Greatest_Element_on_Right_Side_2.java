//https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/
class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        int max = -1;
        int temp = 0;
        
        for(int i=n-1; i>=0; i--) {
            temp = arr[i];
            arr[i] = max;
            if(temp > max)
                max = temp;
        }
      
        return arr;
    }
}
