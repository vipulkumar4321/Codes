//https://leetcode.com/problems/increasing-decreasing-string/
class Solution {
    public String sortString(String s) {
        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();
        int n = s.length();
        
        for(int i=0; i<n; i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        
        while(n > 0) {
            
            for(int i=0; i<26; i++) {
                char ch = (char)(97+i);
                if(map.containsKey(ch)){
                    sb.append(ch);
                    map.put(ch, map.get(ch)-1);
                    n--;
                    if(map.get(ch) == 0) {
                        map.remove(ch);
                    }
                }
            }
            
            for(int i=25; i>=0; i--) {
                char ch = (char)(97+i);
                if(map.containsKey(ch)){
                    sb.append(ch);
                    map.put(ch, map.get(ch)-1);
                    n--;
                    if(map.get(ch) == 0) {
                        map.remove(ch);
                    }
                }
            }
        }
        
        return sb.toString();
        
    }
}
