package Tasks;

public class Task7 {
    public static void main (String[] args) {
        printStars(5);
        printStars(3);
        printStars(9);
    }

    public static void printStars(int k) {
        for (int i = 0; i < k; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
