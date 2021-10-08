//https://leetcode.com/problems/lucky-numbers-in-a-matrix/
class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        
        int m = matrix.length;
        int n = matrix[0].length;
        
        int[] rowMin = new int[m];
        int[] colMax = new int[n];
        int p = 0;
        int q = 0;
        
        for(int i=0; i<m; i++) {
            int min = Integer.MAX_VALUE; 
            for(int j=0; j<n; j++) {
                if(matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
            rowMin[p++] = min;
        }
        
        for(int i=0; i<n; i++) {
            int max = Integer.MIN_VALUE;
            for(int j=0; j<m; j++) {
                if(matrix[j][i] > max) {
                    max = matrix[j][i];
                }
            }
            colMax[q++] = max;
        }
        
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(matrix[i][j] == rowMin[i] && matrix[i][j] == colMax[j]) {
                    list.add(matrix[i][j]);
                }
            }
        }
        
        return list;
    }
}
