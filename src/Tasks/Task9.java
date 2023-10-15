package Tasks;

public class Task9 {
    public static void main (String[] args) {
        System.out.println("Hello");
        drawNumbersPiramid(5);
        drawReverseNumbersPiramid(5);

        // for the output 1 22 333 4444 we should print is instead of js in our code
    }

    public static void  drawNumbersPiramid (int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((j+1) + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void  drawReverseNumbersPiramid (int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print((j+1) + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
