//https://leetcode.com/problems/destination-city/
class Solution {
    public String destCity(List<List<String>> paths) {
        Map<String, String> cityList = new HashMap<>();
        
        for(List<String> list: paths) {
            cityList.put(list.get(0), list.get(1));
        }
        
        String finalDest = paths.get(0).get(0);
        
        while(cityList.containsKey(finalDest)) {
            finalDest = cityList.get(finalDest);
        }
        
        return finalDest;
    }
}
