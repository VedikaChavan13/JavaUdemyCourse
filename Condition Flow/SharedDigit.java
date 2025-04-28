//Write a method named hasSharedDigit wiht two parameters of type int.
//Each number should be within the range of 10 and 99 inclusive . if one of the number is not with the range, the method should return false.
//The method should return true if there is a digit that appears in both numbers, such as 2 in 12 and 23; otherwise, the method should return false.






public class SharedDigit {
    public static void main(String[] args) {
      System.out.println(hasSharedDigit(12, 23));  
      System.out.println(hasSharedDigit(-12, 23)); 
      System.out.println(hasSharedDigit(43, 56)); 
      System.out.println(hasSharedDigit(9, 11));
    }
    public static boolean hasSharedDigit(int num1, int num2){
       if ((num1<10||num1>99) || (num2<10||num2>99)) {
            return false;
        }
        int firstDigitNum1 = num1 / 10;
        int secondDigitNum1 = num1 % 10;
        int firstDigitNum2 = num2 / 10;
        int secondDigitNum2 = num2 % 10;

       return ((firstDigitNum1 == firstDigitNum2)||(firstDigitNum1 ==secondDigitNum2) ||(secondDigitNum1==firstDigitNum2)||(secondDigitNum1==secondDigitNum2));




    }
}
