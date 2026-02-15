class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int row_size = matrix.length;
        int col_size = matrix[0].length;

        int[] rowMin = new int[row_size];
        int[] colMin = new int[col_size];

        for(int row = 0; row < row_size; row++){
            int minValue = matrix[row][0];
            for(int col = 0; col < col_size; col++){
                if(matrix[row][col] < minValue){
                    minValue = matrix[row][col];
                }
            }
            rowMin[row] = minValue;
        }

        for(int col = 0; col < col_size; col++){
            int maxValue = matrix[0][col];
            for(int row = 0; row < row_size; row++){
                if(matrix[row][col] > maxValue){
                    maxValue = matrix[row][col];
                }
            }
            colMin[col] = maxValue;
        }

        for(int row = 0; row < row_size; row++){
            for(int col = 0; col < col_size; col++){
                if(matrix[row][col] == rowMin[row] && matrix[row][col] == colMin[col]){
                    result.add(matrix[row][col]);
                }
            }
        }
        return result;
    }
    
}