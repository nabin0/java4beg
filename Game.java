import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter Your Name");
        String name;
        name = sc.next();

        if (name.equalsIgnoreCase("a") || name.equalsIgnoreCase("b") || name.equalsIgnoreCase("c")) {
            for (int i = 0; i < 10001; i++) {
                System.out.println(name + "Welcome.");
            }
        } else {
            System.out.println("Enter Your name !!!");
        }
        sc.close();
    }
}
