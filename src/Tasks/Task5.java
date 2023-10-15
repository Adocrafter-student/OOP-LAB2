package Tasks;

import java.util.Scanner;

public class Task5 {
    public static void main (String[] args) {
        System.out.println("Hello");
        sum_of_2_power();
    }

    public static void  sum_of_2_power () {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type a number: ");
        int n = Integer.parseInt(reader.nextLine());
        int sum = 0;
        double sum_neg = 0;
        if (n >= 0) {
            for (int i = 0; i<=n; i++) {
                sum += (int)Math.pow(2,i);
            }
            System.out.print("The result is: " + sum);
        }
        else {
            for (int i = n; i <= 0; i++) {
                sum_neg += Math.pow(2, i);
            }
            System.out.print("The result is: " + sum_neg);
        }
    }
}
