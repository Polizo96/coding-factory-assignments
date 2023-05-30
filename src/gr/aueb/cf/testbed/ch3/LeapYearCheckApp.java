package gr.aueb.cf.testbed.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει ένα έτος και
 * το πρόγραμμα ελέγχει αν είναι
 * δίσεκτο.
 *
 * @author NikosPolizopoulos
 */
public class LeapYearCheckApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputYear = 0;
        boolean isLeap = false;

        System.out.println("Please insert a year");
        inputYear = sc.nextInt();

        if (inputYear % 4 == 0 && inputYear % 100 != 0)
            isLeap = true;
        else if (inputYear % 400 == 0)
            isLeap = true;
//        else
//            isLeap = false;


        if (isLeap)
            System.out.printf("Το έτος %d είναι δίσεκτο", inputYear);
        else
            System.out.printf("Το έτος %d δεν είναι δίσεκτο", inputYear);
    }
}
