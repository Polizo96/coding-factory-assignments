package gr.aueb.cf.testbed.ch10;

import java.util.Scanner;

public class Project8 {

    final static Scanner in = new Scanner(System.in);
    final static int[][] ticTacToe = new int[3][3];

    public static void main(String[] args) {

    }

    public static int getChoice(String s) {
        return in.nextInt();
    }

    public static int choiceValid(int choice) {
        try {
            if (choice != 1 || choice != 2) {
                throw new IllegalArgumentException("You can play only 1 or 2");
            }
        } catch (IllegalArgumentException e) {
            throw e;
        }

        return choice;
    }

    public static boolean checkWinner() {


        for (int i = 0; i < ticTacToe.length; i++) {
            if (ticTacToe[i][0] == ticTacToe[i][1] && ticTacToe[i][0] == ticTacToe[i][2])
                return true;
        }

        for (int i = 0; i < ticTacToe.length; i++) {
            if (ticTacToe[0][i] == ticTacToe[1][i] && ticTacToe[0][i] == ticTacToe[2][i])
                return true;
        }

        if (ticTacToe[1][1] == ticTacToe[0][0] && ticTacToe[1][1] == ticTacToe[2][2]) {
            return true;
        }

        if (ticTacToe[1][1] == ticTacToe[2][0] && ticTacToe[1][1] == ticTacToe[0][2]) {
            return true;
        }

        return false;
    }

    public static void checkBoard() {

    }

}
