//We have a dog that likes to bark.  We need to wake up if the dog is barking at night!
//Write a method shouldWakeUp that has 2 parameters.
//1st parameter should be of type boolean and be named barking it represents if our dog is currently barking
//2nd parameter represents the hour of the day and is of type int with the name hourOfDay and has a valid range of 0-23.
//We have to wake up if the dog is barking before 8 or after 22 hours so in that case return true.
//In all other cases return false.
//If the hourOfDay parameter is less than 0 or greater than 23 return false.



public class BarkingDog {

    public static void main(String[] args) {
        // Test cases
        System.out.println(BarkingDog.shouldWakeUp(true, 6));   // true
        System.out.println(BarkingDog.shouldWakeUp(false, 6));  // false
        System.out.println(BarkingDog.shouldWakeUp(true, 23));  // true
        System.out.println(BarkingDog.shouldWakeUp(false, 23)); // false
        System.out.println(BarkingDog.shouldWakeUp(true, -1));  // false
        System.out.println(BarkingDog.shouldWakeUp(true, 24));  // false
    }


    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        if (hourOfDay < 0 || hourOfDay > 23) { // Check for invalid hours
            return false;
        }

        if (barking && (hourOfDay < 8 || hourOfDay > 22)) { // Check if barking and within quiet hours
            return true;
        }

        return false; // Default: Do not wake up
    }
}

