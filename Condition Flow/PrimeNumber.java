public class PrimeNumber {
    public static void main(String[] args) {

    //Create a prime number counter variable, that will keep count of how many prime numbers were found
    //Create a for statement, using any range of numbers, where the maximum number is <=1000
    // For each number in the range:
    //Check to see if it's a prime number using the isPrime method.
    //If the number is prime, print it out and increment the prime number counter variable.
    //Once the prime number counter equals three, exit the loop (Hint, use the break statement to exist).
      
      int count=0;
      for(int i =10; i<=50; i++){
        if(isPrime(i)){
            System.out.println("Number "+ i + " is a prime number");
            count ++;
            if (count==3){
                System.out.println("Found 3 - Exiting from loop ");
                break;
            }
        }
        
      }
      //System.out.println("Total number of prime number between 10 and 50 is "+ count);

       /*  System.out.println("0 is " + (isPrime(0)? "":"Not")+ " a prime number");
        System.out.println("1 is " + (isPrime(1)? "":"Not")+ " a prime number");
        System.out.println("2 is " + (isPrime(2)? "":"Not")+ " a prime number");
        System.out.println("3 is " + (isPrime(3)? "":"Not")+ " a prime number");
        System.out.println("4 is " + (isPrime(4)? "":"Not")+ " a prime number");
        System.out.println("8 is " + (isPrime(8)? " ":"Not")+ " a prime number"); */







    }




    public static boolean isPrime(int wholeNumber){

       if(wholeNumber<=2){
         return (wholeNumber==2);
       }

       for(int divisor=2; divisor<=wholeNumber/2; divisor++){
         if(wholeNumber% divisor==0)
         return false;
       }


        return true;
    }


    

}
