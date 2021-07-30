package array;

public class calculateAvgUsingForeach {
public static void main(String[] args) {
    int []arr = {12,324,564,32,1,12,111};

    int total=0;
    for (int i : arr) {
        total = total +i;
    }

    System.out.println(total/(arr.length));
}
}