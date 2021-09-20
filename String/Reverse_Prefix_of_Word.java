//https://leetcode.com/problems/reverse-prefix-of-word/
class Solution {
    public String reversePrefix(String word, char ch) {
        int firstIdx = -1;
        StringBuilder sb = new StringBuilder();
        
        firstIdx = word.indexOf(ch);
        
        if(firstIdx > 0) {
            sb.append(word.substring(0, firstIdx+1));
            sb.reverse();
            sb.append(word.substring(firstIdx+1, word.length()));
            return sb.toString();
        }
        
        return word;
    }
}
