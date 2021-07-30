import java.util.Random;
import java.util.Scanner;

class GuessGame {
    int guess;
    int random;
    int noOfguess = 0;
    Scanner sc = new Scanner(System.in);

    GuessGame() {
        Random rd = new Random();
        random = rd.nextInt(101);
    }

    public void takeuserinput() {
        guess = sc.nextInt();
    }

    public boolean ismatach() {
        while (guess != random) {
            if (guess > random) {
                System.out.println("You choosed Larger Number.");
            } else {
                System.out.println("You choosed Smaller Number.");
            }
            noOfguess++;
            takeuserinput();
        }
        if (guess == random) {
            System.out.println("You Win!!!");
            System.out.println("No of guess: " + (noOfguess + 1));
            return true;
        }
        return false;
    }

}

public class class_guess_the_number_game {
    public static void main(String[] args) {
        GuessGame obj = new GuessGame();
        obj.ismatach();
    }
}