package Tasks;
import java.util.Scanner;

public class Task3 {
    public static void main (String[] args) {
        System.out.println("Hello");
        total_sum();
    }
    public static void total_sum () {
        System.out.println("Enter number to calculate their sum. Enter 0 to stop");
        Scanner reader = new Scanner(System.in);
        int read = Integer.parseInt(reader.nextLine());
        int sum = 0;
        while (true) {
            if (read == 0) {
                break;
            }
            sum += read;
            System.out.println("Sum now: " + sum);
            read = Integer.parseInt(reader.nextLine());
        }
        System.out.println("Sum in the end: " + sum);
    }

}
