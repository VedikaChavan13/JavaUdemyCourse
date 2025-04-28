package KeywordsAndExpressions;

public class Main {
    public static void main(String[] args) {
       
        boolean gameOver = true;
        int score = 4000;
        int gameLevel = 5;

        if(score>5000){
            System.out.println("The score is greater than 5000");

        }else{
            System.out.println("It is less than 5000");
        }

        if(score<5000 && score>1000){
            System.out.println("Your score is less than 5000 and greater than 1000");

        }else if(score<1000){
            System.out.println("Your score is less than 1000");

        }else{
            System.out.println("Got here");
        }


    }
}
