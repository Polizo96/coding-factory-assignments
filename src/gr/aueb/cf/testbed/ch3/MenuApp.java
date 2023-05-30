package gr.aueb.cf.testbed.ch3;

import java.util.Scanner;

/**
 * Εμφανίζει ένα μενού και ο χρήστης εισάγει
 * έναν αριθμό απο το 1-5 επαναληπτικά μέχρι
 * να κάνει έξοδο (5) και εμφανίζει feedback
 * για κάθε επιλογή.
 *
 * @author NikosPolizopoulos
 */
public class MenuApp {
    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
    int choice = 0;

    do {
        System.out.println("1. Εισαγωγή");
        System.out.println("2. Διαγραφή");
        System.out.println("3. Ενημέρωση");
        System.out.println("4. Αναζήτηση");
        System.out.println("5. Έξοδος\n");

        System.out.println("Εισάγετε επιλογή 1-5");
        choice = sc.nextInt();

        if (choice == 1)
            System.out.println("Επιλέξατε Εισαγωγή.\n");
        else if (choice == 2)
            System.out.println("Επιλέξατε Διαγραφή.\n");
        else if (choice == 3)
            System.out.println("Επιλέξατε Ενημέρωση.\n");
        else if (choice == 4)
            System.out.println("Επιλέξατε Αναζήτηση.\n");
        else if (choice == 5)
            System.out.println("Επιλέξατε Έξοδο.");
        else
            System.out.println("Error: Οι επιλογές είναι από το 1 έως το 5!\n");

    } while (choice != 5);

    }
}
