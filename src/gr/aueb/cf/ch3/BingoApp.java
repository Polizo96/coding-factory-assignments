package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Δίνει bingo όταν ο χρήστης
 * μαντέψει σωστά το secret key.
 */
public class BingoApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        final int SECRET = 11;

        while (true) {
            System.out.println("Please provide a secret num");
            num = sc.nextInt();

            if (num == SECRET) {
                System.out.println("Bingo!");
                break;
            } else {
                System.out.println("Try again!");
            }
        }
    }
}
