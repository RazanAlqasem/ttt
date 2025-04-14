import java.util.Scanner;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int secretNumber = rand.nextInt(100) + 1; // رقم بين 1 و 100
        int guess;
        int attempts = 0;

        System.out.println("مرحباً! حاول تخمين الرقم بين 1 و 100");

        do {
            System.out.print("ادخل رقمك: ");
            guess = input.nextInt();
            attempts++;

            if (guess < secretNumber) {
                System.out.println("أعلى!");
            } else if (guess > secretNumber) {
                System.out.println("أقل!");
            } else {
                System.out.println("🎉 مبروك! خمنت الرقم بعد " + attempts + " محاولة.");
            }
        } while (guess != secretNumber);

        input.close();
    }
}
