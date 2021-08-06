package ExceptionHandling;

public class ExpHandling {
    public static void main(String[] args) {
        int a = 9;
        int b = 4;

        try {
            int c = a / b; // Throws an exception when b is 0
            System.out.println(c);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("Program Executed");
        }
    }
}
