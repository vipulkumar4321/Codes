//https://leetcode.com/problems/build-an-array-with-stack-operations/submissions/
class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> ans = new ArrayList<>();
        
        int test = 1;
        int len = target.length;
        
        int i= 0;
        while(test != target[len-1]) {
            ans.add("Push");
            if(target[i] != test) {
                ans.add("Pop");
                i--;
            }
            test++;
            i++;
        }
        ans.add("Push");
        
        return ans;
    }
}
