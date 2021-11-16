//https://leetcode.com/problems/two-out-of-three/submissions/
class Solution {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        Set<Integer> ansSet = new HashSet<>();
        
        for(int i=0; i<nums1.length; i++) {
            for(int j=0; j<nums2.length; j++) {
                if(nums1[i] == nums2[j]) {
                    ansSet.add(nums1[i]);
                    break;
                }
            }
            
            for(int j=0; j<nums3.length; j++) {
                if(nums1[i] == nums3[j]) {
                    ansSet.add(nums1[i]);
                    break;
                }
            }
        }
        
        for(int i=0; i<nums2.length; i++) {
            for(int j=0; j<nums1.length; j++) {
                if(nums2[i] == nums1[j]) {
                    ansSet.add(nums2[i]);
                    break;
                }
            }
            
            for(int j=0; j<nums3.length; j++) {
                if(nums2[i] == nums3[j]) {
                    ansSet.add(nums2[i]);
                    break;
                }
            }
        }
        
        List<Integer> list = new ArrayList<>(ansSet);
        // list.addAll(ansSet);
        return list;
    }
}
