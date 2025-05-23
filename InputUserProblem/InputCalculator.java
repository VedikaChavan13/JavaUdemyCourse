//Write a method called inputThenPrintSumAverage that does not have any parameters.
//The method should not return anything (void) and it needs to keep reading int numbers from the keyboard
//When the users enters something that is not an int then it needs to print a message in the format " SUM = XX AVG = YY".
//XX represents the sum of all the entered numbers of type int
//YY represents the calculated average of all numbers of type long.
/*EXAMPLES OF INPUT/OUTPUT:

EXAMPLE 1:

INPUT:

1
2
3
4
5
a
OUTPUT

SUM = 15 AVG = 3

EXAMPLE 2:

INPUT:

hello

OUTPUT:

SUM = 0 AVG = 0

TIP: Use Scanner to read an input from the user.

TIP: Use casting when calling the round method since it needs double as a parameter.

NOTE: Use the method Math.round to round the calculated average (double). The method round returns long.

NOTE: Be mindful of spaces in the printed message.

NOTE: Be mindful of users who may type an invalid input right away (see example above).

NOTE: The method inputThenPrintSumAndAverage should be defined as public static like we have been doing so far in the course.

NOTE: Do not add the main method to the solution code.
 */


 import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {
        int sum = 0;
        int count = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                sum += number;
                count++;
            } else {
                break; // Exit loop when non-integer input is encountered
            }
        }
        scanner.close(); // Close scanner to prevent resource leaks

        long average = (count > 0) ? Math.round((double) sum / count) : 0;
        System.out.println("SUM = " + sum + " AVG = " + average);
    }

    // Main method to test the function
    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }
}
