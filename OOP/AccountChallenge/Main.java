public class Main {
    public static void main(String[] args) {
        //Account bobsAccount = new Account("12345", 500, "Bob Brown", "myexmai.com", "23");

        Account bobsAccount = new Account();

        System.out.println(bobsAccount.getNumber());
        System.out.println(bobsAccount.getBalance());
        /*  Set account details
        bobsAccount.setNumber("123456789");
        bobsAccount.setBalance(1000.0);
        bobsAccount.setCustomerName("Bob Brown");
        bobsAccount.setCustomerEmail("bob@example.com");
        bobsAccount.setCustomerPhone("123-456-7890"); */

        // Test deposit and withdrawal
        bobsAccount.depositFunds(500.0);
        bobsAccount.withdrawalFunds(200.0);
        bobsAccount.withdrawalFunds(1500.0); // This should fail due to insufficient funds
    }
}
