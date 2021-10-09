//https://leetcode.com/problems/find-words-that-can-be-formed-by-characters/
class Solution {
    public int countCharacters(String[] words, String chars) {
        int count=0;
        
        Map<Character, Integer> map = new HashMap<>();
        for(char c : chars.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        
        for(String str : words) {
            Map<Character, Integer> wordsMap = new HashMap<>();
            for(char c : str.toCharArray()) {
                wordsMap.put(c, wordsMap.getOrDefault(c, 0)+1);
            }
            
            boolean flag = true;
            for(char ch: wordsMap.keySet()) {
                if(!map.containsKey(ch)) {
                    flag = false;
                    break;
                }
                if(map.get(ch) < wordsMap.get(ch)) {
                    flag = false;
                    break;
                }
            }
            
            if(flag == true) {
                count += str.length();
            }
        }
        
        return count;
        
    }
}
