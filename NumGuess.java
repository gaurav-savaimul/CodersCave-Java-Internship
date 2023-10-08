import java.util.Scanner;

public class NumGuess {

    public static void main(String[] args)
    {
        System.out.println("\t \t \t NUMBER GUESSSING GAME!!!  \n I'll pick a number between 1 and 100, and you will have to guess it within 5 attempts.");
        Scanner sc_1 = new Scanner(System.in);
        boolean againPlay;
        do {
            playGame();
            System.out.print("Would you like to play again?Y/N ");
            String againPlayInput = sc_1.next();
            againPlay=againPlayInput.equalsIgnoreCase("Y");
        } while (againPlay);
        System.out.println("\n Thanks for playing :) ");
    }

    static void playGame()
    {
        int generatedNumber;
        int userInput;
        int guessCounter;
        generatedNumber = (int)(100 * Math.random()) + 1;
        guessCounter = 0;
        System.out.println();
        System.out.print("What is your first guess?  ");
        Scanner sc= new Scanner(System.in);

        while (true) {
            userInput= sc.nextInt();
            guessCounter++;
            if (userInput == generatedNumber) {
                System.out.println("You got it in " + guessCounter + " attempts!  The number is " + generatedNumber);
                break;
            }
            if (guessCounter == 5) {
                System.out.println("\nYou could'nt guess the number in 5 attempts. \n");
                System.out.println("You lose.  My number was- " + generatedNumber);
                break;
            }
            if (userInput < generatedNumber)
                System.out.print("Your guess is too low.  Try again!  ");
            else if (userInput > generatedNumber)
                System.out.print("Your guess is too high.  Try again!   ");
        }
        System.out.println();
    }

} 