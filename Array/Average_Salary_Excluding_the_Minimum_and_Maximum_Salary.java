//https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/
class Solution {
    public double average(int[] salary) {
        double ans=0, sum=0;
        int max=Integer.MIN_VALUE, min=Integer.MAX_VALUE, n=salary.length;
    
        for(int i=0; i<n; i++) {
            if(max < salary[i])
                max = salary[i];
            if(min > salary[i]) 
                min = salary[i];
        }
        
        for(int i=0; i<n; i++) {
            if(salary[i] != max && salary[i] != min) {
                sum += salary[i];
            }
        }
        
        ans = sum/(n-2);
        return ans;
    }
}
