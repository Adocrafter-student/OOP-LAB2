package Tasks;

import java.util.Scanner;

public class Task8 {
    public static void main (String[] args) {
        System.out.println("Hello");
        drawStarsPyramid(5);
        drawReverseStarsPyramid(5);
    }

    public static void  drawStarsPyramid (int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void  drawReverseStarsPyramid (int n) {
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
