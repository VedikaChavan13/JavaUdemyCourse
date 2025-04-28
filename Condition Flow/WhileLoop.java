public class WhileLoop {
    public static void main(String[] args) {
        /*for(int i=1; i<=5;i++){
            System.out.println(i);
        }
        int j=1;
        while (true) {
            if(j>5){
                break;
            }
            System.out.println(j);
            j++;
            
        }

        boolean isReady=false;
        int k=1;
        do {
            
    
            if(k>5){
                break;
            }
            System.out.println(k);
            k++;
            isReady=(k>0);
        }while(isReady);*/

        int number=0;
        while(number<50){
            number+=5;
            if(number%25==0){
                continue;
            }
            System.out.println(number+ "_");
        }
        




    }



}
