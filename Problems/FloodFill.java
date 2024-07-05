package Problems;

import java.util.ArrayList;
import java.util.Arrays;

public class FloodFill {

    public static void fillColor(int[][] image,int row,int col,int color,int source){

        //base case
        if(image[row][col] == color)
            return;

        if(image[row][col] == source)
            image[row][col] = color;
        else
            return;

        if(col + 1 < image[0].length){
            fillColor(image,row,col+1,color,source);
        }
        if(row + 1 < image.length){
            fillColor(image,row+1,col,color,source);
        }

        if(col - 1 != -1){
            fillColor(image,row,col-1,color,source);
        }

        if(row - 1 != -1){
            fillColor(image,row-1,col,color,source);
        }

    }

    public static void main(String[] args) {
        int[][] image = new int[][] {{1,1,0},{0,0,0}};
        int source = 1;
        fillColor(image,0,0,0,source);
        for(int[] row : image)
            System.out.println(Arrays.toString(row));
    }

}
