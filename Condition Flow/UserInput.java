import java.util.Scanner;  // Import Scanner

public class UserInput {  // Renamed class

    public static void main(String[] args) {
        System.out.println(getInputFromScanner(2025));
    }

    public static String getInputFromScanner(int currentYear) {
        Scanner scanner = new Scanner(System.in);  // No conflict now

        System.out.println("Hi, What's your Name? ");
        String name = scanner.nextLine();

        System.out.println("Hi " + name + ", Thanks for taking the course!");

        System.out.println("What year were you born? ");

        boolean validDOB = false;
        int age = 0;

        do{
            System.out.println("Enter a year of birth>= "+ (currentYear-125)+ " and <= "+ (currentYear));


          try{
           age = checkData(currentYear, scanner.nextLine());
           validDOB = age<0?false:true;
          }catch(NumberFormatException basUserData){
            System.out.println("Characters not allowed!! Try Again");
          }

        } while (!validDOB);

         // Close Scanner to avoid resource leaks

        return "So you are " + age + " years old";
    }

    public static int checkData(int currentYear, String dateOfBirth){
        int dob= Integer.parseInt(dateOfBirth);
        int minimumYear = currentYear - 125;

        if((dob<minimumYear)||(dob>currentYear)){
            return -1;
        }

        return (currentYear-dob);
    }
}
