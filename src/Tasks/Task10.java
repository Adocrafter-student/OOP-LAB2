package Tasks;
import java.util.Scanner;
import java.util.Random;
public class Task10 {

    public static void main (String[] args) {
        System.out.println("Hello");
        guessingGame();
    }

    public static int drawNumber() {
        Random rand = new Random();
        return rand.nextInt(101);
    }

    public static void guessingGame() {
        int rand_num = drawNumber();
        System.out.print("Guess a number: ");
        Scanner reader = new Scanner(System.in);
        int guess_num = Integer.parseInt(reader.nextLine());
        int counter = 1;
        while (guess_num != rand_num) {
            if (guess_num > rand_num) {
                System.out.println("The number is lesser, guesses made: " + counter);
                counter ++;
            }
            else {
                System.out.println("The number is greater, guesses made: " + counter);
                counter ++;
            }
            guess_num = Integer.parseInt(reader.nextLine());
        }
        System.out.println("Congratulations, your guess is correct");
    }
}
