class Solution {
    public void setZeroes(int[][] matrix) {
        int rowSize = matrix.length;
        int colSize = matrix[0].length;
        int col0 = 1;
        int row , col;
        
        for(row = 0 ; row < rowSize ; row++)
        {
            for(col = 0 ; col < colSize ; col++)
            {
                if(matrix[row][col] == 0)
                {
                    matrix[row][0] = 0;
                    
                    if(col != 0) //if 0 column is not zero then set zero to the matrix[0][col] = 0
                    {
                        matrix[0][col] = 0;
                    }
                    else
                    {
                        col0 = 0;
                    }
                }
            }
        }

        for(row = 1 ; row < rowSize ; row++)
        {
            for(col = 1 ; col < colSize ; col++)
            {
                if(matrix[0][col] == 0 || matrix[row][0] == 0)
                {
                    matrix[row][col] = 0;
                }
            }
        }

        if(matrix[0][0] == 0)
        {
            for(col = 0 ; col < colSize ; col++)
            {
                matrix[0][col] = 0;
            }
        }

        if(col0 == 0)
        {
            for(row = 0 ; row < rowSize ; row++)
            {
                matrix[row][0] = 0;
            }
        }

        return;

    }
}