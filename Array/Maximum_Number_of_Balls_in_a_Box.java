//https://leetcode.com/problems/maximum-number-of-balls-in-a-box/submissions/
class Solution {
    public int countBalls(int lowLimit, int highLimit) {
        int maxBall = 0;
        int n = highLimit + lowLimit - 1;
        int[] arr = new int[100];
        
        for(int i=lowLimit; i<highLimit+1; i++) {
            int temp = i;
            int box = 0;
            
            while(temp > 0) {
                box += temp%10;
                temp /= 10;
            }
            arr[box]++;
            if(arr[box] > maxBall) {
                maxBall = arr[box];
            }
        }
        
        return maxBall;
    }
}
