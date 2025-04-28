//Create two mwthods with the same name: convertToCentimeters.
//The first method has one parameter of type int, which represents the entire height in inches.You'll convert inches to centimeters, as a double.
//The secomd method has two parameters of type int, one to represent height in feet, and one to represent the remaining height in inches. So if a person is 5 foot, 8 inches, the values 5 for feet and 8 for inches would be passed to this method. This method will convert feet snd inches to just inches, then call the first method, to get the number of centimeters, also returning the value as a double.

public class MethodOverloadChallenge {

    public static void main(String[] args) {
        System.out.println("5ft,8in =" + convertToCentimeters(5,8)+ "cm");
        System.out.println("68in = "+ convertToCentimeters(68)+ "cm");
    }
    
    public static double convertToCentimeters(int inches){
        
        return inches*2.54;
    }

    public static double convertToCentimeters( int feet, int inches){
       return ((feet*12)+ inches)*2.54;
    }


}
