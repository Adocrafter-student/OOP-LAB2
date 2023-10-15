package Tasks;
import java.util.Scanner;
public class Task6 {
    public static void main (String[] args) {
        System.out.print("How many times do you want to print text? ");
        Scanner reader = new Scanner(System.in);
        int num = Integer.parseInt(reader.nextLine());
        for (int i =0; i < num; i++) {
            printText();
        }
    }

    public static void  printText() {
        System.out.println("In the beginning there were the swap, the hoe and the Java");
    }
}
