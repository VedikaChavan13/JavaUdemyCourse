//Create a method called printDayOfWeek, that takes an int parameter  called day, but doesnt return any values.
//Use the enhanced switch statement, to return the name of the day, based on the parameter passed to the switch statement, so that 0 will return "Sunday", 1 will return "Monday", and so on.
//Any number not between 0 and 6, shouldreturn "Invalid Day".
//Note that return here, means the value returned from the enhanced swtich statement.
//Use the enhanced switch statement as an expression, returning the result to a string named dayOfTheWeek
//Print both the day variable and the dayOfTheWeek variable
//In the main method, call this method for the values 0 through 7.
//Bonus: Create a second method called printWeekDay, that uses an if then else statement, instead of a switch, to produce the same output.





public class DayOfTheWeekChallenge {
    public static void main(String[] args) {
        printDayOfWeek(0);
        printDayOfWeek(1);
        printDayOfWeek(2);
        printDayOfWeek(3);
        printDayOfWeek(4);
        printDayOfWeek(5);
        printDayOfWeek(6);
        




       printWeekDay(0);
       printWeekDay(1);
       printWeekDay(2);
       printWeekDay(3);
       printWeekDay(4);
       printWeekDay(5);
       printWeekDay(6);

        
        
    }

    public static void printDayOfWeek(int day){

        String dayOfWeek=switch (day) {
            case 0 -> "Sunday";      
            case 1 ->"Monday";
            case 2 ->"Tuesday";   
            case 3 ->"Wednesday";     
            case 4 ->"Thursday";    
            case 5 ->"Friday";     
            case 6 ->"Saturday";
            default ->"Invalid Value";
            
        };

        System.out.println(day + " represents "+ dayOfWeek);
    }

    public static void printWeekDay(int day){

        String dayOfWeek= "Invalid Value";
        if(day==0){
         dayOfWeek= "Sunday";

        }else if ((day==1)) {
            dayOfWeek="Monday";
        }else if ((day==2)) {
            dayOfWeek="Tuesday";
        }else if ((day==3)) {
            dayOfWeek="Wednesday";
        }else if ((day==4)) {
            dayOfWeek="Thursday";
        }else if ((day==5)) {
            dayOfWeek="Friday";
        }else if ((day==6)) {
            dayOfWeek="Saturday";
        }

        System.out.println(day+" represemt "+ dayOfWeek);

    }
}
