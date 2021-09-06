//https://leetcode.com/problems/truncate-sentence/
class Solution {
    public String truncateSentence(String s, int k) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        
        for(char ch : s.toCharArray()) {
            if(count == k) {
                break;
            }
            
            if(ch == ' ' && count < k) {
                count++;
                sb.append(ch);
            } else {
                sb.append(ch);
            }
        }
        
        if(sb.charAt(sb.length()-1) == ' ') {
            sb.deleteCharAt(sb.length()-1);
        }
        
        return sb.toString();
    }
}
