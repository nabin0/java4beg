package Algo;

public class binarySearch {

    static int binarysearch(int[] arr, int key) {

        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int mid = s + e / 2;

            if (key == arr[mid]) {
                return mid;
            } else if (key > arr[mid]) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 4, 6, 7, 8, 9 };
        System.out.println(binarysearch(arr, 6));
    }
}
