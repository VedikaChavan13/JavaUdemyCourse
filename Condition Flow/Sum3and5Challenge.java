//Create a for loop using range of numbers from 1 to 1000 inclusive.
//Sum all the numbers that can be divided by both 3 and 5.
//Print out the numbers that have met the above conditions.
//Break out of the loop once you have found 5 numbers that met the conditions above
//After breaking out of the loop, print the sum of the numbers that met the condtions above.
//Note : type all code in the main method.


public class Sum3and5Challenge {

    public static void main(String[] args) {
        
        int countOfMatches=0;
        int sumOfMatches=0;

        for(int i =1; i<= 1000;i++){
            if(i%3==0 && i%5==0){
                countOfMatches++;
                sumOfMatches +=i;
                System.out.println("Found a match "+ i);
            }
            if (countOfMatches==5) {
                break;
            }
        }
        System.out.println("Sum = "+ sumOfMatches);
    }
    
}
