//Write a method isLeapYear with a parameter of type int named year.
//The parameter needs to be greater than or equal to 1 and less than or equal to 9999.
//If the parameter is not in that range return false.
//Otherwise, if its in the valid range, calculate if the year is a leap year and return true if it is, otherwise return false
//A year is a leap year if it is divisible by 4 but not by 100, or it is divisble by 400.
//Write another method getDayInMonth with two parameters month and year. Both of type int.
//If parameter month is <1 or >12 return -1.
//If parameter year is <1 or >12 return -1.
//If parameter year is <1 or >9999 then return -1
//This method needs to return the number of days in the month. Be careful about leap years they have 29 days in month 2 (February).
//You should check if the year is a leap year using the method isLeapYear described above.



public class NumberOfDaysInMonth {
    
    public static void main(String[] args) {
        

        System.out.println(isLeapYear(2024));
        System.out.println(getDaysInMonth(2, 2024));
    }
    public static boolean isLeapYear(int year){
        if(year>=1 && year<=9999){
          if(year%4==0){
             if(year%100==0){
                 if(year%400==0){
                  return true;
                 }
                 else{
                 return false;
                 }
          }return true;
        } return false;
        
     }
     return false;
 }
    public static int getDaysInMonth(int month, int year){

        if(month<1 || month>12||year<1 ||year>9999){
            return -1;
        }

        switch (month){ 
        case 1:
        case 3:
        case 5:
        case 7:
        case 8:
        case 10:
        case 12:
         return 31;

        case 4:
        case 6:
        case 9:
        case 11:
         return 30;

        case 2:
         return isLeapYear(year)?29:28; 
        
        default:
         return -1;
        }

    
    } 
    
}
