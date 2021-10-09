//https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
class Solution {
    public double average(int[] salary) {
        double ans=0, sum=0;
        int max=Integer.MIN_VALUE, min=Integer.MAX_VALUE, n=salary.length;
        
        for(int i=0; i<n; i++) {
            sum += salary[i];
            if(max < salary[i]) {
                sum -= salary[i];
                sum += max;
                max = salary[i];
            }
            
            if(min > salary[i]) {
                sum -= salary[i];
                sum += min;
                min = salary[i];
                //For first time min = Integer.MIN_VALUE which is -1 more than MAX_VALUE
                if(i == 0)
                    sum +=1;
            }            
        }
        
        ans = sum/(n-2);
        return ans;
    }
}
