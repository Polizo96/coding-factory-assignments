package gr.aueb.cf.testbed.ch2;

import java.util.Scanner;

/**
 * Εμφανίζει την ημερομηνία σε
 * μορφη ΗΗ/ΜΜ/ΕΕ
 *
 * @author NikosPolizopoulos
 */

public class DateApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int day = 0;
        int month = 0;
        int year = 0;

        System.out.println("Εισάγετε 3 ακέραιους αριθμούς(Ημέρα Μήνας Έτος): ");
        day = sc.nextInt();
        month = sc.nextInt();
        year = sc.nextInt();

        year = year % 100;

        System.out.printf("Ημερομηνία:%02d/%02d/%02d",day, month, year);

    }
}
