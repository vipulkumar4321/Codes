//https://leetcode.com/problems/peak-index-in-a-mountain-array/
//class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int max = -1;
        int temp =-1;
        for(int i=0; i<arr.length; i++) {
            if(temp < arr[i]) {
                temp = arr[i];
                max = i;
            }
        }
        
        return max;
    }
}
