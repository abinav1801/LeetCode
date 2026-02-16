class Solution {
    public int[][] matrixReshape(int[][] matrix, int r, int c) {
        int rowSize = matrix.length;
        int colSize = matrix[0].length;

        if(rowSize * colSize != r * c){
            return matrix;  // cannot reshape
        }

        int[][] ans = new int[r][c];
        int index = 0;

        // Fill new matrix in row-traversing order
        for(int i = 0; i < rowSize; i++){
            for(int j = 0; j < colSize; j++){
                ans[index / c][index % c] = matrix[i][j];
                index++;
            }
        }

        return ans;
    }
}