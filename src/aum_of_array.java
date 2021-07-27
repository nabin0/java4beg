public class aum_of_array {
    public static void main(String[] args) {
        float[] arr = { 1.40f, 1.10f, 4.50f, 6.0f };
        float sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        System.out.println(sum);
    }
}
