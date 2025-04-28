//In this challenge, you'll read 5 valid numbers from the console entered by the user and print the sum if those five numbers 
//By valid numbers, I mean you need to check that the numbers entered are valid integers
//If they are not, print out the message "Invalid Number" to the console, but continue looping until you do have 5 valid numbers.
//Before the user enters each number, prompt them with the message,"Enter number #x: ", where x represents the count 1, 2, 3, etc.
//As an example, the first message would look something like,"Enter Number #1: ", the next, "Enter Number #2", and so on.




import java.util.Scanner;

public class ReadingUserInputChallenge {

    public static void main(String[] args) {
        
    
        Scanner scanner= new Scanner(System.in);
        
        int counter=1;
        int sum= 0;
        while(counter<=5){
            System.out.println("Enter Number#" + counter+ ":");
            String nextNumber =scanner.nextLine();
            try{
                int number= Integer.parseInt(nextNumber);
                counter ++;
                sum+=number;

            }catch(NumberFormatException badNumber){
                System.out.println("Invalid Number");
            }
        }
        System.out.println("Sum of the 5 Numbers = "+sum);

    }

    
}
