https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/submissions/
class Solution {
    public String freqAlphabets(String s) {
        StringBuilder ans = new StringBuilder();
        
        int n = s.length();
        for(int i=0; i<n; i++) {
            
            if(i+2 < n && s.charAt(i+2) == '#') {
                //Since num > 10 is string so adding 96 directly(i.e. ascii of a)
                ans.append((char)(Integer.valueOf(s.substring(i, i+2)) + 96));
                i += 2;
            } else {
                 //Adding 48 because ascii value of 1 is 49 and 97-49=48.
                 ans.append((char)(Integer.valueOf(s.charAt(i)) + 48));
            }
        }
                            
        return ans.toString();
    }
}
