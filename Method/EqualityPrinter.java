//Write a method printEqual with 3 parameters of type int. The method should not return anything (void)
//If one of the parameters is less that 0, print text"Invalid Value".
//If all numbers are equal print test "All numbers are equal"
//If all numbers are different print text"All numbers are different".
//Otherwise, print "Neither all are equal or different"

public class EqualityPrinter {

    public static void main(String[] args) {
        printEqual(1,1,1);
        printEqual(1, 1, 0);
        printEqual(-1, -1, -1);
        printEqual(1, 2, 3);
        
    }
    public static void printEqual(int x, int y, int z){
        if(x<0 || y<0 || z<0){
            System.out.println("Invalid Value");
        }else if (x==y && y==z){
            System.out.println("All numbers are equal");
        }else if (x!=y && y!=z && x!=z){
            System.out.println("All numbers are different");
        }else{
            System.out.println("Neither all are equal or different");
        }
    }
    
}
