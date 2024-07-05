package Problems;

import java.util.ArrayList;
import java.util.Arrays;

public class NoOfEnclaves {

    public static void findEnclaves(int[][] grid,int row,int col) {
        if (grid[row][col] == 0)
            return;

        if (grid[row][col] == 2)
            return;

        grid[row][col] = 2;

        if (col + 1 < grid[0].length) {
            findEnclaves(grid, row, col + 1);
        }
        if (row + 1 < grid.length) {
            findEnclaves(grid, row + 1, col);
        }

        if (col - 1 != -1) {
            findEnclaves(grid, row, col - 1);
        }

        if (row - 1 != -1) {
            findEnclaves(grid, row - 1, col);
        }
    }

    public static void main(String[] args) {

        /*  0 0 0 0
            1 0 1 0
            0 1 1 0
            0 0 0 0
        * */

        //int[][] grid = new int[][] {{0,1,1,0},{0,0,1,0},{0,0,1,0},{0,0,0,0}};
        //int[][] grid = new int[][] {{0,0,0,0},{1,0,1,0},{0,1,1,0},{0,0,0,0}};
        int[][] grid = new int[][] {{0,0,0,1,1,1,0,1,0,0},{1,1,0,0,0,1,0,1,1,1},{0,0,0,1,1,1,0,1,0,0},{0,1,1,0,0,0,1,0,1,0},{0,1,1,1,1,1,0,0,1,0},{0,0,1,0,1,1,1,1,0,1},{0,1,1,0,0,0,1,1,1,1},{0,0,1,0,0,1,0,1,0,1},{1,0,1,0,1,1,0,0,0,0},{0,0,0,0,1,1,0,0,0,1}};
        int enclosedLands = 0;
        for(int i = 0 ; i < grid[0].length; i++) {
            if (grid[0][i] == 1)
                findEnclaves(grid,0,i);
        }
        for(int i = 1 ; i < grid.length; i++) {
            if (grid[i][0] == 1)
                findEnclaves(grid,i,0);
        }
        for(int i = 1 ; i < grid[0].length; i++) {
            if (grid[grid.length-1][i] == 1)
                findEnclaves(grid,grid.length-1,i);
        }
        for(int i = 1 ; i < grid.length; i++) {
            if (grid[i][grid[0].length-1] == 1)
                findEnclaves(grid,i,grid[0].length-1);
        }

        for(int[] row : grid){
            for(int land : row)
                if(land == 1)
                    enclosedLands++;
        }
        System.out.println(enclosedLands);
    }

}
