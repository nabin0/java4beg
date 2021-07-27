import java.util.Scanner;

public class sum_of_n_even {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int i =1;
        int sum = 0;

        while(i<=n){
            sum += i;
            i++;
        }

        System.out.println("The sum is: " + sum);
        sc.close();
    }
}