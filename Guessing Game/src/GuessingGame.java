import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args)
    {
        // Creating Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Initialize Score object to keep track of round and total score
        Score score = new Score();
        boolean playAgain;

        //loop for multiples rounds
        do {
            //Initialize GameRound object with specified range and max attempt
            GameRound round=new GameRound(1,100,10);
            round.playRound(scanner,score);
            System.out.println("Do you want play again? (yes/no) : ");
            playAgain = scanner.nextLine().trim().equalsIgnoreCase("yes");
        }
        //Resume playing if user says yes
        while (playAgain);

        // Display total scorecard after games end
        System.out.println("\nGame Over!!...\nYou played total rounds\n"+score.getRoundWon()+" Rounds\nYou scored\n"+score.getTotalScore()+" points");
        scanner.close();
    }
}
