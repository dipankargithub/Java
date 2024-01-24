import java.util.Random;
import java.util.Scanner;
public class Task1 {
    public static void main(String args[]) {

        int ans, guess, guessNum = 0;
        final int maxguesses = 5;
        String str, Pagain = "y";

        Scanner scanner = new Scanner(System.in);
        Random generator = new Random();

        ans = generator.nextInt(100) + 1;
        int counter = 0;

        while (Pagain.equals("y") || Pagain.equals("y")) {
            System.out.println("Hey you are welcome to the game :-  \nguess a number between 1 to 100 :- ");

            guess = scanner.nextInt();
            guessNum = 0;
            while (guess!=0) {
                guessNum++;
                if (guess == ans) {
                    System.out.println("Perfect You Are Right !!!");
                    System.out.println("Your Score : " + (100 * counter));
                    break;
                } else if (guess < ans) {
                    System.out.println("Oppsss!!! Your Guess Was Too Low , Try Some Higher Numbers.....");
                    counter++;
                }
                }
                if (guessNum == maxguesses) {
                    System.out.println("The Number Was :" + ans + "\nBetter Luck Next Time :");
                    break;
                }
                System.out.println("Enter Your guess [0 to Quit]:");
                guess = scanner.nextInt();
            }
        System.out.println("Thanks For Playing With Me !!!");
        System.out.println("See You again!!!!!!");
        }
    }
