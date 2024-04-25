package DAY8;

import java.util.Scanner;
public class Matrix {

    static Scanner input = new Scanner(System.in);

    public static int[][] getMatrix(int m,int n){

        int[][] matrix = new int[m][n];
        for(int i = 0 ; i < n; i++){
            for(int j = 0 ; j < m ; j++){
                System.out.print("A[" + (i) + "][" + (j) + "] : ");
                matrix[i][j] = input.nextInt();
            }
            System.out.println();
        }

        return matrix;
    }

    public static void add_matrix(int[][] a, int m1, int n1, int[][] b,int m2,int n2){

        int result[][] = new int[m1][n1];
        for (int i = 0; i < n1; i++){
            for(int j = 0; j < m1; j++){

            }
        }

    }

    public static void display_matrix(int[][] matrix, int m, int n){

        for(int i = 0 ; i < n; i++){
            for(int j = 0 ; j < m ; j++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int m1 = 2;
        int n1 = 2;
        int m2 = 2;
        int n2 = 2;

        System.out.println("Enter the values of Matrix A");
        int[][] mat_a = getMatrix(m1,n1);
        System.out.println("Enter the values of Matrix B");
        int[][] mat_b = getMatrix(m2,n2);


    }
}
