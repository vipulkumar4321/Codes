//https://leetcode.com/problems/determine-if-string-halves-are-alike/
class Solution {
    public boolean halvesAreAlike(String s) {
        int n = s.length();
        
        ArrayList<Character> vowels = new ArrayList<>(List.of('a', 'e', 'i', 'o', 'u'));
        
        int c1=0, c2=0;
        for(int i=0; i<n/2; i++) {
            if(vowels.contains(Character.toLowerCase(s.charAt(i)))) {
                c1++;   
            }
        }
        
        for(int i=n/2; i<n; i++) {
            if(vowels.contains(Character.toLowerCase(s.charAt(i)))) {
                c2++;   
            }
        }
        
        if(c1 == c2) {
            return true;
        }
        
        return false;
    }
}
