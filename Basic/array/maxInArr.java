package array;

public class maxInArr {
    public static void main(String[] args) {
        int [] arr = {12, 2 ,1,45,65,77,34,23};
        int max = Integer.MIN_VALUE;

        for(int i =0; i < arr.length; i++){
            max = Integer.max(max, arr[i]);
        }
        System.out.println("The maximum element in the array is : "+max);
    }
}
