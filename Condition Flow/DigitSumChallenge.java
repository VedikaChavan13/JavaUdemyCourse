//In this challenge, your task is to write a method with the name sumDigits that has single parameter named number, of tyoe int and it shoild return an int.
//The method should only take a number that is a positive number.
//If the negative number is passed, it should return -1, meaning, an invalid value  was passed.
//The method should parse out each digit from the number and sum the digitd up
//So, if the value passed to the method, the should should sum digit, in this case, 1+2+4, and return 8, as a value.
//And another example, if the value is 1000, the code should sum digit,1+0+0+0, and return 1 as a value.
//If the number is a single digit number , simply return the number itself as the result.









public class DigitSumChallenge {

    public static void main(String[] args) {
        System.out.println("the sum of digits in number 1234 is "+sumDigits(1234));
        System.out.println("the sum of digits in number 1234 is "+sumDigits(10));
        System.out.println("the sum of digits in number 1234 is "+sumDigits(-123));
        System.out.println("the sum of digits in number 1234 is "+sumDigits(44));
    }
    public static int sumDigits(int number) {
        


        if(number<0){
            return -1;
        }

        int sum =0;
        while (number>9) {
            sum+=(number%10);
            number=number/10;
            
        }
        sum+=number;
        return sum;

    }
}
