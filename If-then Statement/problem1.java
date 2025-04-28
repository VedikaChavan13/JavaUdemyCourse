public class problem1 {
    public static void main(String[] args) {
        
        //step1: Create a double variable with a value of 20.00

        double myFirstVar = 20.00d;

        //step2: create a second variable of type double with a value 80.00
        double mySecondVar= 80.00d;

        //step3: add both number together and multiply by 100.00

        double myTotalVar= (myFirstVar+ mySecondVar)*100.00d;
        System.out.println("My total is "+ myTotalVar);

        //step4: use the remainder operator, to figure out what the remainder from the result of the operation in step three, and 40.00, will be.

        double myRemainderVar= myTotalVar%40.00d;
        System.out.println("Remainder value is "+ myRemainderVar);

        boolean isNoRemainder=(myRemainderVar==0)? true:false;
        System.out.println("No Remainder= "+isNoRemainder);
        if(!isNoRemainder){
            System.out.println("Got some remainder");
        }



    }
}
