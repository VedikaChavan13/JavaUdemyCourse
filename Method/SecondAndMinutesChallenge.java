// In this challenge, we're going to create a method, that takes time, represented in seconds, as the parameter.
//We'll then want to transform the seconds into hours.
//Next, you'll display the time in hours with remaining minutes and seconds in a string.
//We'll do this transformation in two steps, which allows us to use overlaoded methods.

//We want to create two methods with the same name: getDurationstring
//The first method has one parameter of type int, named seconds.
//The second method has two parameters,named minutes and seconds, both ints.
//Both methods return a String in the format shown:
// 'XXh YYm ZZs'
// where XX represents the number of hours, YY the number of minutes, and ZZ the number of seconds.
//The first method should in turn call the second method to return its result.
//Make both methods public and static as we've been doing so far in this course.
//Remember that one minute is 60 seconds, and one hour equals 60 minutes, or 3600 seconds.

//For the first method, the seconds paramter should ne >=o
//For the second method,the minutes parameter should be>=0, and the seconds parameter should be >=0, and <=59.
//If either method is passed an invalid value,print out some type of meaningful message to the user.



public class SecondAndMinutesChallenge {

    public static void main(String[] args) {
        System.out.println(getDurationString(-38000));
        System.out.println(getDurationString(800, 30));
    }

    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return "Invalid value";
        }

        int minutes = seconds / 60; // Convert seconds to minutes
        int remainingSeconds = seconds % 60; // Get the remaining seconds
        return getDurationString(minutes, remainingSeconds); // Call the overloaded method
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return "Invalid value";
        }

        int hours = minutes / 60; // Convert minutes to hours
        int remainingMinutes = minutes % 60; // Get the remaining minutes
        return hours + "h " + remainingMinutes + "m " + seconds + "s";
    }
}
