//https://leetcode.com/problems/sum-of-unique-elements/
class Solution {
    public int sumOfUnique(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        
        int n = nums.length;
        
        for(int i=0; i<n; i++) {
            if(map.containsKey(nums[i]))
                map.put(nums[i], map.get(nums[i]) + 1);
            else 
                map.put(nums[i], 1);
        }
        
        int sum = 0;
        for(Map.Entry<Integer, Integer> entry: map.entrySet()) {
            if(entry.getValue() > 1) {
                continue;
            }
            sum += entry.getKey();
        }
        
        return sum;
    }
}
