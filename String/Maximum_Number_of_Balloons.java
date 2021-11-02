//https://leetcode.com/problems/maximum-number-of-balloons/submissions/
class Solution {
    public int maxNumberOfBalloons(String text) {
        int ans = Integer.MAX_VALUE;
        List<Character> b = Arrays.asList('b', 'a', 'l', 'o', 'n');
        Map<Character, Integer> map = new HashMap<>();
        map.put('b', 0);
        map.put('a', 0);
        map.put('l', 0);
        map.put('o', 0);
        map.put('n', 0);
        
        for(int i=0; i<text.length(); i++) {
            char ch = text.charAt(i);
            if(b.contains(ch)) {
                map.put(ch, map.getOrDefault(ch, 0)+1);
            }    
        }
        
        for(Map.Entry<Character, Integer> m: map.entrySet()) {
            int val = m.getValue();
            if(m.getKey() == 'o' || m.getKey() == 'l') {
                val = val / 2;
            }
            
            if(ans > val) {
                ans = val;
            }
            
            
        }
        return ans;
    }
}
