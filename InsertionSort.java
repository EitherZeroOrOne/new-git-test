/**
 * Created by Narek on 2/25/16.
 */

import java.util.Arrays;

public class InsertionSort {

    @SuppressWarnings("unused")

    public static void main(String[] args) {

        double array[] = {10.5, 5.2, 2.1, 90.7, 34.3, 1.1, 0.0, 1.2, 2.3, 2.7, 1.1};
        System.out.println("Array before sort: " + Arrays.toString(array));
        array = insertionSort(array);
        System.out.println("Array after sort: " + Arrays.toString(array));

    }

    // Average Case : O(n^2)

    private static double[] insertionSort(double[] array) {
        double key;
        int i;
        for (int j = 1; j < array.length; j++) {
            key = array[j];
            i = j - 1;
            while (i >= 0 && array[i] > key) {
                array[i + 1] = array[i];
                i = i - 1;
            }
            array[i + 1] = key;
        }
        return array;
    }
}
