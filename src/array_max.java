
public class array_max {
    public static void main(String[] args) {
        int[] arr = {2,4,9,3,6,11,1};

        int mx= Integer.MIN_VALUE;
        for(int i =0; i < arr.length; i++){
                mx = Integer.max(mx, arr[i]);
        }
        System.out.println("The Maximum value is: "+mx);
    }
}
