//https://leetcode.com/problems/find-lucky-integer-in-an-array/submissions/
class Solution {
    public int findLucky(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        int ans = -1;
        
        for(int i=0; i<arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        
        for(Map.Entry<Integer, Integer> m : map.entrySet()) {
            if(m.getKey() == m.getValue()) {
                if(ans < m.getKey()) {
                    ans = m.getKey();
                }
            }
        }
        
        return ans;
    }
}
