package com.wipro.java.usecase3;

import java.util.Scanner;

public class TicTacToe {
    // Constants for empty cell and player symbols
    private static final char EMPTY = ' ';
    private static final char PLAYER_X = 'X';
    private static final char PLAYER_O = 'O';

    // 3x3 board for Tic-Tac-Toe
    private static char[][] board = {
            {EMPTY, EMPTY, EMPTY},
            {EMPTY, EMPTY, EMPTY},
            {EMPTY, EMPTY, EMPTY}
    };

    // Current player, starting with X
    private static char currentPlayer = PLAYER_X;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean gameRunning = true;

        System.out.println("Welcome to Tic-Tac-Toe!");
        printBoard(); // Show empty board at the start

        while (gameRunning) {
            // Prompt the current player for their move
            System.out.println("Player " + currentPlayer + ", enter your move (row and column: 1-3 1-3): ");
            int row = scanner.nextInt() - 1; // Convert input to zero-based index
            int col = scanner.nextInt() - 1;

            // Validate the move
            if (isValidMove(row, col)) {
                board[row][col] = currentPlayer; // Place player's symbol
                printBoard(); // Print updated board

                // Check if the player wins
                if (checkWinner(currentPlayer)) {
                    System.out.println("Player " + currentPlayer + " wins!");
                    gameRunning = false; // End the game
                } 
                // Check if the board is full (draw)
                else if (isBoardFull()) {
                    System.out.println("It's a draw!");
                    gameRunning = false; // End the game
                } 
                // Switch to the other player if no one wins
                else {
                    switchPlayer();
                }
            } else {
                System.out.println("Invalid move! Try again.");
            }
        }
        scanner.close();
    }

    // Method to print the current state of the board
    private static void printBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    // Check if a move is valid (inside bounds and empty cell)
    private static boolean isValidMove(int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == EMPTY;
    }

    // Check if the given player has won
    private static boolean checkWinner(char player) {
        // Check rows and columns for a win
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) || // Row win
                (board[0][i] == player && board[1][i] == player && board[2][i] == player)) { // Column win
                return true;
            }
        }
        // Check both diagonals for a win
        return (board[0][0] == player && board[1][1] == player && board[2][2] == player) ||  // Main diagonal
               (board[0][2] == player && board[1][1] == player && board[2][0] == player);    // Anti-diagonal
    }

    // Check if the board is full (draw condition)
    private static boolean isBoardFull() {
        for (char[] row : board) {
            for (char cell : row) {
                if (cell == EMPTY) {
                    return false; // Empty cell found, board is not full
                }
            }
        }
        return true; // No empty cells left
    }

    // Switches the current player from X to O or vice versa
    private static void switchPlayer() {
        currentPlayer = (currentPlayer == PLAYER_X) ? PLAYER_O : PLAYER_X;
    }
}
