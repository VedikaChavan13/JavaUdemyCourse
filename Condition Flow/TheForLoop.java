public class TheForLoop {
    public static void main(String[] args) {
        
        for(int counter= 1; counter<= 5; counter ++){
            System.out.println(counter);
        }

        for(double rate=2.0; rate<=6.0; rate++){
            double interestAmount= calculateInterest(10000, rate);
            System.out.println("10000 at "+rate+" of interest = "+interestAmount );
        }

        for(double newRate=7.5; newRate<=10.0; newRate+=0.25 ){
            double interestNewAmount= calculateNewInterest(100.00 ,newRate);
            System.out.println("100 at "+ newRate+" of interest = "+interestNewAmount);


        }
    }

    public static double calculateInterest( double amount, double interestRate){


        return amount*(interestRate/100);
    }


    //Using a new for statement, call the calculateNewInterest method with the dollar amount of 100.
    //Amd this time, use the interest rates between 7.5 and 20, but incrememt by a quater of persecnt each time, meaning 0.25 percent.
    //And print the results to the console window
    

    public static double calculateNewInterest(double amountNew,double interestNewRate){

        return amountNew* (interestNewRate/100);
    }
}
