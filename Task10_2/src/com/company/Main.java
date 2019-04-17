package com.company;

import java.util.Arrays;

public class Main {
    // for full transparency I found the solution unintentionally on google here:
    // https://www.geeksforgeeks.org/n-queen-problem-backtracking-3/
    // It looks like it is a well written about algo with a lot of solutions posted online.
    // After seeing it I improved/wrote the code on my own.

    public static void main(String[] args) {
        int boardSize = 8;
        int[][] board = new int[boardSize][boardSize];

        if (!solved(board, 0, boardSize))
        {
            System.out.print("Solution not found");
        }else {
            printBoard(board, boardSize);
        }
    }


    private static boolean solved(int[][] board, int col, int boardSize) {
        // solved if you move past the last column
        if (col >= boardSize) return true;

        for (int row = 0; row < boardSize; row++)
        {
            if (canBePlaced(board, row, col, boardSize))
            {
                board[row][col] = 1;
                if (solved(board, col + 1, boardSize)) return true;
            }
            board[row][col] = 0;
        }
        return false;
    }


    private static boolean canBePlaced(int board[][], int row, int col, int boardSize)
    {
        // check current row for queens
        // contains should be as faster or as fast as a loop i think...
        if (Arrays.toString(board[row]).contains("1"))
            return false;

        int i, j;

        // Check upper diagonal
        for (i=row, j=col; i>=0 && j>=0; i--, j--)
            if (board[i][j] == 1)
                return false;

        // Check lower diagonal
        for (i=row, j=col; j>=0 && i<boardSize; i++, j--)
            if (board[i][j] == 1)
                return false;

        return true;
    }


    private static void printBoard(int[][] board, int boardSize) {
        for (int row = 0; row < boardSize; row++) {
            for (int col = 0; col < boardSize; col++) {
                if (board[row][col] == 0) {
                    System.out.print("- ");
                } else {
                    System.out.print("Q ");
                }
            }
            System.out.println();
        }
    }
}
