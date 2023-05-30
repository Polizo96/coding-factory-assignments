package gr.aueb.cf.testbed.ch8;

import java.util.Scanner;

/**
 * Checking every possible choice with try/catch
 * or state-testing on a menu.
 */
public class MenuApp {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;

        do {
            printMenu();
            choice = getChoice("Provide your choice: ");
            try {
                printChoice(choice);
            } catch (IllegalArgumentException e) {
                System.out.println("You have to choose between 1-5");
            }
        } while (choice != 5);
        System.out.println("Exiting..");
    }

    /**
     * Prints a menu.
     */
    public static void printMenu() {
        System.out.println("Choose an option");
        System.out.println("1. Insert");
        System.out.println("2. Delete");
        System.out.println("3. Search");
        System.out.println("4. Update");
        System.out.println("5. Exit");
    }

    /**
     * Checks if users choice is int
     * @param s     the question to user.
     * @return      users choice.
     */
    public static int getChoice(String s){
        int choice = 0;

        System.out.println(s);
        if (in.hasNextInt()) {
            choice = in.nextInt();
            in.nextLine();
        } else {
            in.nextLine();
            System.out.println("Error: Only integers allowed.");
        }

        return choice;
    }

    /**
     * Prints choice if it's correct, throws exception otherwise.
     * @param choice        users choice.
     * @throws IllegalArgumentException
     */
    public static void printChoice(int choice) throws IllegalArgumentException {
        if (choice >= 1 && choice <= 5) {
            System.out.printf("You chose: %d\n",choice);
        } else {
            throw new IllegalArgumentException();
        }
    }
}
