package gr.aueb.cf.testbed.ch10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Project8 {

    final static int[][] board = new int[3][3];
    static int currentPlayer = 1;
    static boolean gameOver = false;

    public static void main(String[] args) {
        playGame();
    }

    /**
     * Starts the game.
     */
    public static void playGame() {
        Scanner in = new Scanner(System.in);

            while (!gameOver) {
                displayBoard();

                try {
                    System.out.print("Player " + currentPlayer + ", enter your move (row column): ");
                    int row = in.nextInt() - 1; // User Friendly
                    int col = in.nextInt() - 1; // User Friendly

                    if (isValidMove(row, col)) {
                        board[row][col] = currentPlayer;

                        if (checkWinner()) {
                            gameOver = true;
                            displayBoard();
                            System.out.println("Player " + currentPlayer + " wins!");
                        } else if (isBoardFull()) {
                            gameOver = true;
                            displayBoard();
                            System.out.println("It's a tie!");
                        } else {
                            currentPlayer = (currentPlayer == 1) ? 2 : 1;
                        }
                    } else {
                        System.out.println("Invalid move. Try again.");
                    }
                } catch (InputMismatchException e) {
                    in.nextLine();
                    System.out.println("Error in choice. Try again");
                }

            }
    }

    /**
     * Displays the Board.
     */
    public static void displayBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                char symbol;
                if (board[i][j] == 1) {
                    symbol = 'X';
                } else if (board[i][j] == 2) {
                    symbol = 'O';
                } else {
                    symbol = ' ';
                }
                System.out.print(symbol + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    /**
     * Validation for user's choice
     * @param row
     * @param col
     * @return true if choice is valid, false otherwise.
     */
    public static boolean isValidMove(int row, int col) {
            return (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == 0);
    }

    /**
     * Checks if we have 3 same in row / col or diagonal.
     * @return
     */
    public static boolean checkWinner() {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != 0 && board[i][0] == board[i][1] && board[i][0] == board[i][2]) {
                return true;
            }
            if (board[0][i] != 0 && board[0][i] == board[1][i] && board[0][i] == board[2][i]) {
                return true;
            }
        }

        if (board[0][0] != 0 && board[0][0] == board[1][1] && board[0][0] == board[2][2]) {
            return true;
        }
        if (board[0][2] != 0 && board[0][2] == board[1][1] && board[0][2] == board[2][0]) {
            return true;
        }

        return false;
    }

    /**
     * Checks if the board is full
     * @return
     */
    public static boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
