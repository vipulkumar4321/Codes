//https://leetcode.com/problems/truncate-sentence/
class Solution {
    public String truncateSentence(String s, int k) {
        String[] arr = s.split(" ");
        StringBuilder sbAns = new StringBuilder("");
        
        int i=0;
        for(; i<k-1; i++) {
            sbAns.append(arr[i] + " ");
        }
        sbAns.append(arr[i]);
        
        return sbAns.toString();
    }
}
