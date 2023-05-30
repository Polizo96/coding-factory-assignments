package gr.aueb.cf.testbed.ch10;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class Project1 {

    public static void main(String[] args) {

        try (Scanner in = new Scanner(new File("/Users/nikospolizopoulos/Desktop/numbersIn.txt"));
             PrintStream ps = new PrintStream("/Users/nikospolizopoulos/Desktop/numbersOut.txt", StandardCharsets.UTF_8)){

            final int NUMBERS_SIZE = 6;
            int[] inNumbers = new int[49];
            int pivot = 0;
            int[] outNumbers = new int[6];
            int num;
            int window;

            while ((num = in.nextInt()) != -1 && pivot <= 48) {
                inNumbers[pivot] = num;
                pivot++;
            }

            int[] numbers = Arrays.copyOfRange(inNumbers, 0 , pivot);
            Arrays.sort(numbers);

            window = pivot - NUMBERS_SIZE;

            for (int i = 0; i <= window; i++) {
                for (int j = i + 1; j <= window + 1; j++) {
                    for (int k = j + 1; k <= window + 2; k++) {
                        for (int l = k + 1; l <= window + 3; l++) {
                            for (int m = l + 1; m <= window + 4; m++) {
                                for (int n = m + 1; n <= window + 5; n++) {
                                    outNumbers[0] = numbers[i];
                                    outNumbers[1] = numbers[j];
                                    outNumbers[2] = numbers[k];
                                    outNumbers[3] = numbers[l];
                                    outNumbers[4] = numbers[m];
                                    outNumbers[5] = numbers[n];

                                    if ((!isEven(outNumbers,4)) && (!isOdd(outNumbers,4)) &&
                                            (!isContinuous(outNumbers, 1)) && (!isSameEnding(outNumbers,3)) &&
                                            (!isSameTen(outNumbers,2)))
                                        ps.printf("%d %d %d %d %d %d\n",
                                                outNumbers[0], outNumbers[1], outNumbers[2], outNumbers[3], outNumbers[4], outNumbers[5]);
                                }
                            }
                        }
                    }
                }
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static boolean isEven(int[] arr, int threshold) {
        int even = 0;

        for (int num : arr) {
            if (num % 2 == 0) even++;
        }

        return even > threshold;
    }

    public static boolean isOdd(int[] arr, int threshold) {
        int odd = 0;

        for (int num : arr) {
            if (num % 2 != 0) odd++;
        }

        return odd > threshold;
    }

    public static boolean isContinuous(int[] arr,int threshold) {
        int continues = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr [i+1]) {
                continues++;
            }
        }

        return continues > threshold;
    }

    public static boolean isSameEnding(int[] arr, int threshold) {
        int last1 = 0;
        int last2 = 0;
        int sameEnding = 0;
        for (int i = 0; i < arr.length; i++) {
            last1 = arr[i] % 10;
            for (int j = i + 1; j < arr.length; j++) {
                last2 = arr[j] % 10;

                if (last1 == last2) {
                    sameEnding++;
                }
            }
        }
        return sameEnding > threshold;
    }

    public static boolean isSameTen(int[] arr,int threshold) {

        int[] tensCounts = new int[5];

        for (int num : arr) {
            int ten = num / 10;
            tensCounts[ten]++;
        }

        for (int count : tensCounts) {
            if (count > threshold) {
                return true;
            }
        }

        return false;
    }
}








