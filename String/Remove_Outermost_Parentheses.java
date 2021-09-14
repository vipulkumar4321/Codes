//https://leetcode.com/problems/remove-outermost-parentheses/
class Solution {
    public String removeOuterParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        StringBuilder temp = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        boolean flag = false;
        int n = s.length();
        
        for(int i=0; i<n; i++) {
            char ch = s.charAt(i);
            
            if(ch == '(') {
                stack.push(ch);
            } else {
                stack.pop();      
            } 
            
            if(flag == true) {
                temp.append(ch);
            }
            
            flag = true;
            
            if(stack.empty() == true) {
                ans.append(temp.deleteCharAt(temp.length() - 1));
                flag = false;
                temp.setLength(0);
            }
        }
        
        return ans.toString();
    }
}
