//https://leetcode.com/problems/robot-return-to-origin/submissions/
class Solution {
    public boolean judgeCircle(String moves) {
        int lr=0, ud=0;
        
        for(char ch : moves.toCharArray()) {
            if(ch == 'R')
                lr += 1;
            else if(ch == 'L')
                lr -= 1;
            else if(ch == 'U')
                ud += 1;
            else if(ch == 'D')
                ud -= 1;        
        }
        
        if(lr == 0 && ud ==0)
            return true;
        return false;
    }
}
