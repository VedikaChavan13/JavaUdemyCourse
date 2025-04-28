//Write a method called isOdd with an int parameter and call it number.
//This method return a boolean
//Check that number is >0, if not return false.
//If number is odd return true, otherwise return false.
//Write a secomd method called sumOdd that has 2 int parameters start and end, which represent a range of numbers
//The method should use a for loop to sum all odd numbers in that range including the end and return the sum.
//It should call the method isOdd  to check if each number is odd.
///The parameter end needs to be greater than or equal to start and both starrt and end parameters have to be greater than 0
//If those conditons are satisfied return -1 from the method to indicate invalid input.









public class SumOdd {

    public static void main(String[] args) {
        System.out.println(isOdd(3)); // true
        System.out.println(sumOdd(1, 10)); // 25 (1 + 3 + 5 + 7 + 9)
        System.out.println(sumOdd(10, 5)); // -1 (invalid input)
    
        
    }
    public static boolean isOdd(int number){
        if(number<0){
            return false;
        }
        return (number%2!=0);

    }
    public static int sumOdd(int start, int end){
        if (start>end||start<=0||end<=0){
            return -1;

        }

        int totalOddSum=0;

        for(int i= start; i<=end;i++){
          if(isOdd(i)){
            totalOddSum+=i;
          }
        }
        return totalOddSum;
    }
}
