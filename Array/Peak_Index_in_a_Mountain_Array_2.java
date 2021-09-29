//https://leetcode.com/problems/peak-index-in-a-mountain-array/
class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int i=0;
        for(i=0; i<arr.length-1; i++) {
            if(arr[i] > arr[i+1]) {
                return i;
            }
        }
        
        return arr[i];
    }
}
