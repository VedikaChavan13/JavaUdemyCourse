//Step1: we have to create a method with name toMilesPerHour which return true long
//with parameter toKilometersPerHour with type double
//This method will return -1 if kilometersPerHour is <0
//Else it will return round value.
//End

//Step 2:
//Amother method printConversion with 1 parameter of tyoe double with name kilometersPerHour
//This method doesnot return anything 
//It just need to calculate milesPerHour from the kilometersPerHour
//and Print "XX km/h= YY mi/h"
//If the parameter kilometersPerHour is <0 then print the text "Invalid Value"






public class SpeedConverter {
    public static long toMilesPerHour(double kilometersPerHour){
        if(kilometersPerHour<0){
            return -1;
        }
        return Math.round(kilometersPerHour / 1.609);
    }

    public static void printConversion(double kilometersPerHour){

            if(kilometersPerHour<0){
                System.out.println("Invalid Value");
            }else{
                long milesPerHour= toMilesPerHour(kilometersPerHour);
                System.out.println(kilometersPerHour+" km/h = " + milesPerHour+" mi/h"); 
                }

    }
    

}
