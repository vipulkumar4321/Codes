//https://leetcode.com/problems/delete-columns-to-make-sorted/
class Solution {
    public int minDeletionSize(String[] strs) {
        int count=0;
        int m = strs.length;
        int n = strs[0].length();
        
        for(int i=0; i<n; i++) {
            for(int j=0; j<m-1; j++) { 
                if(strs[j].charAt(i) > strs[j+1].charAt(i)) {
                    count++;
                    break;
                }
            }
        }
        
        return count;
    }
}
