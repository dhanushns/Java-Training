package Problems;

import java.util.Scanner;
public class NQueens {

    static int countPossiblePlaces;

    public static void placeQueen(boolean[][] isPlaced, int row, int n){

        if(n == 0) {
            countPossiblePlaces++;
            for(boolean[] boardRow : isPlaced){
                for(boolean queen : boardRow)
                    System.out.print(queen ? " Q " : " . ");
                System.out.println();
            }
            System.out.println("\n");
            return;
        }

        if(row == isPlaced.length)
            return;

        for(int col = 0 ; col < isPlaced.length ; col++) {
            if (isItSafeToPlace(isPlaced, row, col)) {
                isPlaced[row][col] = true;
                placeQueen(isPlaced, row + 1, n-1);
                isPlaced[row][col] = false;
            }
        }
        placeQueen(isPlaced, row + 1, n);
    }

    public static boolean isItSafeToPlace(boolean[][] isPlaced,int row,int col){

        //check current position of Queen
        if(isPlaced[row][col])
            return false;

        //check vertically upward direction
        int r = row-1;
        int c = col;
        int boardSize = isPlaced.length;

        while(r >= 0) {
            if (isPlaced[r][c]) return false;
            r--;
        }

        //check horizontal direction left
        r = row;
        c = col-1;
        while(c >= 0) {
            if (isPlaced[r][c]) return false;
            c--;
        }
        //right
        c = col+1;
        while(c < boardSize){
            if(isPlaced[r][c]) return false;
            c++;
        }

        //diagonal direction top-left
        r = row-1;
        c = col-1;
        while (r >= 0 && c >= 0){
            if(isPlaced[r][c]) return false;
            r--;
            c--;
        }

        //diagonal direction top-right
        r = row-1;
        c  = col+1;
        while(r >= 0 && c < boardSize){
            if(isPlaced[r][c]) return false;
            r--;
            c++;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the board size : ");
        int boardSize = input.nextInt();
        System.out.print("Enter number of Queens to be placed in the board : ");
        int queenSize = input.nextInt();
        while(queenSize > boardSize){
            System.out.println("Invalid Queen size");
            System.out.print("Enter number of Queens to be placed in the board : ");
            queenSize = input.nextInt();
        }
        boolean[][] board = new boolean[boardSize][boardSize];
        placeQueen(board,0,queenSize);
        System.out.println("Number of ways to be placed : " + countPossiblePlaces);

    }

}
