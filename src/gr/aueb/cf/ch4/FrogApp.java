package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 * Ένας μικρός βάτραχος θέλει να περάσει ένα ποτάμι.
 * Ο frog βρίσκεται στη θέση Χ και θέλει να φτάσει στη
 * θέση Y (ή σε θέση > Y).O frog jumps a fixed distance, D
 *
 * Βρίσκει τον ελάχιστο αριθμό jumps που ο small frog πρέπει
 * να κάνει ώστε να φτάσει (ή να ξεπεράσει) τον στόχο.
 *
 * Για παράδειγμα, αν έχουμε :
 * X = 10
 * Y = 85
 * D = 30,
 *
 * τότε ο small frog θα χρειαστεί 3 jumps, γιατί:
 * Starts at 10, και μετά το πρώτο jump πάει στη θέση 10 + 30 = 40
 * στο 2ο jump πάει 40 + 30 = 70
 * Και στο 3ο πάει 70 + 30 = 100
 *
 */
public class FrogApp {

    public static void main(String[] args) {
        int jumps = 0;
        int x = 10;
        int y = 85;
        int jmp = 30;
        // Εκτος απο for / while που θα ηταν ευκολο υπαρχει κ αυτο:
        jumps = (int) Math.ceil((y - x) / (float) jmp);

        System.out.println(jumps);

    }
}
