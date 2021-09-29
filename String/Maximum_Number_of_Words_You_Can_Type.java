//https://leetcode.com/problems/maximum-number-of-words-you-can-type/
class Solution {
    public int canBeTypedWords(String text, String brokenLetters) {
        String[] textArr = text.split(" ");
        int ans = textArr.length;
        
        for(int j=0; j<textArr.length; j++){
            for(int i=0; i<brokenLetters.length(); i++) {
                if(textArr[j].contains(""+brokenLetters.charAt(i))) {
                    ans--;
                    break;
                }
            }
        }
        
        return ans;
    }
}
