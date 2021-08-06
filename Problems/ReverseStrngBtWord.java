package Problems;

import java.util.ArrayList;

public class ReverseStrngBtWord {

    public static void revString(String s) {
        // ArrayList<String> arr = new ArrayList<>();
        String[] arr = new String[20];

        int a = 0;
        String temps = "";
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) != ' ') {
                temps += s.charAt(i);
            }
            if ((s.charAt(i) == ' ') || (i == (s.length() - 1))) {
                if (temps.length() != 0) {
                    arr[a] = temps;
                    a++;
                }
                temps = "";
            }
        }

        for (int i = (arr.length - 1); i >= 0; i--) {
            if (arr[i] == null) {
                continue;
            }
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        String str = "Hello         How        are                                          You";

        revString(str);

        // Using in built methods

        // String[] ar = str.split(" ");
        // for (int i = ar.length - 1; i >= 0; i--) {
        // System.out.print(ar[i] + " ");
        // }

    }
}