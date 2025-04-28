public class example{
    public static void main(String[]args){

        boolean isAlien = false;
        if(isAlien==false){
            System.out.println("It is not alien");
            System.out.println("Hello Vedika");
        }
        

        int topScore = 80;
        if(topScore< 100){
            System.out.println("You got the high score!");
        }
        
        int secondScore = 70;
        // AND operator
        if((topScore > secondScore) && (topScore< 100)){
            System.out.println("Greater than second top score and less than 100");

        }

        // OR operator 
        if(topScore> 90 || secondScore<=90){
            System.out.println("Either or both of the conditions are true");
        }    
        
        boolean isCar= true;
        if(!isCar){
            System.out.println("This is not supposed to happen");
        }    
        
       //Ternary operator?:

       int ageOfClient= 11;
       String ageText= (ageOfClient >= 18)? "Over Eighteen": "Still a kid";
       System.out.println("Our client age is "+ ageText);


    }
       
}