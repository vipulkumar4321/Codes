//https://leetcode.com/problems/maximum-number-of-balloons/submissions/
class Solution {
    public int maxNumberOfBalloons(String text) {
        int ans = Integer.MAX_VALUE;
        String b = "balon";
        int[] chAr = new int[26];
        
        for(char ch : text.toCharArray()) {
            chAr[ch - 'a']++;
        }

        
        for(char ch : b.toCharArray()) {
            int val = chAr[ch - 'a'];
            
            if(ch == 'o' || ch == 'l') {
                val = val / 2;
            }
            
            if(ans > val) {
                ans = val;
            }
        }
        return ans;
    }
}
