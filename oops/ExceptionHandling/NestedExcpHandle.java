package ExceptionHandling;

import java.util.Scanner;

public class NestedExcpHandle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 45;

        try {
            int b = sc.nextInt();
            try {
                int c = a / b;
                System.out.println(c);
            } catch (Exception e) {
                System.out.println(e);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        sc.close();
    }
}
