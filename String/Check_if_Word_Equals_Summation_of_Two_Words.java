//https://leetcode.com/problems/check-if-word-equals-summation-of-two-words/
class Solution {
    public boolean isSumEqual(String firstWord, String secondWord, String targetWord) {        
        return (stringVal(targetWord) == (stringVal(firstWord) + stringVal(secondWord))) ;
    }
    
    public static int stringVal(String str) {
        String strVal = "";
        for(int i=0; i<str.length(); i++) {
            strVal += (int)str.charAt(i) - 97;
        }
        
        return Integer.parseInt(strVal);
    }
}
