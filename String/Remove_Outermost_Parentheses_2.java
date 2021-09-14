//https://leetcode.com/problems/remove-outermost-parentheses/
class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder ans = new StringBuilder();
        int counter=0;
        ans.ensureCapacity(s.length());
        
        for(char ch : s.toCharArray()) {
            if(ch == '(') {
                counter++;
                if(counter > 1) {
                    ans.append('(');
                }
            } else {
                counter--;
                if(counter > 0) {
                    ans.append(')');
                }
            }
        }
        
        return ans.toString();
    }
}
