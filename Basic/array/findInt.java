package array;

public class findInt {
    public static void main(String[] args) {
        int[] arr = { 1, 4, -4, -2, 17 };
        boolean find = false;
        int key = 42;

        int i;
        for (i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                find = true;
                break;
            }
        }

        if (find) {
            System.out.println("The key is found at index : " + i);
        } else {
            System.out.println("Given number is not present in the array");
        }
    }
}
