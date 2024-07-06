package Problems;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class MATRIX_01 {

    public static int DFS(int[][] mat, int row, int col){

        if(mat[row][col] == 0)
            return 1;
        return 0;
    }

    public static void main(String[] args) {
        //int[][] mat = new int[][] {{0,1,0,1,1},{1,1,0,0,1},{0,0,0,1,0},{1,0,1,1,1},{1,0,0,0,1}};
        Queue<int[]> q = new LinkedList<>();
        int[][] mat = new int[][] {{0,0,0},{0,1,0},{1,1,1}};
        for(int i = 0 ; i < mat.length; i++){
            for(int j = 0 ; j < mat[i].length; j++){
                if(mat[i][j] == 1 || mat[i][j] == 2){
                    int steps = DFS(mat,i,j);
                    mat[i][j] = steps;
                }
            }
        }
        for(int[] row : mat)
            System.out.println(Arrays.toString(row));
    }

}
