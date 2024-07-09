package Problems;

import java.util.*;

public class MATRIX_01 {

    public static int DFS(int[][] mat, int row, int col,int step){

        if(row == mat.length || row == -1)
            return 0;
        if(col == mat[0].length || col == -1)
            return 0;

        if(mat[row][col] == 0)
            return step;

        if(mat[row][col] == -1)
            return 0;

        if(mat[row][col] > 1)
            return mat[row][col]+1;

        mat[row][col] = -1;

        ArrayList<Integer> directions = new ArrayList<>();
        int right = DFS(mat,row,col+1,step+1);
        if(right != 0)
            directions.add(right);
        int left = DFS(mat,row,col-1,step+1);
        if(left != 0)
            directions.add(left);
        int up = 0;
        if(row-1 != -1){
            if(mat[row-1][col] == 0)
                up = step+1;
            else if(mat[row-1][col] != -1)
                up = mat[row-1][col] + step + 1;
        }
        if(up != 0)
            directions.add(up);
        int down = DFS(mat,row+1,col,step+1);
        if(down != 0)
            directions.add(down);

        mat[row][col] = 1;

        return Collections.min(directions);
    }

    public static void main(String[] args) {
        //int[][] mat = new int[][] {{0,0,0},{0,1,0},{1,1,1}};
        int[][] mat = new int[][] {{0,1,0,1,1}
                                  ,{1,1,0,0,1},
                                   {0,0,0,1,0},
                                   {1,0,1,1,1},
                                   {1,0,0,1,1}};
        Queue<int[]> q = new LinkedList<>();
//        int[][] mat = new int[][] {{0,0,1,0,1,1,1,0,1,1},
//                                   {1,1,1,1,0,1,1,1,1,1},
//                                   {1,1,1,1,1,0,0,0,1,1},
//                                   {1,0,1,0,1,1,1,0,1,1},
//                                   {0,0,1,1,1,0,1,1,1,1},
//                                   {1,0,1,1,1,1,1,1,1,1},
//                                   {1,1,1,1,0,1,0,1,0,1},
//                                   {0,1,0,0,0,1,0,0,1,1},
//                                   {1,1,1,0,1,1,0,1,0,1},
//                                   {1,0,1,1,1,0,1,1,1,0}};
//        int[][] mat = new int[][] {{1,0,1,1,0,0,1,0,0,1},
//                                   {0,1,1,0,1,0,1,0,1,1},
//                                   {0,0,1,0,1,0,0,1,0,0},
//                                   {1,0,1,0,1,1,1,1,1,1},
//                                   {0,1,0,1,1,0,0,0,0,1},
//                                   {0,0,1,0,1,1,1,0,1,0},
//                                   {0,1,0,1,0,1,0,0,1,1},
//                                   {1,0,0,0,1,1,1,1,0,1},
//                                   {1,1,1,1,1,1,1,0,1,0},
//                                   {1,1,1,1,0,1,0,0,1,1}};
//        int[][] mat = new int[][] {{1,0,1,0,0,0,1,1,1,1},
//                                   {1,1,1,0,1,1,1,1,0,1},
//                                   {1,0,1,1,1,1,0,1,0,0},
//                                   {1,0,1,1,1,0,1,1,1,1},
//                                   {1,1,0,1,1,1,1,0,0,0},
//                                   {1,1,0,0,1,0,1,1,0,1},
//                                   {1,1,1,1,1,1,1,1,1,1},
//                                   {1,1,0,0,0,1,1,1,0,0},
//                                   {0,1,1,1,0,0,1,0,1,1},
//                                   {1,1,0,0,0,1,0,1,1,0}};
        for(int i = 0 ; i < mat.length; i++){
            for(int j = 0 ; j < mat[i].length; j++){
                if(mat[i][j] == 1){
                    int steps = DFS(mat,i,j,0);
                    mat[i][j] = steps;
                }
            }
        }
        for(int[] row : mat)
            System.out.println(Arrays.toString(row));
    }

}
