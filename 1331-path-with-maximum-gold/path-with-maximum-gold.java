class Solution {
    public int getMaximumGold(int[][] grid) {
        int maxGold = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                maxGold = Math.max(maxGold, getMaximumGoldBacktrack(grid, i,j, 0));
            }
        }

        return maxGold;
    }

    private int getMaximumGoldBacktrack(int[][] grid, int i, int j, int curGold) {
        if (i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == 0) {
            return curGold;
        }

        int temp = grid[i][j];
        int maxGold = curGold;
        grid[i][j] = 0;

        maxGold = Math.max(maxGold, getMaximumGoldBacktrack(grid, i + 1, j, curGold + temp));
        maxGold = Math.max(maxGold, getMaximumGoldBacktrack(grid, i, j + 1, curGold + temp));
        maxGold = Math.max(maxGold, getMaximumGoldBacktrack(grid, i - 1, j, curGold + temp)); 
        maxGold = Math.max(maxGold, getMaximumGoldBacktrack(grid, i, j - 1, curGold + temp)); 

        grid[i][j] = temp;

        return maxGold;
    }
}
