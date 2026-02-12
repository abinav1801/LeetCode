class Solution {
    public int[][] transpose(int[][] arr) {
        int row_size = arr.length;
        int col_size = arr[0].length;
        int[][] transpose = new int[col_size][row_size];
        for(int row = 0; row < row_size; row++){
            for(int col = 0; col < col_size ; col++){
                transpose[col][row] = arr[row][col];
            }
        }
        return transpose;
    }
}