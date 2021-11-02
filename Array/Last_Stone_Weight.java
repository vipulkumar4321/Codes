//https://leetcode.com/problems/last-stone-weight/submissions/
class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        int ans = 0;
        
        for(int i: stones) {
            pq.add(i);
        }
        
        while(pq.size() > 1) {
            int m1 = pq.poll();
            int m2 = pq.poll();
            
            if(m1 != m2) {
                pq.add(m1-m2);
            }
        }
        
        return pq.size()==1 ? pq.poll() : 0;
    }
}
