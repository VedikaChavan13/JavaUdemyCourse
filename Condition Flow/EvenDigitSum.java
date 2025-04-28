//Write a method named getEvenDigitSum with one parameter of type int caled number.
//The method should return the sum of the even digits within the number.
//If the number is negative, the method should return -1 to indicate an invalid value.
//Example getEvenDigitSum(123456789)- returns 20 since 2+4+6+8=20


//logic:
//We'll use remainder operator 
//check if number is even or not
// if even add it to sum variable 






public class EvenDigitSum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(1234567));
        System.out.println(getEvenDigitSum(-1234));
        System.out.println(getEvenDigitSum(9876));
        System.out.println(getEvenDigitSum(12));
    }

    public static int getEvenDigitSum(int number){

        if(number<0){
            return -1;
        }

        int remainder=0;
        int sum=0;
        while(number>0){
            remainder=number%10;
        
        if(remainder%2==0){
            sum+=remainder;
        }
        number/=10;
        }
        return sum;
    }
}
