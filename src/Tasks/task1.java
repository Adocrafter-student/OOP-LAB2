package Tasks;
import java.util.Scanner;

public class task1 {
    public static void main (String[] args) {
        secret_pwd();
    }

    public static void secret_pwd () {
        String pwd = "asfd";
        System.out.println("Hello!, Please enter your password");
        Scanner reader = new Scanner(System.in);
        while (true) {
            String pass = reader.nextLine();
            if (pass.equals("ramo")) {
                System.out.println("Congrats! your secret pwd is " + pwd);
                break;
            }
            System.out.println("Sorry, please type it again");
        }
    }
}


