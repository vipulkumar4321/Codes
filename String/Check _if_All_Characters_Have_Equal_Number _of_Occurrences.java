//https://leetcode.com/problems/check-if-all-characters-have-equal-number-of-occurrences/
class Solution {
    public boolean areOccurrencesEqual(String s) {
        Map<Character, Integer> map = new HashMap<>();
        
        int n = s.length();
        for(int i=0; i<n; i++) {
            char ch = s.charAt(i);
            if(map.containsKey(ch)) 
                map.put(ch, map.get(ch) + 1);
            else
                map.put(ch, 1);
        }
        
        int temp = -1;
        int flag = -1;
        for(Map.Entry<Character, Integer> en: map.entrySet()) {
            if(temp == -1) {
                temp = en.getValue();
                continue;
            } 
            
            if(temp != en.getValue()) {
                return false;
            }
            temp = en.getValue();
        }
        
        return true;
    }
}
