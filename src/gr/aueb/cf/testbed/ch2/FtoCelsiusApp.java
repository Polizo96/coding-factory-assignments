package gr.aueb.cf.testbed.ch2;

import java.util.Scanner;

/**
 * Μετατρέπει ακέραιες θερμοκρασίες
 * Fahrenheit σε Celsius
 *
 * @author NikosPolizopoulos
 */

public class FtoCelsiusApp {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int f = 0;
        int c = 0;

        System.out.println("Εισάγετε θερμοκρασία σε Fahrenheit: ");
        f = sc.nextInt();

        c = 5 * (f - 32) / 9;

        System.out.println("Η θερμοκρασία σε Celsius είναι: " + c);

    }
}
