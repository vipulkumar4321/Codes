//https://www.interviewbit.com/problems/pick-from-both-sides/
public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        int n = A.size();
        int sum = 0, maxSum=0;

        for(int i=0; i<B; i++) {
            sum += A.get(i);
        }
        maxSum = sum;

        int front=B-1, rear=n-1;
        while(front >= 0 && rear >= 0) {
            sum += A.get(rear--);
            sum -= A.get(front--);
            maxSum = sum > maxSum ? sum : maxSum;
        }

        return maxSum;
    }
}
