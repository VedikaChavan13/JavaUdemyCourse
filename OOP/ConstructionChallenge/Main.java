public class Main {
    public static void main(String[] args) {
            Customer customer=new Customer("Tim", 1000, "tiM@gamail.com");
            System.out.println(customer.getName());
            System.out.println(customer.getCreditLimit());
            System.out.println(customer.getEmailAddress());
            
            Customer secondCustomer = new Customer();
            System.out.println(secondCustomer.getName());
            System.out.println(secondCustomer.getEmailAddress());
            System.out.println(secondCustomer.getCreditLimit());
            
        }
        
    
    
}
