import java.util.Random;
import java.util.Scanner;

public class GameRound {

    private final int lowerBound;     //Lower bound for the range for guessing number
    private final int upperBound;     //Upper bound for the range for guessing number
    private final int maxAttempts;    // Maximum attempt allowed per round
    private final int targetNumber;   //Target number to guess which is generated randomly

    // Creating constructor to initialize the range, attempts and generate random target number
    public GameRound(int lowerBound, int upperBound, int maxAttempts)
    {
        this.lowerBound = lowerBound;
        this.upperBound = upperBound;
        this.maxAttempts = maxAttempts;
        this.targetNumber = generateRandomNumber();
    }
    //Creating method to generate random number within specified range
    private int generateRandomNumber(){
        Random random = new Random();
        return random.nextInt(upperBound-lowerBound+1)+lowerBound;
    }
    //Creating method to play a round of guessing game
    public void playRound(Scanner scanner, Score score){
        System.out.println("\nNew round!\nGuess the number between "+lowerBound+" and "+upperBound);
        int attempts=0;    // tracking the number of attempt

        // Loop for each attempt until user reached max attempt
        while (attempts<maxAttempts){
            System.out.print("Attempt " + (attempts + 1) + "/" + maxAttempts + ". Enter your guess: ");
            int guess = Integer.parseInt(scanner.nextLine());  // to get the user guess number
            attempts++;

            // Give feedback according to their guess
            if (guess<targetNumber){
                System.out.println("You guessed too low!!");
            } else if (guess>targetNumber) {
                System.out.println("You guessed too high!!");
            }else {
                System.out.println("Congratulation!! You guessed correct number....");

                //Update score based on attempt left
                score.updateScore(maxAttempts-attempts+1);
                //Increment the rounds won
                score.incrementRoundsWon();
                return;   // Exit the round after a correct guess
            }
        }
        //If user failed to get correct number, tell the user the correct number
        System.out.println("You Failed!!\nOut of the attempts!!\nThe correct number was "+targetNumber+".");
    }
}