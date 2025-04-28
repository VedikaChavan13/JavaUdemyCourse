//Write a method named canPack with three parameters of int named bigCount, smallCount and goal
//The parameter bigCount represents the count of big flour (5 kilos each)
//The parameter smallCount represents the count of small flour bags (1 kilo each)
//The parameter goal represents the goal amount of kilos of flour needed to assemble a package.
//Therefore the sum of the kilos of BigCount and smallCount must be atleast equal to the value of goal.
//The method should return true if it is possible to make a package with goal kilos of flour
//f the sum is greater than goal, ensure that only full bags are used towards the goal amount. For example, if goal = 9, bigCount = 2, and smallCount = 0, the method should return false since each big bag is 5 kilos and cannot be divided. However, if goal = 9, bigCount = 1, and smallCount = 5, the method should return true because of 1 full bigCount bag and 4 full smallCount bags equal goal, and it's okay if there are additional bags left over.
//If any of the parameters are negative, return false.




public class FlourPackProblem {

    public static void main(String[] args) {

        
        
    }

    public static boolean canPack(int bigCount, int smallCount,int goal){
        if (bigCount<0 || smallCount<0 || goal<0 ){
            return false;
        }

       int Big_Weight = 5;
       int  totalBigWeight= bigCount* Big_Weight;

       if(totalBigWeight>= goal){
          int remainingWeight=goal%Big_Weight;
          
          return smallCount>= remainingWeight;
          
       }

       int remainingWeight= goal-totalBigWeight;
       if(smallCount>=remainingWeight){

         return true;

       }
     
       

       int Small_Weight= 1;
       if(remainingWeight%Small_Weight==0){
        return true;
       }

       return false;

    }

    
}
