public class Solution {
    public int minPathSum(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int i, j;
        for(i = 0; i < row - 1; i++) grid[i + 1][0] += grid[i][0];
        for(j = 0; j < col - 1; j++) grid[0][j + 1] += grid[0][j];
        for(i = 0; i < row - 1; i++){
            for(j = 0; j < col - 1; j++){
                grid[i + 1][j + 1] += grid[i + 1][j] < grid[i][j + 1] ? grid[i + 1][j] : grid[i][j + 1];
            }
        }
        return grid[row - 1][col - 1];
    }
}