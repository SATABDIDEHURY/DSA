class Solution {

    // https://leetcode.com/problems/pascals-triangle/

    public List<List<Integer>> generate(int numRows) {
        int[][] result = new int[numRows][];

        for(int i = 0; i<numRows; i++){
            result[i] = new int[i+1];
            for(int j = 0; j<i+1; j++){
                if(j == 0 || j == i){
                    result[i][j] = 1;
                    continue;
                }
                result[i][j] = result[i-1][j-1] +result[i-1][j];
            }
        }

        return Arrays.stream(result).map(row-> Arrays.stream(row).boxed().toList()).toList();

        
    }
}