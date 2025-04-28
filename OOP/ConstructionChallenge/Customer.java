




public class Customer {
    /*1. Create a new class, named Customer, with three fields:
 * name
 * credit limit
 * email address
 * 2. Create the getter methods only for each field. You don't need to create the setters
 * 3. Create three constructors for this class:
 * First, create a constructor for all three fields which should assign the arguments directly to the instance fields
 * Second, create a no-args constructor that calls another constructor, passing some literal values for each argument
 * And lastly, create a constructor with just the name and email parameters, which also calls another constructor
 */







    private String name;
    private double creditLimit;
    private String emailAddress;

    //3 constructor

    //no arg 
    public Customer(){
        this("vedika", "vedika@gmail.com");
    }
    //assign argument to instance field
    public Customer(String name, double creditLimit, String emailAddress){
        this.name=name;
        this.creditLimit=creditLimit;
        this.emailAddress=emailAddress;
    }
    public Customer(String name, String emailAddress){

        this(name, 1000, emailAddress);

    }






    //Getter
    public String getName(){
        return name;
    }

    public double getCreditLimit(){
        return creditLimit;
    }

    public String getEmailAddress(){
        return emailAddress;
    }




    
}
    

