class Solution {

    public int min(int a , int b)
    {
        return (a<b)?a:b;
    }

    public int minPathSum(int[][] grid) {
        
        if(grid == null || grid.length == 0 || grid[0].length == 0)
        {
            return 0;
        }

        int rowSize = grid.length;
        int colSize = grid[0].length;
        int[][] dup = new int[rowSize][colSize];
        int row , col;

        for(row = 0 ; row < rowSize ; row++)
        {
            for(col = 0 ; col < colSize ; col++)
            {
                dup[row][col] = 0;
            }
        }

        for(row = 0 ; row < rowSize ; row++)
        {
            for(col = 0 ; col < colSize ; col++)
            {
                if(row == 0 && col == 0)
                {
                    dup[row][col] = grid[row][col];
                }
                else if(row == 0)
                {
                    dup[row][col] = grid[row][col] + dup[row][col-1];
                }
                else if(col == 0)
                {
                    dup[row][col] = grid[row][col] + dup[row-1][col];
                }
                else
                {
                    dup[row][col] = grid[row][col] + min(dup[row-1][col] , dup[row][col-1]);
                }
            }
        }
        return dup[rowSize - 1][colSize -1];           
    }
}