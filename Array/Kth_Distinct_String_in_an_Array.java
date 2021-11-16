//https://leetcode.com/problems/kth-distinct-string-in-an-array/submissions/
class Solution {
    public String kthDistinct(String[] arr, int k) {
        Map<String, Integer> map = new HashMap<>();
        int counter = 0;
        
        for(int i=0; i<arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }
        
        for(String s: arr) {
            if(map.get(s) == 1) {
                counter++;
                if(counter == k) {
                    return s;
                }
            }
        }
        
        return "";
    }
}
