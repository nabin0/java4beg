package Problems;

public class AarrangeArrXorOper {
    public static void main(String[] args) {
        int[] arr = {10, 11, 1, 2, 3};

        for(int i =1; i< arr.length; i++){
            arr[i-1] = arr[i-1] ^ arr[i];
        }

        for(int elem:arr){
            System.out.print(elem+ " ");
        }
    }
}
