package KeywordsAndExpressions;

public class MainChallenge {

    public static void main(String[] args) {

        int highScore= calculateScore(true,900,5,100);
        System.out.println("The high score is"+ highScore);


        System.out.println( "The score is "+ calculateScore(true, 10000,8, 200));
        //This means that i want the code to jump to this method, calculate score in this case and execute the statements in the method body.And once you get to the end of the method's code, come back where you left off, then continue on processing from here.
        
    }
    
    public static int calculateScore(boolean gameOver, int score, int gameLevel,int bonus){
        
        int finalScore=score;

        if(gameOver){
           finalScore+=(gameLevel*bonus);
           finalScore+=1000;
        }
        return finalScore;

    }
}

