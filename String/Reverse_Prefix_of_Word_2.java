//https://leetcode.com/problems/reverse-prefix-of-word/
class Solution {
    public String reversePrefix(String word, char ch) {
        int firstIdx = -1;
        StringBuilder sb = new StringBuilder();
        int n = word.length();
        
        for(int i=0; i<n; i++) {
            if(word.charAt(i) == ch) {
                firstIdx = i;
                break;
            }
        }
        
        if(firstIdx > 0) {
            for(int i=firstIdx; i>=0; i--) {
                sb.append(word.charAt(i));
            }
            for(int i=firstIdx+1; i<n; i++) {
                sb.append(word.charAt(i));
            }
            return sb.toString();
        }
        
        return word;
    }
}
