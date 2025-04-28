//Write a method called isPalindrome with one int parameter called number
//The method needs to return a boolean
//It should return true if the number is a palindrome number otherwise it should return false. 
//Tip: What is a Palindrome number?  A palindrome number is a number which when reversed is equal to the original number. For example: 121, 12321, 1001 etc.
//Tip: Logic to check a palindrome number
//Find the the reverse of the given number. Store it in some variable say reverse. Compare the number with reverse. 
//If both are the the same then the number is a palindrome otherwise it is not.
//Tip: Logic to reverse a number
//Declare and initialize another variable to store the reverse of a number, for example reverse = 0. 
//Extract the last digit of the given number by performing the modulo division (remainder). 
//Store the last digit to some variable say lastDigit = num % 10.
//Increase the place value of reverse by one.
//To increase place value multiply the reverse variable by 10 e.g. reverse = reverse * 10.
//Add lastDigit to reverse. 
//Since the last digit of the number is processed, remove the last digit of num. To remove the last digit divide number by 10. 
//Repeat steps until number is not equal to (or greater than) zero. 
//Since the last digit of the number is processed, remove the last digit of num. To remove the last digit divide number by 10. 
//Repeat steps until number is not equal to (or greater than) zero. 
//Tip: Be careful with negative numbers. They can also be palindrome numbers.
//Tip: Be careful with reversing a number, you will need a parameter for comparing a reversed number with the starting number (parameter).


public class NumberPalindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(1221));
        System.out.println(isPalindrome(1111));
        System.out.println(isPalindrome(2434));
        System.out.println(isPalindrome(-123));
        System.out.println(isPalindrome(-222));
    }
    public static boolean isPalindrome(int number){
        int lastDigit=0;
        int reverse=0;
        int originalNumber= number;

        while (number!=0) {
             lastDigit= number%10;
             reverse= reverse*10+lastDigit;
             number=number/10;
        }
        return (originalNumber==reverse|| originalNumber==-reverse);
        }
}

