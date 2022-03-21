import java.util.Scanner;

public class Game
{
    public void start() {
        int randomNumber = (int) (Math.random() * 100) + 1;
        boolean won = false;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Try to guess a number between 1-100");

        for (int i = 10; i > 0; i--) {
            System.out.println("You have " + i + " guess(es) left. Choose a number:");
            int guess = scanner.nextInt();

            if (guess > randomNumber) {
                System.out.println("It's smaller than " + guess);
            } else if (guess < randomNumber) {
                System.out.println("It's greater than " + guess);
            } else {
                won = true;
                break;
            }
        }

        if (won) {
            System.out.println("You WIN");
        } else {
            System.out.println("You LOSE, correct number was " + randomNumber);
        }
    }
}
