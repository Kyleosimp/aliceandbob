import java.util.Scanner;

public class aliceandbob {
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        String alice = "Alice";
        String bob = "Bob";
        boolean correctName = false;


        while (correctName == false) {
            System.out.println("Type in Username: ");
            String name = userIn.next();
            if (alice.equalsIgnoreCase(name)) {
                System.out.println("Welcome, Alice.");
                break;
            }
            if (bob.equalsIgnoreCase(name)) {
                System.out.println("Welcome, Bob.");
                break;
            } else {
                System.out.println("Skiddaddle on out, Try again.");
            }
        }
    }
}

