package gr.aueb.cf.testbed.ch4;

import java.util.Scanner;

/**
 * Ο χρήστης δίνει το n και το πρόγραμμα
 * εμφανίζει n οριζόντια αστεράκια.
 */
public class HorizontalStarsApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;

        System.out.println("Please insert n");
        n = in.nextInt();

        for (int i = 1; i <= n; i ++) {
            System.out.print("*");
        }
    }
}
