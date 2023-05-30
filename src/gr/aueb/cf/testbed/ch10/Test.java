package gr.aueb.cf.testbed.ch10;

import java.util.Scanner;

public class Test {

    private int[][] board;
    private int currentPlayer;
    private boolean gameOver;

    public Test() {
        board = new int[3][3];
        currentPlayer = 1;
        gameOver = false;
    }

    public void play() {
        Scanner scanner = new Scanner(System.in);

        while (!gameOver) {
            // Εμφάνιση της τρίλιζας
            displayBoard();

            // Ανάγνωση της κίνησης του τρέχοντος παίκτη
            System.out.print("Player " + currentPlayer + ", enter your move (row column): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            // Έλεγχος αν η κίνηση είναι έγκυρη
            if (isValidMove(row, col)) {
                // Εκτέλεση της κίνησης
                board[row][col] = currentPlayer;

                // Έλεγχος αν ο παίκτης έκανε τρίλιζα
                if (checkWinner()) {
                    gameOver = true;
                    displayBoard();
                    System.out.println("Player " + currentPlayer + " wins!");
                } else if (isBoardFull()) {
                    // Έλεγχος αν έχουμε ισοπαλία
                    gameOver = true;
                    displayBoard();
                    System.out.println("It's a tie!");
                } else {
                    // Αλλαγή του τρέχοντος παίκτη
                    currentPlayer = (currentPlayer == 1) ? 2 : 1;
                }
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }

        scanner.close();
    }

    public void displayBoard() {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                char symbol = (board[i][j] == 1) ? 'X' : (board[i][j] == 2) ? 'O' : ' ';
                System.out.print(symbol + " | ");
            }
            System.out.println("\n-------------");
        }
    }

    public boolean isValidMove(int row, int col) {
        return (row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == 0);
    }

    public boolean checkWinner() {
        // Έλεγχος για τρίλιζα σε γραμμές και στήλες
        for (int i = 0; i < 3; i++) {
            if (board[i][0] != 0 && board[i][0] == board[i][1] && board[i][0] == board[i][2]) {
                return true;
            }
            if (board[0][i] != 0 && board[0][i] == board[1][i] && board[0][i] == board[2][i]) {
                return true;
            }
        }

        // Έλεγχος για τρίλιζα σε διαγώνιες
        if (board[0][0] != 0 && board[0][0] == board[1][1] && board[0][0] == board[2][2]) {
            return true;
        }
        if (board[0][2] != 0 && board[0][2] == board[1][1] && board[0][2] == board[2][0]) {
            return true;
        }

        return false;
    }

    public boolean isBoardFull() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Test game = new Test();
        game.play();
    }

}
