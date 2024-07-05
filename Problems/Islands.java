package Problems;

public class Islands {

    public static void DFS(int[][] grid, int row, int col){


        if(grid[row][col] == 0)
            return;

        if(grid[row][col] == 2)
            return;

        grid[row][col] = 2;

        if(col + 1 < grid[0].length){
            DFS(grid,row,col+1);
        }
        if(row + 1 < grid.length){
            DFS(grid,row+1,col);
        }

        if(col - 1 != -1){
            DFS(grid,row,col-1);
        }

        if(row - 1 != -1){
            DFS(grid,row-1,col);
        }

    }

    public static void main(String[] args) {

        /* ["1","1","1","1","0"],
  ["1","1","0","1","0"],
  ["1","1","0","0","0"],
  ["0","0","0","0","0"]
        * */

        int[][] grid = new int[][] {{1,1,0,0,0},{1,1,0,0,0},{0,0,1,0,0},{0,0,0,1,1}};
        int islands  = 0;
        for (int i = 0 ; i < grid.length; i++){
            for(int j = 0 ; j < grid[i].length; j++){
                if(grid[i][j] != 0 && grid[i][j] != 2){
                    DFS(grid,i,j);
                    islands++;
                }
            }
        }
        System.out.println(islands);
    }

}
