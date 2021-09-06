//https://www.interviewbit.com/problems/max-non-negative-subarray
public class Solution {
    public ArrayList<Integer> maxset(ArrayList<Integer> A) {
        List<Integer> ans = new ArrayList<Integer>();
        List<Integer> tempList = new ArrayList<Integer>();
        long maxSum=0, temp=0;

        for(int i: A) {
            if(i >= 0){
                temp += i;
                tempList.add(i);
            } else {
                temp = 0;
                tempList.clear();
            }

            if(temp > maxSum || (temp == maxSum && tempList.size() > ans.size())) {
                maxSum = temp;
                ans.clear();
                ans.addAll(tempList);
            }
        }    
        return new ArrayList<>(ans);    
    }
}
