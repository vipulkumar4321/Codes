//https://leetcode.com/problems/shortest-distance-to-a-character/
class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] arr = new int[n];
        List<Integer> list = new ArrayList<>();
        
        for(int i=0; i<n; i++) {
            arr[i] = i;
            if(s.charAt(i) == c)
                list.add(i);
        }
        
        for(int i=0; i<n; i++) {
            int min = Integer.MAX_VALUE;
            for(int x : list) {
                int temp = Math.abs(arr[i]-x);
                if(min > temp) {
                    min = temp;
                }
            }
            arr[i] = min;
        }
        
        return arr;
    }
}
