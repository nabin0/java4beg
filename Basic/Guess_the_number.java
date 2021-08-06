import java.util.Random;
import java.util.Scanner;

public class Guess_the_number {
    public static void main(String[] args) {

        Random rd = new Random();
        Scanner sc = new Scanner(System.in);

        int compGuess = rd.nextInt(100);
        int noOfguess = 1;

        // Guess number btn 0 to 100
        System.out.println("Enter Your guess.");
        int userInp = sc.nextInt();

        while (noOfguess < 5) {
            
            if (userInp == compGuess) {
                System.out.println("You Won !!!");
                System.out.println("Your Total guess : " + noOfguess);
                break;
            } else if (userInp < compGuess) {
                System.out.println("Your guess s low.");
            } else {
                System.out.println("Your guess is high.");
            }
            userInp = sc.nextInt();
            noOfguess++;

        }
    }
}