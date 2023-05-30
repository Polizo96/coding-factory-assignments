package gr.aueb.cf.testbed.ch6;

/**
 * Βρίσκει το δεύτερο μικρότερο στοιχείο
 * του πίνακα.
 */
public class SecondLowestElement {

    public static void main(String[] args) {
        int[] arr = {6, 8, 2, 14, 3, 25, 12};

        System.out.println(getSecondMinElem(arr));

    }

    /**
     * Returns the second minimum element.
     * If array is null returns -1.
     * @param arr       the given array.
     * @return
     */
    public static int getSecondMinElem(int[] arr) {
        if (arr == null) return -1;

        int minValue = arr[0];
        int secondMinValue = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < minValue) {
                secondMinValue = minValue;
                minValue = arr[i];
            } else if (arr[i] < secondMinValue && arr[i] != minValue) {
                secondMinValue = arr[i];
            }
        }

        return secondMinValue;
    }
}
