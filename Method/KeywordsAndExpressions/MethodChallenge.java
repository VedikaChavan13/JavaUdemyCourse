//The first method should be named displayHighScorePosition
//This method should have player name and player position
//This method should have two parameters,one for a players name, and one for a players position in a high score list
//This method should print a message like "Tim managed to get into position 2 on the high score list"


//The second method should be named calculateHighScorePosition
//This method should have only one parameter, the player's score.
// This method should return a number between 1 and 4, based on the score values shown in this table.

// score                                                    result
// Score greater than or equal to 1000                         1
//Score greater than or equal to 500 but less than 10000       2
//Score greater than or equal to 100 but less than 500         3
//All other scores                                             4
//Finally, we'll call both methods and display the results for the following scores: 1500, 1000, 500, 100 and 25

package KeywordsAndExpressions;

public class MethodChallenge {
 public static void main(String[] args) {

    int highScore;
    
    highScore = calculateHighScorePosition(1500);
    displayHighScorePosition("Tim", highScore);

    highScore = calculateHighScorePosition(1000);
    displayHighScorePosition("Sam", highScore);

    highScore = calculateHighScorePosition(500);
    displayHighScorePosition("Vedika", highScore);

    highScore = calculateHighScorePosition(100);
    displayHighScorePosition("Sally", highScore);

    highScore = calculateHighScorePosition(25);
    displayHighScorePosition("Martha", highScore);


 } 



    public static void displayHighScorePosition(String playerName, int highScore){
        System.out.println(playerName + " manages to secure "+ highScore + " on the high score position list");
        
    }

   public static int calculateHighScorePosition(int playerScore){
    if(playerScore>= 1000){
        return 1;

    }else if ( playerScore>=500 && playerScore<1000){
        return 2;

    }else if (playerScore>=100 && playerScore<500){
        return 3;
    
    }else{
        return 4;
    }
   }


 }    


