class Solution {
    public boolean findRotation(int[][] arr, int[][] target) {
        for(int i = 0; i < 4; i++){
            if(Arrays.deepEquals(arr,target)){
                return true;
            }
            arr = rotate(arr);
        }
        return false;
    }

    public int[][] rotate(int[][] arr){
        int row_size = arr.length;
        int col_size = arr[0].length;

        int[][] transpose = new int[col_size][row_size];
        for(int row = 0; row < row_size; row++){
            for(int col = 0; col < col_size ; col++){
                transpose[col][row] = arr[row][col];
            }
        }

        for(int row = 0; row < row_size; row++){
            for(int col = 0; col < col_size / 2 ; col++){
                int temp = transpose[row][col];
                transpose[row][col] = transpose[row][row_size - 1 - col];
                transpose[row][row_size - 1 - col] = temp;
            }
        }
        return transpose;
    }

}