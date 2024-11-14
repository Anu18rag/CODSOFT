public class Score {

    private int totalScore;   // Store total score of all round
    private int roundsWon;     // Store total number of round won

    // creating constructor to initialize score and round won
    public Score(){
        this.totalScore=0;
        this.roundsWon=0;
    }
    //creating method to update the score by adding points
    public void updateScore(int score){
        totalScore += score;
    }
    // creating method to increment the count of rounds won
    public void incrementRoundsWon(){
        roundsWon++;
    }
    //getter for total score
    public int getTotalScore(){
        return totalScore;
    }
    // getter for rounds won
    public  int getRoundWon(){
        return roundsWon;
    }
}
