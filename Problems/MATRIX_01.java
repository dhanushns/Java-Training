package Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class MATRIX_01 {

    public static int DFS(int[][] mat, int row, int col,int step){

        if(row == mat.length || row == -1)
            return 0;
        if(col == mat[0].length || col == -1)
            return 0;

        if(mat[row][col] == 0)
            return step;

        if(mat[row][col] == -1)
            return 0 ;

        if(mat[row][col] > 1)
            return mat[row][col]+1;

        mat[row][col] = -1;

        int right = DFS(mat,row,col+1,step+1);
        int left = DFS(mat,row,col-1,step+1);
        int up = 0;
        if(row-1 != -1){
            if(mat[row-1][col] != 0)
                up = mat[row-1][col] + 1;
        }
        int down = DFS(mat,row+1,col,step+1);

        return findMininumStep(new int[] {right,left,up,down});
    }

    public static int findMininumStep(int[] distances){

        int min = 0;
        for(int i = 0 ; i < distances.length; i++)
            if(distances[i] != 0)
                min = distances[i];

        for(int i = 0 ; i < distances.length; i++)
            if(distances[i] < min && distances[i] != 0)
                min = distances[i];

        return min;
    }

    public static void refreshMatrix(int[][] mat){
        for(int i = 0; i < mat.length; i++){
            for(int j = 0 ; j < mat[i].length; j++){
                if(mat[i][j] == -1)
                    mat[i][j] = 1;
            }
        }
    }

    public static void main(String[] args) {
        //int[][] mat = new int[][] {{0,1,0,1,1},{1,1,0,0,1},{0,0,0,1,0},{1,0,1,1,1},{1,0,0,0,1}};
        Queue<int[]> q = new LinkedList<>();
        int[][] mat = new int[][] {{0,0,0},{1,1,1},{1,1,1}};
        for(int i = 0 ; i < mat.length; i++){
            for(int j = 0 ; j < mat[i].length; j++){
                if(mat[i][j] == 1){
                    int steps = DFS(mat,i,j,0);
                    mat[i][j] = steps;
                    refreshMatrix(mat);
                }
            }
        }
        for(int[] row : mat)
            System.out.println(Arrays.toString(row));
    }

}
