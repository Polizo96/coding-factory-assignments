package gr.aueb.cf.testbed.ch6;

public class ArrayMaxPosition {

    public static void main(String[] args) {
        int[] arr = {6, 8, 2, 14, 3, 25, 12, 1};
        int maxPosition = getMaxPosition(arr, 0 ,7);
        System.out.println(maxPosition);
    }

    /**
     * Returns the position of array's max element.
     * If there's an error returns -1.
     * @param arr       the given array.
     * @param low       the start position.
     * @param high      the end position.
     * @return
     */
    public static int getMaxPosition(int[] arr, int low, int high) {
        if (arr == null) return -1;
        if (low < 0 || low > arr.length - 1 || high < 0 || high > arr.length - 1) return -1;

        int maxPosition = low;

        for (int i = low + 1; i <= high; i++) {
            if (arr[i] > arr[maxPosition]) {
                maxPosition = i;
            }
        }
        return maxPosition;
    }
}
