package Demo;

public class BinarySearchRecr {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5, 6, 8, 9, 10};
        int target = 10;
        int start = 0;
        int end = arr.length - 1;
        System.out.println(binarySearch(arr, start, end, target));
    }
    private static int binarySearch(int[] arr, int start, int end, int target) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] > target) {
            return binarySearch(arr, start, mid - 1, target);
        }
        return binarySearch(arr, mid + 1, end, target);
    }
}
