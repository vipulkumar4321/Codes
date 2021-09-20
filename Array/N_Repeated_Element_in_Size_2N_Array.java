//https://leetcode.com/problems/n-repeated-element-in-size-2n-array/
class Solution {
    public int repeatedNTimes(int[] nums) {
        int size = nums.length;
        int n = size/2;
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i: nums) {
            if(map.containsKey(i)) {
                map.put(i, map.get(i)+1);
            } else {
                map.put(i, 1);
            }
        }
        
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(entry.getValue() == n) {
                return entry.getKey();
            }
        }
        
        return -1;
    }
}
