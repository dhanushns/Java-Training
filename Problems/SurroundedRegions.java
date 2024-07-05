package Problems;

import java.util.Arrays;

public class SurroundedRegions {

    public static void DFS(char[][] board,int row,int col){
        if (board[row][col] == 'X')
            return;

        if (board[row][col] == 'Y')
            return;

        board[row][col] = 'Y';

        if (col + 1 < board[0].length) {
            DFS(board, row, col + 1);
        }
        if (row + 1 < board.length) {
            DFS(board, row + 1, col);
        }

        if (col - 1 != -1) {
            DFS(board, row, col - 1);
        }

        if (row - 1 != -1) {
            DFS(board, row - 1, col);
        }
    }

    public static void main(String[] args) {
        char[][] board = new char[][] {{'X','X','X','X'},{'X','O','O','X'},{'X','X','O','X'},{'X','O','X','X'}};
        for(int i = 0 ; i < board[0].length; i++) {
            if (board[0][i] == 'O')
                DFS(board,0,i);
        }
        for(int i = 1 ; i < board.length; i++) {
            if (board[i][0] == 'O')
                DFS(board,i,0);
        }
        for(int i = 1 ; i < board[0].length; i++) {
            if (board[board.length-1][i] == 'O')
                DFS(board,board.length-1,i);
        }
        for(int i = 1 ; i < board.length; i++) {
            if (board[i][board[0].length-1] == 'O')
                DFS(board,i,board[0].length-1);
        }

        for(int i = 0 ; i < board.length; i++){
            for(int j = 0; j < board[i].length;j++){
                if(board[i][j] == 'O')
                    board[i][j] = 'X';
                else if(board[i][j] == 'Y')
                    board[i][j] = 'O';
            }
        }
        for(char[] row : board){
            System.out.println(Arrays.toString(row));
        }
    }
}
