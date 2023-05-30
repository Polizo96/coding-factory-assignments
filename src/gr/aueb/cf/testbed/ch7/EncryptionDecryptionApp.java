package gr.aueb.cf.testbed.ch7;

import java.util.Scanner;

/**
 * Encrypts/Decrypts a given String.
 */
public class EncryptionDecryptionApp {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        String givenString;
        String enString;
        String decString;

        givenString = getString("Please provide a String");
        enString = encryptString(givenString);
        System.out.printf("Provided string is encrypted into: %s\n",enString);
        decString = decryptString(enString);
        System.out.printf("Encrypted string is decrypted into: %s",decString);
    }

    public static String getString(String s) {
        System.out.println(s);
        return in.nextLine();
    }

    /**
     * Gets a string and it turns it to a char array.
     * After it turns it back to string to an encrypted form.
     * @param s     the given string.
     * @return      the  encrypted string.
     */
    public static String encryptString(String s) {
        char[] sArr;
        String enString = "";

        sArr = s.toCharArray();

        for (int i = 0; i < sArr.length; i++) {
            sArr[i]++;
        }

        for (int i = 0; i < sArr.length; i++) {
            enString  = enString.concat(String.valueOf(sArr[i]));
        }

        return enString;
    }

    /**
     * Gets an encrypted string and decrypts it
     * with the help of StringBuilder and then it
     * turns it back to string.
     * @param s     the encrypted string.
     * @return      the decrypted string.
     */
    public static String decryptString(String s) {
        StringBuilder decString = new StringBuilder();
        char ch;

        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            decString.append(--ch);
        }

        return decString.toString();
    }


}
