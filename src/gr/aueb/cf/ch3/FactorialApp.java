package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το n!
 */
public class FactorialApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int i = 1;
        long facto = 1L;

        System.out.println("Please insert n");
        n = sc.nextInt();

        while (i <= n) {
            facto *= i;
            i++;
        }
        System.out.printf("%d! = %,d", n, facto);
    }
}
