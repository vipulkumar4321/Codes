//https://leetcode.com/problems/reverse-words-in-a-string-iii/
class Solution {
    public String reverseWords(String s) {
        String[] strs = s.split(" ");
        StringBuilder[] sb=new StringBuilder[strs.length];
        for (int i = 0; i < sb.length; i++) {
            sb[i] = new StringBuilder("");
        }
        StringBuilder ans = new StringBuilder();
        
        for(int i=0; i<strs.length; i++) {
            sb[i].append(strs[i]);
            sb[i].reverse();
            ans.append(sb[i]);
            ans.append(" ");
        }
        
        ans.setLength(ans.length()-1);
        
        return ans.toString();
    }
}
