package gr.aueb.cf.testbed.ch5;

import java.util.Scanner;

/**
 * Ο χρήστης επιλέγει από το μενού και
 * το πρόγραμμα εμφανίζει αστεράκια
 * αναλόγως την επιλογή του χρήστη.
 */
public class SecondMenuStarsApp {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;
        do {
            printMenu();
            choice = getNextInt("Επιλέξτε ένα από τα παραπάνω");

            if (isChoiceInvalid(choice)){
                System.out.println("Παρακαλώ επιλέξτε από 1 έως 6.");
                continue;
            }
            if (isChoiceQuit(choice)){
                System.out.println("Έξοδος..");
                break;
            }
            onChoicePrintStars(choice);

        } while (true);
    }

    public static void printMenu() {
        System.out.println("1. Εμφάνισε n αστεράκια οριζόντια.");
        System.out.println("2. Εμφάνισε n αστεράκια κάθετα.");
        System.out.println("3. Εμφάνισε n γραμμές με n αστεράκια.");
        System.out.println("4. Εμφάνισε n γραμμές με αστεράκια 1 - n.");
        System.out.println("5. Εμφάνισε n γραμμές με αστεράκια n - 1.");
        System.out.println("6. Έξοδος από το πρόγραμμα.\n");
    }

    public static int getNextInt(String s) {
        System.out.println(s);
        return in.nextInt();
    }

    public static boolean isChoiceInvalid(int choice) {
        return choice < 1 || choice > 6;
    }


    public static boolean isChoiceQuit(int choice) {
        return choice == 6;
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

    public static void onChoicePrintStars(int choice) {
        int nStars;

        switch (choice) {
            case 1:
                nStars = getNextInt("Δώσε αριθμό για αστεράκια");
                horizontalStars(nStars,1);
                break;
            case 2:
                nStars = getNextInt("Δώσε αριθμό για αστεράκια");
                verticalStars(nStars);
                break;
            case 3:
                nStars = getNextInt("Δώσε αριθμό για αστεράκια");
                horizontalStars(nStars, nStars);
                break;
            case 4:
                nStars = getNextInt("Δώσε αριθμό για αστεράκια");
                for (int i = 1; i <= nStars; i++) {
                    horizontalStars(i,1);
                }
                break;
            case 5:
                nStars = getNextInt("Δώσε αριθμό για αστεράκια");
                for (int i = nStars; i >= 1; i--){
                    horizontalStars(i,1);
                }
                break;
            case 6:
            default:
                break;
        }

    }
}
