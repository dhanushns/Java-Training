package Problems;

import java.util.Arrays;

public class MATRIX_01 {

    public static int BFS(int[][] mat,int row,int col){

        if(col + 1 < mat[0].length)
            if(mat[row][col+1] == 0)
                return 0;
        if(row + 1 < mat.length)
            if(mat[row+1][col] == 0)
                return 0;
        if(col - 1 != -1)
            if(mat[row][col-1] == 0)
                return 0;
        if(row - 1 != -1)
            if(mat[row-1][col] == 0)
                return 0;

        if(row - 1 != -1)
            return mat[row-1][col];
        if(col - 1 != -1)
            return mat[row][col-1];
        if(col + 1 < mat[0].length)
            return mat[row][col+1];
        if(row + 1 < mat.length)
            return mat[row+1][col];
        return 0;
    }

    public static void main(String[] args) {
        int[][] mat = new int[][] {{0,1,0,1,1},{1,1,0,0,1},{0,0,0,1,0},{1,0,1,1,1},{1,0,0,0,1}};
        //int[][] mat = new int[][] {{0,0,0},{0,1,1},{1,1,1}};
        for(int i = 0 ; i < mat.length; i++){
            for(int j = 0 ; j < mat[i].length; j++){
                if(mat[i][j] == 1){
                    int steps = BFS(mat,i,j);
                    mat[i][j] += steps;
                }
            }
        }
        for(int[] row : mat)
            System.out.println(Arrays.toString(row));
    }

}
