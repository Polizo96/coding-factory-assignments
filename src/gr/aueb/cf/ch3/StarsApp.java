package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Εκτυπώνει n οριζόντια αστεράκια,
 * όπου n ένας ακέραιος που δίνει
 * ο χρήστης.
 */
public class StarsApp {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfStars = 0;
        int i = 0;


        System.out.println("Please insert number of stars");
        numberOfStars = sc.nextInt();

        while (i <= numberOfStars) {
            System.out.print("*");
            i++;
//            if (i % 50 == 0) {
//                System.out.println();
//            }
        }
    }
}
