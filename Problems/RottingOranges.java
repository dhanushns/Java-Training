package Problems;

import java.util.*;

public class RottingOranges {

    /*  2 1 1
        1 1 0
        0 1 1
    * */

    public static int calculateTime(int[][] grid){

        Queue<int[]> q = new LinkedList<>();
        ArrayList<Integer> RottenTime = new ArrayList<>();
        boolean conatinsFreshOrange = false;
        for(int i = 0 ; i < grid.length; i++){
            for(int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 2) {
                    q.add(new int[]{i,j,0});
                }
                if(grid[i][j] == 1)
                    conatinsFreshOrange = true;
            }
        }

        if(!conatinsFreshOrange)
            return 0;

        while(!q.isEmpty()){
            int size = q.size();
            for(int i = 0 ; i < size; i++){
                int[] pareClass = q.peek();
                int row = pareClass[0];
                int col = pareClass[1];
                int time = pareClass[2];

                if(col + 1 < grid[row].length && grid[row][col+1] != 0 && grid[row][col+1] != 2) {
                    grid[row][col+1] = 2;
                    q.add(new int[] {row,col+1,time+1});
                    RottenTime.add(time+1);
                }

                if(col - 1 != -1 && grid[row][col-1] != 0 && grid[row][col-1] != 2) {
                    grid[row][col-1] = 2;
                    q.add(new int[] {row,col-1,time+1});
                    RottenTime.add(time+1);
                }

                if(row + 1 < grid.length && grid[row+1][col] != 0 && grid[row+1][col] != 2) {
                    q.add(new int[] {row+1,col,time+1});
                    grid[row+1][col] = 2;
                    RottenTime.add(time+1);
                }

                if(row - 1 != -1 && grid[row-1][col] != 0 && grid[row-1][col] != 2) {
                    q.add(new int[] {row-1,col,time+1});
                    grid[row-1][col] = 2;
                    RottenTime.add(time+1);
                }

                q.poll();
            }
        }


        for (int[] row : grid) {
            for (int data : row) {
                if (data == 1)
                    return -1;
            }
        }

        return RottenTime.getLast();
    }

    public static void main(String[] args) {

        int[][] grid = new int[][] {{1,2}};
        System.out.println(calculateTime(grid));

    }
}
