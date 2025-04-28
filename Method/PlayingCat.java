//The cats spend most of the day playing.In particular, they play if the temperature is between 25 and 35(inclusive). Unless it is summer, then the upeer limit is 45(inclusive) instead of 35.
//Write a method isCatplaying that has 2 parameters. Method needs to return true if the cat is playing, otherwise return false
//1st parameter should be of type boolean and be named summer it represents if it is summer.
//2nd parameter represents the temperature and is of type int with the name temperature.



public class PlayingCat {

    public static void main(String[] args) {
        // Example calls
     System.out.println(isCatPlaying(true, 10));  // Output: false
     System.out.println(isCatPlaying(false, 36)); // Output: false
     System.out.println(isCatPlaying(false, 35)); // Output: true

    }

    public static boolean isCatPlaying(boolean summer, int temperature) {
        // If it is summer, the valid range is 25 to 45
        if (summer) {
            return temperature >= 25 && temperature <= 45;
        }
        // If it is not summer, the valid range is 25 to 35
        return temperature >= 25 && temperature <= 35;
    }
}






    
    

