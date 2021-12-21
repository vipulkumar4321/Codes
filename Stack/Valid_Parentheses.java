//https://leetcode.com/problems/valid-parentheses/
class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        
        for(char ch: s.toCharArray()) {
            
            if(ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else if(ch == ')') {
                if(stack.size() == 0) {
                    return false;
                } else if(stack.peek() != '(') {
                    return false;   
                } else {
                    stack.pop();
                }
            } else if(ch == '}') {
                if(stack.size() == 0) {
                    return false;
                } else if(stack.peek() != '{') {
                    return false;   
                } else {
                    stack.pop();
                }
            } else if(ch == ']') {
                if(stack.size() == 0) {
                    return false;
                } else if(stack.peek() != '[') {
                    return false;   
                } else {
                    stack.pop();
                }
            }
        }
        
        if(stack.size() == 0) {
            return true;
        } else {
            return false;
        }
    }
}
