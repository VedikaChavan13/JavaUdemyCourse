public class MethodOverloading {
    public static void main(String[] args) {

        int newScore= calculateScore("Vedika", 200);
        System.out.println("New score is "+ newScore);
        
        calculateScore();
        calculateScore(85);


    }
    public static int calculateScore(String playerName, int score){
        System.out.println(playerName+" has scored "+ score+ " points");
        return score*2000;
    }

    public static void calculateScore(){
        System.out.println("Zero score");
    }

    public static int calculateScore(int score){
        System.out.println("Unnamed person has scored "+score+ " points");
        return 0;
    }
}
