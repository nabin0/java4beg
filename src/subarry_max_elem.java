public class subarry_max_elem {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5 };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                int mx = Integer.MIN_VALUE;
                System.out.print("The sub array is :{ ");
                for (int k = j; k <= i; k++) {
                    mx = Integer.max(mx, arr[k]);
                    System.out.print(arr[k] + ", ");
                }
                System.out.println(" } and max is : " + mx);
            }
        }
    }

}