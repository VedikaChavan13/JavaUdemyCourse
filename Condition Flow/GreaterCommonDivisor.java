//Write a method getGreaterCommonDivisor with two parameters of type int named first and second 
//If one of the parameters is <10, the method should return -1 to include an invalid value.
//The method should return the greatest common divisor of the two number(int).
//The greater common divisor is the largest positive integer that can fully divide each of the integers(i.e without leaving a remainder)
//For example 12 and 30
//12 can be divided by 1, 2, 3, 4, 6, 12
//30 can be divided by 1, 2, 3, 5, 6, 10, 15, 30
//The greatest common divisor is 6 since both 12 and 30 can be divided by 6, and there is no resulting remainder.


public class GreaterCommonDivisor {

    public static void main(String[] args) {
        getGreatestCommonDivisor(50, 60);
    }

    
    public static int getGreatestCommonDivisor(int first, int second){
            if(first<10|| second<10){
                return -1;
            }
    
            int g = 0;
            for(int i=1; i<=first;i++){
                if(first%i==0&& second%i==0){
                    g=i;
                }
            
            
            }  return g;
        }
        
    }
    
    

