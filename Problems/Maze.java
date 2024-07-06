package Problems;

import java.util.Arrays;

public class Maze {

    static int[][] maze;

    public static int count_possible_ways(int row, int col, int endRow, int endCol){

        //Positive Base case
        if(row == endRow && col == endCol) {
            return 1;
        }

        //Negative Base case
        if(col > endCol || row > endRow)
            return 0;

        int horizontal_ways = count_possible_ways(row,col+1,endRow,endCol);
        int vertical_ways = count_possible_ways(row+1,col,endRow,endCol);
        return horizontal_ways + vertical_ways;
    }

    //Memorization Approach
    public static int get_possible_ways(int row, int col, int endRow, int endCol){

        //Positive Base case
        if(row == endRow && col == endCol) {
            return 1;
        }

        //Negative Base case
        if(col > endCol || row > endRow)
            return 0;

        //Base case to avoid recursion
        if(maze[row][col] != 0)
            return maze[row][col];

        int horizontal_ways = get_possible_ways(row,col+1,endRow,endCol);
        int vertical_ways = get_possible_ways(row+1,col,endRow,endCol);
        maze[row][col] = horizontal_ways + vertical_ways;
        return maze[row][col];
    }

    public static int bottom_up(int endRow,int endCol){
        int[][] maze = new int[endRow+2][endCol+2];
        for(int row = endRow ; row >= 0 ; row--){
            for(int col = endCol ; col >= 0; col--){
                if(row == endRow && col == endCol)
                    maze[row][col] = 1;
                else
                    maze[row][col] = maze[row][col+1] + maze[row+1][col];
            }
        }
        for(int[] row : maze)
            System.out.println(Arrays.toString(row));
        return maze[0][0];
    }

    public static void main(String[] args) {
        maze = new int[3][3];
        System.out.println(get_possible_ways(0,0,2,2));
        for(int[] row : maze)
            System.out.println(Arrays.toString(row));
        System.out.println(bottom_up(2,2));
    }

}
