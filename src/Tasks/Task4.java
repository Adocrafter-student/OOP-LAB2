package Tasks;
import java.util.Scanner;
public class Task4 {

    public static void main (String[] args) {
        System.out.println("Hello");
        print_range_numgers();
    }

    public static void print_range_numgers () {
        System.out.print("First: ");
        Scanner reader = new Scanner(System.in);
        int num = Integer.parseInt(reader.nextLine());
        System.out.print("Second: ");
        int num2 = Integer.parseInt(reader.nextLine());
        for (int i = num; i <= num2; i++) {
            System.out.println(i);
        }
    }
}
