package ExceptionHandling;

import java.util.Scanner;

public class SpecificExceptionHandling {
    public static void main(String[] args) {
        int[] arr = { 1, 234, 533, 1245, 662, 32 };
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        try {
            System.out.println(arr[6]);
            System.out.println(arr[5] / a);
            System.out.println(a);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("You are trying to access non existing element.");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic exception occured");
        }
    }
}
