package gr.aueb.cf.testbed.ch5;

import java.util.Scanner;

/**
 * Ο χρήστης επιλέγει από το μενού και
 * το πρόγραμμα εμφανίζει αστεράκια
 * αναλόγως την επιλογή του χρήστη.
 */
public class MenuStarsApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int inputStars;
        int choice;

        do {
            System.out.println("1. Εμφάνισε n αστεράκια οριζόντια.");
            System.out.println("2. Εμφάνισε n αστεράκια κάθετα.");
            System.out.println("3. Εμφάνισε n γραμμές με n αστεράκια.");
            System.out.println("4. Εμφάνισε n γραμμές με αστεράκια 1 - n.");
            System.out.println("5. Εμφάνισε n γραμμές με αστεράκια n - 1.");
            System.out.println("6. Έξοδος από το πρόγραμμα.\n");
            System.out.println("Δώσε επιλογή:");
            choice = in.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Δώσε αριθμό για αστεράκια");
                    inputStars = in.nextInt();
                    horizontalStars(inputStars,1);
                    break;
                case 2:
                    System.out.println("Δώσε αριθμό για αστεράκια");
                    inputStars = in.nextInt();
                    verticalStars(inputStars);
                    break;
                case 3:
                    System.out.println("Δώσε αριθμό για αστεράκια");
                    inputStars = in.nextInt();
                    horizontalStars(inputStars, inputStars);
                    break;
                case 4:
                    System.out.println("Δώσε αριθμό για αστεράκια");
                    inputStars = in.nextInt();
                    for (int i = 1; i <= inputStars; i++) {
                        horizontalStars(i,1);
                    }
                    break;
                case 5:
                    System.out.println("Δώσε αριθμό για αστεράκια");
                    inputStars = in.nextInt();
                    for (int i = inputStars; i >= 1; i--){
                        horizontalStars(i,1);
                    }
                    break;
                case 6:
                    System.out.println("Έξοδος...");
                    break;
                default:
                    System.out.println("Παρακαλώ επιλέξτε 1-6.");
            }
        } while (choice != 6);

    }

    /**
     * Prints stars horizontally.
     * @param n     number of stars.
     * @param lines     number of lines.
     */
    public static void horizontalStars(int n, int lines) {

        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /**
     * Prints stars vertically.
     * @param n     number of stars.
     */
    public static void verticalStars(int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("*");
        }
    }
}
