package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Αποφασίζει αν χιονίζει με βάση
 * τη θερμοκρασία.Αν η θερμοκρασία
 * ειναι < 0, τότε χιονίζει, αλλιώς
 * δε χιονίζει.Ο χρήστης δίνει τη
 * θερμοκρασία.
 */
public class TemperatureApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isSnowing = false;
        int temp = 0;

        System.out.println("Please insert current temperature");
        temp = sc.nextInt();

        isSnowing = (temp < 0);

        System.out.println("Is snowing: " + isSnowing);
    }
}
