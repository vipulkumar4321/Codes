//https://leetcode.com/problems/determine-color-of-a-chessboard-square/
class Solution {
    public boolean squareIsWhite(String coordinates) {
        boolean ans1 = true;
        boolean ans2 = true;
        
        char ch1 = coordinates.charAt(0);
        char ch2 = coordinates.charAt(1);
        
        if((int)ch2 % 2 != 0)
            ans2 = false;
        
        if((int)ch1 % 2 != 0)
            ans1 = false;
        
        if((ans1 == true && ans2 == true) || (ans1==false && ans2 == false))
            return false;
        else 
            return true;
    }
}
