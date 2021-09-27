//https://leetcode.com/problems/height-checker/
class Solution {
    public int heightChecker(int[] heights) {
        int n = heights.length;
        int[] expected = new int[n];
        int count=0;
        
        for(int i=0; i<n; i++) {
            expected[i] = heights[i];
        }
        
        Arrays.sort(expected);
        
        for(int i=0; i<n; i++) {
            if(expected[i] != heights[i])
                count++;
        }
        
        return count;
    }
}
