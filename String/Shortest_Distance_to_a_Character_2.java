//https://leetcode.com/problems/shortest-distance-to-a-character/
class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] arr = new int[n];
        int temp = Integer.MIN_VALUE/2;
        for(int i=0; i<n; i++) {
            if(s.charAt(i) == c)
                temp = i;
            arr[i] = i - temp;
        }
        
        temp = Integer.MAX_VALUE/2;
        for(int i=n-1; i>=0; i--) {
            if(s.charAt(i) == c)
                temp = i;
            arr[i] = Math.min(arr[i], temp-i);
        }
        
        return arr;
    }
}
