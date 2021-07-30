public class Sorting {

    public static void main(String[] args) {
        // Arrays for testing
        // int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 }; //Increasing order array
        int[] arr = { 9, 7, 5, 3, 2 }; // Decreaisng Order array
        boolean incOrder = true;

        // Checking order of array
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                if (incOrder == false) {
                    break;
                }
                incOrder = true;
            } else {
                incOrder = false;
            }
        }

        if (incOrder) {
            System.out.println("Increasing order");
        } else {
            System.out.println("Decreasing order");
        }
    }
}