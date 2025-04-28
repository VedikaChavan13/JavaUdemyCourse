//Write a method named sumFirstAndLastDigit with one parameter of type int called number.
//The method needs to find the first and the last digit of the parameter number passed to the method, using a loop and return the sum of the first and the last digit to that number.
//If the number is negative then method needs to return -1 indicate an invalid value.






public class FirstAndLastDigitSum {

    public static void main(String[] args) {
        System.out.println(sumFirstAndLastDigit(123));
        System.out.println(sumFirstAndLastDigit(10));
        System.out.println(sumFirstAndLastDigit(-123));
        System.out.println(sumFirstAndLastDigit(2));

    }

    public static int sumFirstAndLastDigit(int number){
        
        if(number<0){
            return -1;
        }
        int lastNumber= number%10;
        int firstNumber= number;
        while ((firstNumber>=10)) {
            firstNumber=firstNumber/10;
            
        }
        return firstNumber+lastNumber;


        


    }
    
}
