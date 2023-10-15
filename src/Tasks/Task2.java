package Tasks;

import java.util.Scanner;

public class Task2 {
    public static void main (String[] args) {
        sum_of_3_numbers();
    }

    public static void sum_of_3_numbers () {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Type the " + (i+1) + ". number");
            int read = Integer.parseInt(reader.nextLine());
            sum += read;
        }
        System.out.println("Sum:" + sum);
    }
}
