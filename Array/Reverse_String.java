//https://leetcode.com/problems/reverse-string/submissions/
class Solution {
    public void reverseString(char[] s) {
        int n = s.length;
        for(int i=0; i<(n/2); i++) {
            char temp = s[n-i-1];
            s[n-i-1] = s[i];
            s[i] = temp;
        }
    }
}
