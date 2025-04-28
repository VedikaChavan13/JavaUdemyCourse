import java.util.Scanner;


public class ReadingUserInput {

    public static void main(String[] args) {
       /* String currentYear = "2022";
       int currentYear=2022;
        String userDateOfBirth ="1999";

        int dataOfBirth = Integer.parseInt(userDateOfBirth); 
        System.out.println("Age= "+(currentYear+ dataOfBirth));

        //String doesnot do actually addition and substraction 
        //It will only add two strings in one , here it will be 20221999 not 4021
        //This means concatenation

        */

        //Scanner Class

        int currentYear = 2022;

        try{

        System.out.println(getInputFromConsole(currentYear));
        }catch(NullPointerException e){
            System.out.println(getInputFromScanner(currentYear));
        }
    }

   public static String getInputFromConsole(int currentYear){

        String name= System.console().readLine("Hi, What's your Name ");
        System.out.println("Hi " + name + ",Thanks for taking the course!");

        String dateOfBirth = System.console().readLine("What year were you born ");
        int age = currentYear - Integer.parseInt(dateOfBirth);

        return "So you are "+ age + "year old";



        
    } 
    public static String getInputFromScanner(int currentYear){
        return "";

    }
    
}
