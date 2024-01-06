package com.harmless.intrusion;

//200. Number of Islands
//
//Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.
//
//An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.
//
//Example 1:
//Input: grid = [
//        ["1","1","1","1","0"],
//        ["1","1","0","1","0"],
//        ["1","1","0","0","0"],
//        ["0","0","0","0","0"]
//        ]
//Output: 1
//
//Example 2:
//Input: grid = [
//        ["1","1","0","0","0"],
//        ["1","1","0","0","0"],
//        ["0","0","1","0","0"],
//        ["0","0","0","1","1"]
//        ]
//Output: 3
//
//Constraints:
//m == grid.length
//n == grid[i].length
//    1 <= m, n <= 300
//grid[i][j] is '0' or '1'.

public class NumberOfIslands {

    public int numIslands(char[][] grid) {
        int count = 0;
        for (int x = 0; x < grid.length; x++) {
            for (int y = 0; y < grid[x].length; y++) {
                if (grid[x][y] == '1') {
                    bfs(x, y, grid);
                    count++;
                }
            }
        }
        return count;
    }

    public void bfs(int xpos, int ypos, char[][] grid) {
        if (xpos >= grid.length || xpos < 0 || ypos >= grid[xpos].length || ypos < 0 || grid[xpos][ypos] != '1') {
            return;
        } else {
            grid[xpos][ypos] = '0';
            bfs(xpos + 1, ypos, grid);
            bfs(xpos, ypos + 1, grid);
            bfs(xpos - 1, ypos, grid);
            bfs(xpos, ypos - 1, grid);
        }
    }
}
