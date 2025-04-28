public class LargestPrime {

    public static void main(String[] args) {

       System.out.println( getLargestPrime(21));
        
    }

    public static int getLargestPrime(int number){
        
        if(number<2){
            return -1;
        }

        for(int i=number; i>=2;i--){

            if(number%i==0){
                boolean isPrime= true;

                for(int j=2; j<=i/2; j++){
                    if(i%j==0){
                        isPrime=false;
                        break;
                    }
                

                }

                if(isPrime){
                    return i;
                }
            }
             
        
            

        }
        
    
    return -1;

    }

}

       
          
       

       



        


    
    

