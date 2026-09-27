package Pattern;

import java.util.Arrays;

public class SelectionSort {

    static void main(String[] args) {
        int[] arr = {4, 3, 2, 1};

        sort(arr, arr.length - 1, 0, 0);

        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int r, int c, int max) {

        // Base condition
        if (r == 0) {
            return;
        }

        // Find maximum element
        if (c < r) {

            if (arr[c] > arr[max]) {
                sort(arr, r, c + 1, c);
            } else {
                sort(arr, r, c + 1, max);
            }

        } else {

            // Swap maximum with last element of current range
            int temp = arr[max];
            arr[max] = arr[r - 1];
            arr[r - 1] = temp;

            // Sort remaining part
            sort(arr, r - 1, 0, 0);
        }
    }
}