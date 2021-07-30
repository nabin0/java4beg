import java.util.Random;
import java.util.Scanner;

public class rock_paper_scissor {

    // 0 for rock
    // 1 for paper
    // 2 for scissor

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose :\n0 for Rock\n1 for Paper\n2 for Scissor");

        int inp = sc.nextInt();
        Random rd = new Random();
        int rand = rd.nextInt(3);

        if (inp == rand) {
            System.out.println("Draw");
        } else if ((inp == 1 && rand == 0) || (inp == 0 && rand == 2) || (inp == 3 && rand == 1)) {
            System.out.println("You Win!!!");
        } else {
            System.out.println("You Lost!!!");
        }

        if (rand == 0) {
            System.out.println("Computer choose: Rock");
        } else if (rand == 1) {
            System.out.println("Computer choose: Paper");
        } else {
            System.out.println("Computer choose: Scissor");
        }
        sc.close();
    }
}