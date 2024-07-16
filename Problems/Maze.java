package Problems;

import javax.xml.transform.Source;
import java.util.*;

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

    //Check all four directions and return the path to reach the give destination
    static boolean isPathFound = false;
    public static void findPath(String[][] maze,int row,int col,int endRow,int endCol,ArrayList<int[]> paths){

        //Positive base case
        if(row == endRow && col == endCol) {
            paths.add(new int[] {row,col});
            isPathFound = true;
            return;
        }

        //Negative base cases...
        if(row == -1 || col == -1)
            return;

        if(row == maze.length || col == maze[0].length)
            return;

        if(maze[row][col].equals("1"))
            return;

        //Changing the current position as visited
        maze[row][col] = "1";
        if(!isPathFound)
            paths.add(new int [] {row,col});

        findPath(maze,row+1,col,endRow,endCol,paths); //Checking in the down-word direction
        findPath(maze,row,col+1,endRow,endCol,paths); //Checking in the right direction
        findPath(maze,row-1,col,endRow,endCol,paths); //Check in the up-word direction
        findPath(maze,row,col-1,endRow,endCol,paths); //Check in the left direction
    }

    public static void findPathsToReachDestination(){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the start position x1 : ");
        int x1 = input.nextInt();
        System.out.print("Enter the start position y1 : ");
        int y1 = input.nextInt();
        String[][] maze = new String[][] {{"0","0","1","0","0"},{"0","0","0","0","0"},{"0","0","0","1","0"},{"1","1","0","1","1"},{"0","0","0","0","0"}};
        System.out.print("Enter the Destination x2 : ");
        int x2 = input.nextInt();
        System.out.print("Enter the Destination y2 : ");
        int y2 = input.nextInt();

        ArrayList<int[]> paths = new ArrayList<>();
        findPath(maze,x1,y1,x2,y2,paths);
        System.out.print("Paths : ");
        for(int[] p : paths)
            System.out.print(Arrays.toString(p) + " ");
    }

    public static void main(String[] args) {


        // //Maze problem which moves only in two directions either Horizontal or vertical
//        maze = new int[3][3];
//        System.out.println(get_possible_ways(0,0,2,2));
//        for(int[] row : maze)
//            System.out.println(Arrays.toString(row));
//        System.out.println(bottom_up(2,2));

        // //Maze problem to reach the given destination by travelling in all four directions from give position
        findPathsToReachDestination();

    }

}
