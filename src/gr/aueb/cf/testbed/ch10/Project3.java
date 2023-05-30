package gr.aueb.cf.testbed.ch10;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

public class Project3 {
    public static void main(String[] args) {

        int[][] charArr = new int[256][2];
        int character;
        int charIndex;

        try (BufferedReader br = new BufferedReader(
                new FileReader("/Users/nikospolizopoulos/Desktop/Coding Factory/Java/Txts/text.txt"))) {

            while ((character = br.read()) != -1) {
                charIndex = getIndexOfChar(charArr, character);

                if (charIndex == -1) {
                    charArr[character][0] = character;
                } else {
                    charArr[charIndex][1]++;
                }
            }

            sortByChars(charArr);

            for (int[] arr : charArr) {
                if (arr[1] > 0) {
                    System.out.println((char) arr[0] + " : " + arr[1]);
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static int getIndexOfChar(int[][] charArr, int character) {
        for (int i = 0; i < charArr.length; i++) {
            if (character == charArr[i][0]) {
                return i;
            }
        }

        return -1;
    }

    public static void sortByChars(int[][] arr) {
        Arrays.sort(arr, Comparator.comparing((int[] row) -> row[0]));
    }

//    public static void sortByRarity(int[][] arr) {
//        Arrays.sort(arr, Comparator.comparing((int[] row) -> row[1]));
//    }
}
