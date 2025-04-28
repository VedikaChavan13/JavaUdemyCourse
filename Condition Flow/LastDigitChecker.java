//Write a method named hasSameLastDigit with three parameters of type int.
//Each number shuld be within the range of 10-100 inclusive. If one of the number is not within the range the method should return false.
//The method should return true if atleast two of the numbers share the same rightmost digit; otherwisw, should return false.
//Example: 41,22,71 - should return true 
//Write another method named isvalid with one parameter of type int.
//The method needs to return true if the number parameter is in range of 10-1000 inclusive, otherwise return false





public class LastDigitChecker {
    public static void main(String[] args) {
        System.out.println(hasSameLastDigit(21, 22, 31));
        System.out.println(hasSameLastDigit(23, 32, 42));
        System.out.println(hasSameLastDigit(9, 999, 99));

        System.out.println(isValid(10));
        System.out.println(isValid(465));
        System.out.println(isValid(1051));
    }

    public static boolean hasSameLastDigit(int num1, int num2, int num3){
        if(num1<10||num1>1000||num2<10 ||num2>1000||num3<10||num3>1000){
            return false;
        }

        int x= num1%10;
        int y = num2%10;
        int z= num3%10;
        return ((x==y)||(x==z)||(y==z));

    }

    public static boolean isValid(int number){
        if(number<10||number>1000){
            return false;
        }return true;
    }
}
