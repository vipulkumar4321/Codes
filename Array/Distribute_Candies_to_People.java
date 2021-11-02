//https://leetcode.com/problems/distribute-candies-to-people/submissions/
class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int[] ans = new int[num_people];
        int count = 1;
        int i=0;
        
        while(true) {
            if(candies >= count) {
                ans[i%num_people] += count;
                candies -= count;  
                count++;
                i++;
            } else {
                ans[i%num_people] += (candies);
                break;
            }
        }
        
        return ans;
    }
}
